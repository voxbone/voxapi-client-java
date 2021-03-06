/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CountryModel 
        implements java.io.Serializable {

    private String countryCodeA3;
    private String countryName;
    private boolean hasRegulationRequirement;
    private boolean hasStates;
    private int phoneCode;
    /** GETTER
     * The three letter identifier for the country
     */
    @JsonGetter("countryCodeA3")
    public String getCountryCodeA3 ( ) { 
        return this.countryCodeA3;
    }
    
    /** SETTER
     * The three letter identifier for the country
     */
    @JsonSetter("countryCodeA3")
    public void setCountryCodeA3 (String value) { 
        this.countryCodeA3 = value;
    }
 
    /** GETTER
     * The country name
     */
    @JsonGetter("countryName")
    public String getCountryName ( ) { 
        return this.countryName;
    }
    
    /** SETTER
     * The country name
     */
    @JsonSetter("countryName")
    public void setCountryName (String value) { 
        this.countryName = value;
    }
 
    /** GETTER
     * A flag indicating if there are regulatory requirements in this country
     */
    @JsonGetter("hasRegulationRequirement")
    public boolean getHasRegulationRequirement ( ) { 
        return this.hasRegulationRequirement;
    }
    
    /** SETTER
     * A flag indicating if there are regulatory requirements in this country
     */
    @JsonSetter("hasRegulationRequirement")
    public void setHasRegulationRequirement (boolean value) { 
        this.hasRegulationRequirement = value;
    }
 
    /** GETTER
     * A flag indicating if the country has states
     */
    @JsonGetter("hasStates")
    public boolean getHasStates ( ) { 
        return this.hasStates;
    }
    
    /** SETTER
     * A flag indicating if the country has states
     */
    @JsonSetter("hasStates")
    public void setHasStates (boolean value) { 
        this.hasStates = value;
    }
 
    /** GETTER
     * The international phone code of the country
     */
    @JsonGetter("phoneCode")
    public int getPhoneCode ( ) { 
        return this.phoneCode;
    }
    
    /** SETTER
     * The international phone code of the country
     */
    @JsonSetter("phoneCode")
    public void setPhoneCode (int value) { 
        this.phoneCode = value;
    }
 
}
 