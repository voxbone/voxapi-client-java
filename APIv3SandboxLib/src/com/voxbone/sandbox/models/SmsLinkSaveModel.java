/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SmsLinkSaveModel 
        implements java.io.Serializable {

    private SmsLinkModel smsLink;
    /** GETTER
     * A representation of smsLink
     */
    @JsonGetter("smsLink")
    public SmsLinkModel getSmsLink ( ) { 
        return this.smsLink;
    }
    
    /** SETTER
     * A representation of smsLink
     */
    @JsonSetter("smsLink")
    public void setSmsLink (SmsLinkModel value) { 
        this.smsLink = value;
    }
 
}
 