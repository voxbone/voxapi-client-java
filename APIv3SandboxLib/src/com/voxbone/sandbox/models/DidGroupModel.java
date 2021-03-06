/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DidGroupModel 
        implements java.io.Serializable {

    private int didGroupId;
    private String countryCodeA3;
    private Integer stateId;
    private String didType;
    private String cityName;
    private int areaCode;
    private String rateCenter;
    private int stock;
    private int setup100;
    private int monthly100;
    private boolean available;
    private RegulationRequirementModel regulationRequirement;
    private List<FeatureModel> features;
    /** GETTER
     * The didgroup identifier
     */
    @JsonGetter("didGroupId")
    public int getDidGroupId ( ) { 
        return this.didGroupId;
    }
    
    /** SETTER
     * The didgroup identifier
     */
    @JsonSetter("didGroupId")
    public void setDidGroupId (int value) { 
        this.didGroupId = value;
    }
 
    /** GETTER
     * The three letter identifier of the didgroup country
     */
    @JsonGetter("countryCodeA3")
    public String getCountryCodeA3 ( ) { 
        return this.countryCodeA3;
    }
    
    /** SETTER
     * The three letter identifier of the didgroup country
     */
    @JsonSetter("countryCodeA3")
    public void setCountryCodeA3 (String value) { 
        this.countryCodeA3 = value;
    }
 
    /** GETTER
     * The identifier of the didgroup state
     */
    @JsonGetter("stateId")
    public Integer getStateId ( ) { 
        return this.stateId;
    }
    
    /** SETTER
     * The identifier of the didgroup state
     */
    @JsonSetter("stateId")
    public void setStateId (Integer value) { 
        this.stateId = value;
    }
 
    /** GETTER
     * The number type for the didgroup
     */
    @JsonGetter("didType")
    public String getDidType ( ) { 
        return this.didType;
    }
    
    /** SETTER
     * The number type for the didgroup
     */
    @JsonSetter("didType")
    public void setDidType (String value) { 
        this.didType = value;
    }
 
    /** GETTER
     * The name of the didgroup city
     */
    @JsonGetter("cityName")
    public String getCityName ( ) { 
        return this.cityName;
    }
    
    /** SETTER
     * The name of the didgroup city
     */
    @JsonSetter("cityName")
    public void setCityName (String value) { 
        this.cityName = value;
    }
 
    /** GETTER
     * The area code for the didgroup
     */
    @JsonGetter("areaCode")
    public int getAreaCode ( ) { 
        return this.areaCode;
    }
    
    /** SETTER
     * The area code for the didgroup
     */
    @JsonSetter("areaCode")
    public void setAreaCode (int value) { 
        this.areaCode = value;
    }
 
    /** GETTER
     * The name of the ratecenter for the didgroup
     */
    @JsonGetter("rateCenter")
    public String getRateCenter ( ) { 
        return this.rateCenter;
    }
    
    /** SETTER
     * The name of the ratecenter for the didgroup
     */
    @JsonSetter("rateCenter")
    public void setRateCenter (String value) { 
        this.rateCenter = value;
    }
 
    /** GETTER
     * The current available stock of the didgroup
     */
    @JsonGetter("stock")
    public int getStock ( ) { 
        return this.stock;
    }
    
    /** SETTER
     * The current available stock of the didgroup
     */
    @JsonSetter("stock")
    public void setStock (int value) { 
        this.stock = value;
    }
 
    /** GETTER
     * The setup price in cents per number for the didgroup
     */
    @JsonGetter("setup100")
    public int getSetup100 ( ) { 
        return this.setup100;
    }
    
    /** SETTER
     * The setup price in cents per number for the didgroup
     */
    @JsonSetter("setup100")
    public void setSetup100 (int value) { 
        this.setup100 = value;
    }
 
    /** GETTER
     * The monthly price in cents per number for the didgroup
     */
    @JsonGetter("monthly100")
    public int getMonthly100 ( ) { 
        return this.monthly100;
    }
    
    /** SETTER
     * The monthly price in cents per number for the didgroup
     */
    @JsonSetter("monthly100")
    public void setMonthly100 (int value) { 
        this.monthly100 = value;
    }
 
    /** GETTER
     * A flag indicating if there are available numbers in this didgroup
     */
    @JsonGetter("available")
    public boolean getAvailable ( ) { 
        return this.available;
    }
    
    /** SETTER
     * A flag indicating if there are available numbers in this didgroup
     */
    @JsonSetter("available")
    public void setAvailable (boolean value) { 
        this.available = value;
    }
 
    /** GETTER
     * The regulation requirements for the didgroup
     */
    @JsonGetter("regulationRequirement")
    public RegulationRequirementModel getRegulationRequirement ( ) { 
        return this.regulationRequirement;
    }
    
    /** SETTER
     * The regulation requirements for the didgroup
     */
    @JsonSetter("regulationRequirement")
    public void setRegulationRequirement (RegulationRequirementModel value) { 
        this.regulationRequirement = value;
    }
 
    /** GETTER
     * The list of features supported by the didgroup
     */
    @JsonGetter("features")
    public List<FeatureModel> getFeatures ( ) { 
        return this.features;
    }
    
    /** SETTER
     * The list of features supported by the didgroup
     */
    @JsonSetter("features")
    public void setFeatures (List<FeatureModel> value) { 
        this.features = value;
    }
 
}
 