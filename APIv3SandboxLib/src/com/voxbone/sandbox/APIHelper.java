/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.mashape.unirest.http.Unirest;

public class APIHelper {
    /* used for async execution of API calls using a thread pool */
    private static ExecutorService scheduler = null;
    private static Object syncRoot = new Object();
  
    /**
     * Singleton access to the threadpool scheduler
     */
    public static ExecutorService getScheduler() {
        synchronized(syncRoot) {
            if(null == scheduler) {
                scheduler = Executors.newCachedThreadPool();
            }
            return scheduler;
        }
    }

    /**
     * Shutdown all the threads
     */
    public static void shutdown() throws IOException {
        if(null != scheduler) {
            scheduler.shutdown();
        }
        Unirest.shutdown();
    }

    /* used for deserialization of json data */
    public static ObjectMapper mapper = new ObjectMapper()
    {
        {
            configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        }
    };

    /**
     * JSON Serialization of a given object.
     * @param	obj		The object to serialize into JSON
     * @return	The		serialized Json string representation of the given object */
    public static String jsonSerialize(Object obj)
            throws JsonProcessingException {
        if(null == obj)
            return null;

        return mapper.writeValueAsString(obj);
    }

    /**
     * JSON Deserialization of the given json string.
     * @param	json	The json string to deserialize
     * @param	<T>	The type of the object to deserialize into
     * @return	The deserialized object */
    public static <T extends Object> T jsonDeserialize(String json, TypeReference<T> typeReference)
            throws IOException {
        if (isNullOrWhiteSpace(json))
            return null;

        return mapper.readValue(json, typeReference);
    }

    /**
     * JSON Deserialization of the given json string.
     * @param	json	The json string to deserialize
     * @return	The deserialized json tree */
    public static JsonNode jsonDeserialize(String json)
            throws IOException {
        if (isNullOrWhiteSpace(json))
            return null;

        return mapper.readTree(json);
    }
    
    /**
     * Replaces template parameters in the given url
     * @param	queryBuilder    The query string builder to replace the template parameters
     * @param	parameters	The parameters to replace in the url */
    public static void appendUrlWithTemplateParameters(StringBuilder queryBuilder, Map<String, Object> parameters) {
        //perform parameter validation
        if (null == queryBuilder)
            throw new IllegalArgumentException("Given value for parameter \"queryBuilder\" is invalid." );

        if (null == parameters)
            return;

        //iterate and append parameters
        for (Map.Entry<String, Object> pair : parameters.entrySet()) {
             String replaceValue = "";

             //load element value as string
             if (null == pair.getValue())
                 replaceValue = "";
             else if (pair.getValue() instanceof Collection<?>)
                 replaceValue = flattenCollection((Collection<?>) pair.getValue(), "%s%s", '/');
             else
                 replaceValue = pair.getValue().toString();

             //find the template parameter and replace it with its value
             replaceAll(queryBuilder, "{" + pair.getKey() + "}", replaceValue);
        }
    }

    /**
     * Appends the given set of parameters to the given query string
     * @param	queryBuilder	The query url string to append the parameters
     * @param	parameters	The parameters to append */
    public static void appendUrlWithQueryParameters(StringBuilder queryBuilder, Map<String, Object> parameters) {
        //perform parameter validation
        if (null == queryBuilder)
            throw new IllegalArgumentException("Given value for parameter \"queryBuilder\" is invalid." );

        if (null == parameters)
            return;

        //does the query string already has parameters
        boolean hasParams = (queryBuilder.indexOf("?") > 0);

        //iterate and append parameters
       for (Map.Entry<String, Object> pair : parameters.entrySet()) {
            //ignore null values
            if (null == pair.getValue())
                continue;
		
            //if already has parameters, use the &amp; to append new parameters
            queryBuilder.append((hasParams) ? '&' : '?');

            //indicate that now the query has some params
            hasParams = true;

            String paramKeyValPair;

            //load element value as string
            if (pair.getValue() instanceof Collection<?>)
                paramKeyValPair = flattenCollection((Collection<?>) pair.getValue(), String.format("%s[]=%%s%%s", pair.getKey()), '&');
            else
                paramKeyValPair = String.format("%s=%s", pair.getKey(), pair.getValue().toString());

            //append keyval pair for current parameter
            queryBuilder.append(paramKeyValPair);
        }
    }

    /**
     * Validates if the string is null, empty or whitespace
     * @param	s	The string to validate
     * @return	The result of validation */
    public static boolean isNullOrWhiteSpace(String s) {
        if(s == null)
            return true;

        int length = s.length();
        if (length > 0) {
            for (int start = 0, middle = length / 2, end = length - 1; start <= middle; start++, end--) {
                if (s.charAt(start) > ' ' || s.charAt(end) > ' ') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Replaces all occurrences of the given string in the string builder
     * @param	stringBuilder The string builder to update with replaced strings
     * @param 	toReplace The string to replace in the string builder
     * @param	replaceWith   The string to replace with */
    public static void replaceAll(StringBuilder stringBuilder, String toReplace, String replaceWith) {
        int index = stringBuilder.indexOf(toReplace);
        
        while (index != -1) {
            stringBuilder.replace(index, index + toReplace.length(), replaceWith);
            index += replaceWith.length(); // Move to the end of the replacement
            index = stringBuilder.indexOf(toReplace, index);
        }
    }
    
    /**
     * Validates and processes the given Url
     * @param    url The given Url to process
     * @return   Pre-process Url as string */
    public static String cleanUrl(StringBuilder url)
    {
        //ensure that the urls are absolute
        Pattern pattern = Pattern.compile("^(https?://[^/]+)");
        Matcher matcher = pattern.matcher(url);
        if (!matcher.find())
            throw new IllegalArgumentException("Invalid Url format.");

        //get the http protocol match
        String protocol = matcher.group(1);

        //remove redundant forward slashes
        String query = url.substring(protocol.length());
        query = query.replaceAll("//+", "/");

        //return process url
        return protocol.concat(query);
    }

    /**
     * Used for flattening a collection of objects into a string
     * @param   array	Array of elements to flatten
     * @param   fmt Format string to use for array flattening
     * @param	separator	Separator to use for string concat
     * @return	Representative string made up of array elements */
    private static String flattenCollection(Collection<?> array, String fmt, char separator) {
        StringBuilder builder = new StringBuilder();

        //append all elements in the array into a string
        for (Object element : array) {
            String elemValue = null;

            //replace null values with empty string to maintain index order
            if (null == element)
                elemValue = "";
            else
                elemValue = element.toString();
					
            builder.append(String.format(fmt, elemValue, separator));
        }

        //remove the last separator, if appended
        if ((builder.length() > 1) && (builder.charAt(builder.length() - 1) == separator))
            builder.deleteCharAt(builder.length() - 1);

        return builder.toString();
    }

    /**
     * Prepares Array style form fields from a given array of values        
     * @param	name	Name of the form field
     * @param 	values	Values for the array form field
     * @return	Dictionary of form fields created from array elements */
    public static Map<String, Object> prepareFormFieldsFromArray(String name, Collection<?> values) {
        Map<String, Object> formFields = new LinkedHashMap<String, Object>();

        //counter for array index
        int index = 0;

        //iterate over all elements and create form array fields
        for (Object element : values) {
            String elemValue = null;

            //replace null values with empty string to maintain index order
            if (null == element)
                elemValue = "";
            else
                elemValue = element.toString();
					
            formFields.put(String.format("%s[%s]", name, index++), elemValue);
        }

        return formFields;
    }
}