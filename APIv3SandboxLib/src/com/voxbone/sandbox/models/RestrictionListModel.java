/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class RestrictionListModel 
        implements java.io.Serializable {

    private List<RestrictionModel> restrictions;
    /** GETTER
     * The list of restrictions
     */
    @JsonGetter("restrictions")
    public List<RestrictionModel> getRestrictions ( ) { 
        return this.restrictions;
    }
    
    /** SETTER
     * The list of restrictions
     */
    @JsonSetter("restrictions")
    public void setRestrictions (List<RestrictionModel> value) { 
        this.restrictions = value;
    }
 
}
 