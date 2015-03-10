/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ZoneListModel 
        implements java.io.Serializable {

    private List<String> zone;
    /** GETTER
     * The list of zones
     */
    @JsonGetter("zone")
    public List<String> getZone ( ) { 
        return this.zone;
    }
    
    /** SETTER
     * The list of zones
     */
    @JsonSetter("zone")
    public void setZone (List<String> value) { 
        this.zone = value;
    }
 
}
 