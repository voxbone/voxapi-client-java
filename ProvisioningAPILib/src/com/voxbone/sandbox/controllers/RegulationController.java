/*
 * ProvisioningAPILib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 01/29/2015
 */
package com.voxbone.sandbox.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.mashape.unirest.request.*;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.voxbone.sandbox.*;
import com.voxbone.sandbox.models.*;

public class RegulationController {
    /**
     * listRegulationAddress is a method that allows you to list or your existing regulation addresses.
     * @param    pageNumber    Required parameter: The page number, starting at 0.
     * @param    pageSize    Required parameter: The page size (max number of entities that are displayed in the response).
     * @param    regulationAddressId    Optional parameter: Identifier of the regulation address id.
     * @param    companyName    Optional parameter: Name of the company.
     * @param    firstName    Optional parameter: First name of the customer.
     * @param    lastName    Optional parameter: Last name of the customer.
     * @param    countryCodeA3    Optional parameter: The three letter identifier for the address's country.
     * @param    city    Optional parameter: The city for the address.
     * @param    zipCode    Optional parameter: The zip code for the address.
     * @param    streetName    Optional parameter: The street for the address.
     * @param    buildingNumber    Optional parameter: The building number for the address.
     * @param    customerReference    Optional parameter: The reference for the customer.
     * @param    status    Optional parameter: The status of the regulation address.
     * @param    linked    Optional parameter: Flag that specifies if the addresses should be linked to a DID.
	 * @return	Returns the JsonNode response from the API call*/
    public Future<JsonNode> listRegulationAddressAsync (
            final String pageNumber,
            final String pageSize,
            final String regulationAddressId,
            final String companyName,
            final String firstName,
            final String lastName,
            final String countryCodeA3,
            final String city,
            final String zipCode,
            final String streetName,
            final String buildingNumber,
            final String customerReference,
            final String status,
            final Boolean linked
            ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/services/rest/regulation/address");

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5250030176876186080L;
            {
                    put( "pageNumber", pageNumber );
                    put( "pageSize", pageSize );
                    put( "regulationAddressId", regulationAddressId );
                    put( "companyName", companyName );
                    put( "firstName", firstName );
                    put( "lastName", lastName );
                    put( "countryCodeA3", countryCodeA3 );
                    put( "city", city );
                    put( "zipCode", zipCode );
                    put( "streetName", streetName );
                    put( "buildingNumber", buildingNumber );
                    put( "customerReference", customerReference );
                    put( "status", status );
                    put( "linked", linked );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = Unirest.get(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json")
                .basicAuth(Configuration.getBasicAuthUserName(), Configuration.getBasicAuthPassword());


        //finalize request for async response
        final HttpRequest requestAsync = request;

        FutureTask<JsonNode> responseTask = new FutureTask<JsonNode>(new Callable<JsonNode>() {
            public JsonNode call() throws IOException, APIException, ExecutionException, InterruptedException {
                //invoke request and get response
                Future<HttpResponse<String>> responseAsync = requestAsync.asStringAsync();

                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody());
        }});

        //execute async using thread pool
        APIHelper.scheduler.execute(responseTask);
        return responseTask;
    }
        
    /**
     * listZipCodes is a method that allows you to get the matching cities and zip codes for a certain country or DID’s area code. This is an absolute requirement for certain countries where the city and zip code will have to match the DID’s area code for instance in Germany (DEU), Croatia (HRV), South Korea (KOR), etc…
     * @param    countryCodeA3    Required parameter: The A3 code of the country to look for zip codes.
     * @param    pageNumber    Required parameter: The page number, starting at 0.
     * @param    pageSize    Required parameter: The page size (max number of entities that are displayed in the response).
     * @param    areaCode    Optional parameter: The area code to look for zip codes.
	 * @return	Returns the JsonNode response from the API call*/
    public Future<JsonNode> listZipCodesAsync (
            final String countryCodeA3,
            final String pageNumber,
            final String pageSize,
            final String areaCode
            ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/services/rest/regulation/zipcode");

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5762440013018096510L;
            {
                    put( "countryCodeA3", countryCodeA3 );
                    put( "pageNumber", pageNumber );
                    put( "pageSize", pageSize );
                    put( "areaCode", areaCode );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = Unirest.get(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json")
                .basicAuth(Configuration.getBasicAuthUserName(), Configuration.getBasicAuthPassword());


        //finalize request for async response
        final HttpRequest requestAsync = request;

        FutureTask<JsonNode> responseTask = new FutureTask<JsonNode>(new Callable<JsonNode>() {
            public JsonNode call() throws IOException, APIException, ExecutionException, InterruptedException {
                //invoke request and get response
                Future<HttpResponse<String>> responseAsync = requestAsync.asStringAsync();

                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody());
        }});

        //execute async using thread pool
        APIHelper.scheduler.execute(responseTask);
        return responseTask;
    }
        
    /**
     * Unlinking regulation address is a different request in REST than linking regulation addresses but the same request in SOAP. The difference is only to set the regulationAddressId field empty.
     * @param    didIds    Required parameter: Array of DID IDs you wish to unlink to a regulation address.
	 * @return	Returns the JsonNode response from the API call*/
    public Future<JsonNode> createUnlinkRegulationAddressAsync (
            final List<String> didIds
            ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/services/rest/regulation/address/unlink");

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequestWithBody request = Unirest.post(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json")
               .header("Content-type", "application/json; charset=utf-8")
                .basicAuth(Configuration.getBasicAuthUserName(), Configuration.getBasicAuthPassword())
               .body(APIHelper.jsonSerialize(didIds));


        //finalize request for async response
        final HttpRequestWithBody requestAsync = request;

        FutureTask<JsonNode> responseTask = new FutureTask<JsonNode>(new Callable<JsonNode>() {
            public JsonNode call() throws IOException, APIException, ExecutionException, InterruptedException {
                //invoke request and get response
                Future<HttpResponse<String>> responseAsync = requestAsync.asStringAsync();

                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody());
        }});

        //execute async using thread pool
        APIHelper.scheduler.execute(responseTask);
        return responseTask;
    }
        
    /**
     * deleteRegulationAddress is a method that allows you to delete a regulation address.
     * @param    regulationAddressId    Required parameter: The regulation address identifier.
	 * @return	Returns the JsonNode response from the API call*/
    public Future<JsonNode> deleteRegulationAddressAsync (
            final String regulationAddressId
            ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/services/rest/regulation/address/{regulationAddressId}");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5737948204117226126L;
            {
                    put( "regulationAddressId", regulationAddressId );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequestWithBody request = Unirest.delete(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json")
                .basicAuth(Configuration.getBasicAuthUserName(), Configuration.getBasicAuthPassword());


        //finalize request for async response
        final HttpRequestWithBody requestAsync = request;

        FutureTask<JsonNode> responseTask = new FutureTask<JsonNode>(new Callable<JsonNode>() {
            public JsonNode call() throws IOException, APIException, ExecutionException, InterruptedException {
                //invoke request and get response
                Future<HttpResponse<String>> responseAsync = requestAsync.asStringAsync();

                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody());
        }});

        //execute async using thread pool
        APIHelper.scheduler.execute(responseTask);
        return responseTask;
    }
        
    /**
     * linkRegulationAddress is a method that allows you to link one or multiple DIDs to a regulation address.
     * @param    regulationAddressId    Required parameter: The identifier of the regulation address.
	 * @return	Returns the JsonNode response from the API call*/
    public Future<JsonNode> createLinkRegulationAddressAsync (
            final String regulationAddressId
            ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/services/rest/regulation/address/{regulationAddressId}/link");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5445723434337501842L;
            {
                    put( "regulationAddressId", regulationAddressId );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequestWithBody request = Unirest.post(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json")
                .basicAuth(Configuration.getBasicAuthUserName(), Configuration.getBasicAuthPassword());


        //finalize request for async response
        final HttpRequestWithBody requestAsync = request;

        FutureTask<JsonNode> responseTask = new FutureTask<JsonNode>(new Callable<JsonNode>() {
            public JsonNode call() throws IOException, APIException, ExecutionException, InterruptedException {
                //invoke request and get response
                Future<HttpResponse<String>> responseAsync = requestAsync.asStringAsync();

                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody());
        }});

        //execute async using thread pool
        APIHelper.scheduler.execute(responseTask);
        return responseTask;
    }
        
    /**
     * uploadProofOfAddress is a method that allows you to separately upload a proof of address after the address is created (the upload is done automatically during the address creation if the document is specified).
     * @param    regulationAddressId    Optional parameter: The identifier of the regulation address.
	 * @return	Returns the JsonNode response from the API call*/
    public Future<JsonNode> uploadProofOfAddressAsync (
            final String regulationAddressId
            ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/services/rest/regulation/address/{regulationAddressId}/proof");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5471335124115063050L;
            {
                    put( "regulationAddressId", regulationAddressId );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequestWithBody request = Unirest.put(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json")
               .header("Content-Type:", "multipart/form-data;boundary=XXX")
                .basicAuth(Configuration.getBasicAuthUserName(), Configuration.getBasicAuthPassword());


        //finalize request for async response
        final HttpRequestWithBody requestAsync = request;

        FutureTask<JsonNode> responseTask = new FutureTask<JsonNode>(new Callable<JsonNode>() {
            public JsonNode call() throws IOException, APIException, ExecutionException, InterruptedException {
                //invoke request and get response
                Future<HttpResponse<String>> responseAsync = requestAsync.asStringAsync();

                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody());
        }});

        //execute async using thread pool
        APIHelper.scheduler.execute(responseTask);
        return responseTask;
    }
        
    /**
     * isAddressValid is a method that allows to check the validity of an address against a certain DID’s type and country. This can be useful if you have originally created an address for a given DID and you wish to reuse that same address for another DID.
     * @param    didType    Required parameter: The did type for the destination did.
     * @param    destinationCountryCodeA3    Required parameter: The three letter identifier for country the destination did.
     * @param    regulationAddressId    Required parameter: The identifier of the regulation address.
	 * @return	Returns the JsonNode response from the API call*/
    public Future<JsonNode> getIsAddressValidAsync (
            final String didType,
            final String destinationCountryCodeA3,
            final String regulationAddressId
            ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/services/rest/regulation/address/{regulationAddressId}/validation");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5706680991954698735L;
            {
                    put( "regulationAddressId", regulationAddressId );
            }});

        //process optional query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5110387049952695057L;
            {
                    put( "didType", didType );
                    put( "destinationCountryCodeA3", destinationCountryCodeA3 );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = Unirest.get(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json")
                .basicAuth(Configuration.getBasicAuthUserName(), Configuration.getBasicAuthPassword());


        //finalize request for async response
        final HttpRequest requestAsync = request;

        FutureTask<JsonNode> responseTask = new FutureTask<JsonNode>(new Callable<JsonNode>() {
            public JsonNode call() throws IOException, APIException, ExecutionException, InterruptedException {
                //invoke request and get response
                Future<HttpResponse<String>> responseAsync = requestAsync.asStringAsync();

                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody());
        }});

        //execute async using thread pool
        APIHelper.scheduler.execute(responseTask);
        return responseTask;
    }
        
    /**
     * requestAddressVerification is a method that allows you to request a separate address verification.
     * @param    regulationAddressId    Required parameter: The identifier of the regulation address.
	 * @return	Returns the JsonNode response from the API call*/
    public Future<JsonNode> updateRequestAddressVerificationAsync (
            final String regulationAddressId
            ) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/services/rest/regulation/address/{regulationAddressId}/verification");

        //process optional query parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4854554198566781846L;
            {
                    put( "regulationAddressId", regulationAddressId );
            }});

        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //prepare and invoke the API call request to fetch the response
        HttpRequestWithBody request = Unirest.put(queryUrl);

        //append request with appropriate headers and parameters
        request.header("User-Agent", "APIMATIC 2.0")
               .header("Accept", "application/json")
                .basicAuth(Configuration.getBasicAuthUserName(), Configuration.getBasicAuthPassword());


        //finalize request for async response
        final HttpRequestWithBody requestAsync = request;

        FutureTask<JsonNode> responseTask = new FutureTask<JsonNode>(new Callable<JsonNode>() {
            public JsonNode call() throws IOException, APIException, ExecutionException, InterruptedException {
                //invoke request and get response
                Future<HttpResponse<String>> responseAsync = requestAsync.asStringAsync();

                //execute and get response from async task
                HttpResponse<String> response = responseAsync.get();

                //Error handling using HTTP status codes
                int responseCode = response.getCode();
                if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                    throw new APIException("HTTP Response Not OK", responseCode);

                return APIHelper.jsonDeserialize(response.getBody());
        }});

        //execute async using thread pool
        APIHelper.scheduler.execute(responseTask);
        return responseTask;
    }
        
}