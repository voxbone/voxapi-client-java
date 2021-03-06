/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddressModel 
        implements java.io.Serializable {

    private String salutation;
    private String companyName;
    private String companyDescription;
    private String firstName;
    private String lastName;
    private String countryCodeA3;
    private String city;
    private String zipCode;
    private String streetName;
    private String buildingNumber;
    private String buildingLetter;
    private String customerReference;
    private List<AddressExtraFieldModel> extraFields;
    private String didType;
    private String destinationCountryCodeA3;
    /** GETTER
     * The salutation to use with this address
     */
    @JsonGetter("salutation")
    public String getSalutation ( ) { 
        return this.salutation;
    }
    
    /** SETTER
     * The salutation to use with this address
     */
    @JsonSetter("salutation")
    public void setSalutation (String value) { 
        this.salutation = value;
    }
 
    /** GETTER
     * The name of the company residing at this address
     */
    @JsonGetter("companyName")
    public String getCompanyName ( ) { 
        return this.companyName;
    }
    
    /** SETTER
     * The name of the company residing at this address
     */
    @JsonSetter("companyName")
    public void setCompanyName (String value) { 
        this.companyName = value;
    }
 
    /** GETTER
     * The description of the company residing at this address
     */
    @JsonGetter("companyDescription")
    public String getCompanyDescription ( ) { 
        return this.companyDescription;
    }
    
    /** SETTER
     * The description of the company residing at this address
     */
    @JsonSetter("companyDescription")
    public void setCompanyDescription (String value) { 
        this.companyDescription = value;
    }
 
    /** GETTER
     * The first name of the person residing at this address
     */
    @JsonGetter("firstName")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * The first name of the person residing at this address
     */
    @JsonSetter("firstName")
    public void setFirstName (String value) { 
        this.firstName = value;
    }
 
    /** GETTER
     * The last name of the person residing at this address
     */
    @JsonGetter("lastName")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * The last name of the person residing at this address
     */
    @JsonSetter("lastName")
    public void setLastName (String value) { 
        this.lastName = value;
    }
 
    /** GETTER
     * The three letter identifier for the address country
     */
    @JsonGetter("countryCodeA3")
    public String getCountryCodeA3 ( ) { 
        return this.countryCodeA3;
    }
    
    /** SETTER
     * The three letter identifier for the address country
     */
    @JsonSetter("countryCodeA3")
    public void setCountryCodeA3 (String value) { 
        this.countryCodeA3 = value;
    }
 
    /** GETTER
     * The name of the address city
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * The name of the address city
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * The zip code
     */
    @JsonGetter("zipCode")
    public String getZipCode ( ) { 
        return this.zipCode;
    }
    
    /** SETTER
     * The zip code
     */
    @JsonSetter("zipCode")
    public void setZipCode (String value) { 
        this.zipCode = value;
    }
 
    /** GETTER
     * The street name
     */
    @JsonGetter("streetName")
    public String getStreetName ( ) { 
        return this.streetName;
    }
    
    /** SETTER
     * The street name
     */
    @JsonSetter("streetName")
    public void setStreetName (String value) { 
        this.streetName = value;
    }
 
    /** GETTER
     * The building number
     */
    @JsonGetter("buildingNumber")
    public String getBuildingNumber ( ) { 
        return this.buildingNumber;
    }
    
    /** SETTER
     * The building number
     */
    @JsonSetter("buildingNumber")
    public void setBuildingNumber (String value) { 
        this.buildingNumber = value;
    }
 
    /** GETTER
     * The building letter
     */
    @JsonGetter("buildingLetter")
    public String getBuildingLetter ( ) { 
        return this.buildingLetter;
    }
    
    /** SETTER
     * The building letter
     */
    @JsonSetter("buildingLetter")
    public void setBuildingLetter (String value) { 
        this.buildingLetter = value;
    }
 
    /** GETTER
     * A human readable description of the address
     */
    @JsonGetter("customerReference")
    public String getCustomerReference ( ) { 
        return this.customerReference;
    }
    
    /** SETTER
     * A human readable description of the address
     */
    @JsonSetter("customerReference")
    public void setCustomerReference (String value) { 
        this.customerReference = value;
    }
 
    /** GETTER
     * A list of extra fields
     */
    @JsonGetter("extraFields")
    public List<AddressExtraFieldModel> getExtraFields ( ) { 
        return this.extraFields;
    }
    
    /** SETTER
     * A list of extra fields
     */
    @JsonSetter("extraFields")
    public void setExtraFields (List<AddressExtraFieldModel> value) { 
        this.extraFields = value;
    }
 
    /** GETTER
     * The type of numbers this address will be used with
     */
    @JsonGetter("didType")
    public String getDidType ( ) { 
        return this.didType;
    }
    
    /** SETTER
     * The type of numbers this address will be used with
     */
    @JsonSetter("didType")
    public void setDidType (String value) { 
        this.didType = value;
    }
 
    /** GETTER
     * The three letter identifier for the country in which numbers will be used with this address
     */
    @JsonGetter("destinationCountryCodeA3")
    public String getDestinationCountryCodeA3 ( ) { 
        return this.destinationCountryCodeA3;
    }
    
    /** SETTER
     * The three letter identifier for the country in which numbers will be used with this address
     */
    @JsonSetter("destinationCountryCodeA3")
    public void setDestinationCountryCodeA3 (String value) { 
        this.destinationCountryCodeA3 = value;
    }
 
}
 