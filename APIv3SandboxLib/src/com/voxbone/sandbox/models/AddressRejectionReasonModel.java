/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddressRejectionReasonModel 
        implements java.io.Serializable {

    private String code;
    private String message;
    /** GETTER
     * The code for the rejection reason
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * The code for the rejection reason
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * The human readable rejection message
     */
    @JsonGetter("message")
    public String getMessage ( ) { 
        return this.message;
    }
    
    /** SETTER
     * The human readable rejection message
     */
    @JsonSetter("message")
    public void setMessage (String value) { 
        this.message = value;
    }
 
}
 