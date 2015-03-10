/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddressIdentifierModel 
        implements java.io.Serializable {

    private int addressId;
    /** GETTER
     * The address identifier
     */
    @JsonGetter("addressId")
    public int getAddressId ( ) { 
        return this.addressId;
    }
    
    /** SETTER
     * The address identifier
     */
    @JsonSetter("addressId")
    public void setAddressId (int value) { 
        this.addressId = value;
    }
 
}
 