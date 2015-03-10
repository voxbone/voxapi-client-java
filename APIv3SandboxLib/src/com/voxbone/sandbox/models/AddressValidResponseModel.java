/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddressValidResponseModel 
        implements java.io.Serializable {

    private boolean isValid;
    private List<AddressRejectionReasonModel> reasons;
    /** GETTER
     * A flag indicating if the address is valid
     */
    @JsonGetter("isValid")
    public boolean getIsValid ( ) { 
        return this.isValid;
    }
    
    /** SETTER
     * A flag indicating if the address is valid
     */
    @JsonSetter("isValid")
    public void setIsValid (boolean value) { 
        this.isValid = value;
    }
 
    /** GETTER
     * The list of reasons for which the address was rejected
     */
    @JsonGetter("reasons")
    public List<AddressRejectionReasonModel> getReasons ( ) { 
        return this.reasons;
    }
    
    /** SETTER
     * The list of reasons for which the address was rejected
     */
    @JsonSetter("reasons")
    public void setReasons (List<AddressRejectionReasonModel> value) { 
        this.reasons = value;
    }
 
}
 