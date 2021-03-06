/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FeatureListModel 
        implements java.io.Serializable {

    private List<FeatureModel> features;
    /** GETTER
     * The list of features
     */
    @JsonGetter("features")
    public List<FeatureModel> getFeatures ( ) { 
        return this.features;
    }
    
    /** SETTER
     * The list of features
     */
    @JsonSetter("features")
    public void setFeatures (List<FeatureModel> value) { 
        this.features = value;
    }
 
}
 