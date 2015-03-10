/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FeatureModel 
        implements java.io.Serializable {

    private String description;
    private int featureId;
    private String name;
    /** GETTER
     * The feature description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * The feature description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The feature identifier
     */
    @JsonGetter("featureId")
    public int getFeatureId ( ) { 
        return this.featureId;
    }
    
    /** SETTER
     * The feature identifier
     */
    @JsonSetter("featureId")
    public void setFeatureId (int value) { 
        this.featureId = value;
    }
 
    /** GETTER
     * The feature name
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * The feature name
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
}
 