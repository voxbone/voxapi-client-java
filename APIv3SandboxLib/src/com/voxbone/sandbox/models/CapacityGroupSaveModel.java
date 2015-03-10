/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CapacityGroupSaveModel 
        implements java.io.Serializable {

    private int maximumCapacity;
    private String description;
    private int capacityGroupId;
    /** GETTER
     * The maximum capacity for the capacity group
     */
    @JsonGetter("maximumCapacity")
    public int getMaximumCapacity ( ) { 
        return this.maximumCapacity;
    }
    
    /** SETTER
     * The maximum capacity for the capacity group
     */
    @JsonSetter("maximumCapacity")
    public void setMaximumCapacity (int value) { 
        this.maximumCapacity = value;
    }
 
    /** GETTER
     * A human readable description of the capacity group
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * A human readable description of the capacity group
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * The identifier of the capacity group
     */
    @JsonGetter("capacityGroupId")
    public int getCapacityGroupId ( ) { 
        return this.capacityGroupId;
    }
    
    /** SETTER
     * The identifier of the capacity group
     */
    @JsonSetter("capacityGroupId")
    public void setCapacityGroupId (int value) { 
        this.capacityGroupId = value;
    }
 
}
 