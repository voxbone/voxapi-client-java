/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class IdModel 
        implements java.io.Serializable {

    private int id;
    /** GETTER
     * The identifier
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * The identifier
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
    }
 
}
 