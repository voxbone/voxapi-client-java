/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DidModel 
        implements java.io.Serializable {

    private int didId;
    private String e164;
    private String didType;
    private String countryCodeA3;
    private String cityName;
    private String areaCode;
    private Integer voiceUriId;
    private Integer faxUriId;
    private Integer smsLinkGroupId;
    private String orderReference;
    private int channels;
    private String delivery;
    private int trunkId;
    private Integer capacityGroupId;
    private int didGroupId;
    private Integer regulationAddressId;
    private boolean srvLookup;
    private boolean dnisEnabled;
    private boolean blockOrdinary;
    private boolean blockCellular;
    private boolean blockPayphone;
    private boolean smsOutbound;
    private boolean webRtc;
    private CallerIdModel callerId;
    private String cliPrivacy;
    private DidOtherOptionsModel otherOptions;
    /** GETTER
     * The identifier of the DID
     */
    @JsonGetter("didId")
    public int getDidId ( ) { 
        return this.didId;
    }
    
    /** SETTER
     * The identifier of the DID
     */
    @JsonSetter("didId")
    public void setDidId (int value) { 
        this.didId = value;
    }
 
    /** GETTER
     * The E164 of the DID
     */
    @JsonGetter("e164")
    public String getE164 ( ) { 
        return this.e164;
    }
    
    /** SETTER
     * The E164 of the DID
     */
    @JsonSetter("e164")
    public void setE164 (String value) { 
        this.e164 = value;
    }
 
    /** GETTER
     * The DID type
     */
    @JsonGetter("didType")
    public String getDidType ( ) { 
        return this.didType;
    }
    
    /** SETTER
     * The DID type
     */
    @JsonSetter("didType")
    public void setDidType (String value) { 
        this.didType = value;
    }
 
    /** GETTER
     * The three letter identifier for the DID's country
     */
    @JsonGetter("countryCodeA3")
    public String getCountryCodeA3 ( ) { 
        return this.countryCodeA3;
    }
    
    /** SETTER
     * The three letter identifier for the DID's country
     */
    @JsonSetter("countryCodeA3")
    public void setCountryCodeA3 (String value) { 
        this.countryCodeA3 = value;
    }
 
    /** GETTER
     * The name of the DID's city
     */
    @JsonGetter("cityName")
    public String getCityName ( ) { 
        return this.cityName;
    }
    
    /** SETTER
     * The name of the DID's city
     */
    @JsonSetter("cityName")
    public void setCityName (String value) { 
        this.cityName = value;
    }
 
    /** GETTER
     * The DID's area code
     */
    @JsonGetter("areaCode")
    public String getAreaCode ( ) { 
        return this.areaCode;
    }
    
    /** SETTER
     * The DID's area code
     */
    @JsonSetter("areaCode")
    public void setAreaCode (String value) { 
        this.areaCode = value;
    }
 
    /** GETTER
     * The identifier of the voice uri the DID is mapped to
     */
    @JsonGetter("voiceUriId")
    public Integer getVoiceUriId ( ) { 
        return this.voiceUriId;
    }
    
    /** SETTER
     * The identifier of the voice uri the DID is mapped to
     */
    @JsonSetter("voiceUriId")
    public void setVoiceUriId (Integer value) { 
        this.voiceUriId = value;
    }
 
    /** GETTER
     * The identifier of the fax uri the DID is mapped to
     */
    @JsonGetter("faxUriId")
    public Integer getFaxUriId ( ) { 
        return this.faxUriId;
    }
    
    /** SETTER
     * The identifier of the fax uri the DID is mapped to
     */
    @JsonSetter("faxUriId")
    public void setFaxUriId (Integer value) { 
        this.faxUriId = value;
    }
 
    /** GETTER
     * The identifier of the sms link group the DID is mapped to
     */
    @JsonGetter("smsLinkGroupId")
    public Integer getSmsLinkGroupId ( ) { 
        return this.smsLinkGroupId;
    }
    
    /** SETTER
     * The identifier of the sms link group the DID is mapped to
     */
    @JsonSetter("smsLinkGroupId")
    public void setSmsLinkGroupId (Integer value) { 
        this.smsLinkGroupId = value;
    }
 
    /** GETTER
     * The reference for the DID's order
     */
    @JsonGetter("orderReference")
    public String getOrderReference ( ) { 
        return this.orderReference;
    }
    
    /** SETTER
     * The reference for the DID's order
     */
    @JsonSetter("orderReference")
    public void setOrderReference (String value) { 
        this.orderReference = value;
    }
 
    /** GETTER
     * The amount of channels available for this DID
     */
    @JsonGetter("channels")
    public int getChannels ( ) { 
        return this.channels;
    }
    
    /** SETTER
     * The amount of channels available for this DID
     */
    @JsonSetter("channels")
    public void setChannels (int value) { 
        this.channels = value;
    }
 
    /** GETTER
     * The POP the DID is currently mapped to
     */
    @JsonGetter("delivery")
    public String getDelivery ( ) { 
        return this.delivery;
    }
    
    /** SETTER
     * The POP the DID is currently mapped to
     */
    @JsonSetter("delivery")
    public void setDelivery (String value) { 
        this.delivery = value;
    }
 
    /** GETTER
     * The identifier for the trunk the DID is currently mapped to
     */
    @JsonGetter("trunkId")
    public int getTrunkId ( ) { 
        return this.trunkId;
    }
    
    /** SETTER
     * The identifier for the trunk the DID is currently mapped to
     */
    @JsonSetter("trunkId")
    public void setTrunkId (int value) { 
        this.trunkId = value;
    }
 
    /** GETTER
     * The identifier for the capacity group the DID is currently mapped to
     */
    @JsonGetter("capacityGroupId")
    public Integer getCapacityGroupId ( ) { 
        return this.capacityGroupId;
    }
    
    /** SETTER
     * The identifier for the capacity group the DID is currently mapped to
     */
    @JsonSetter("capacityGroupId")
    public void setCapacityGroupId (Integer value) { 
        this.capacityGroupId = value;
    }
 
    /** GETTER
     * The identifier for the DID's didGroup
     */
    @JsonGetter("didGroupId")
    public int getDidGroupId ( ) { 
        return this.didGroupId;
    }
    
    /** SETTER
     * The identifier for the DID's didGroup
     */
    @JsonSetter("didGroupId")
    public void setDidGroupId (int value) { 
        this.didGroupId = value;
    }
 
    /** GETTER
     * The identifier for the address linked to this DID
     */
    @JsonGetter("regulationAddressId")
    public Integer getRegulationAddressId ( ) { 
        return this.regulationAddressId;
    }
    
    /** SETTER
     * The identifier for the address linked to this DID
     */
    @JsonSetter("regulationAddressId")
    public void setRegulationAddressId (Integer value) { 
        this.regulationAddressId = value;
    }
 
    /** GETTER
     * A flag indicating if the DID uses srv lookup
     */
    @JsonGetter("srvLookup")
    public boolean getSrvLookup ( ) { 
        return this.srvLookup;
    }
    
    /** SETTER
     * A flag indicating if the DID uses srv lookup
     */
    @JsonSetter("srvLookup")
    public void setSrvLookup (boolean value) { 
        this.srvLookup = value;
    }
 
    /** GETTER
     * A flag indicating if dnis is enabled for the DID
     */
    @JsonGetter("dnisEnabled")
    public boolean getDnisEnabled ( ) { 
        return this.dnisEnabled;
    }
    
    /** SETTER
     * A flag indicating if dnis is enabled for the DID
     */
    @JsonSetter("dnisEnabled")
    public void setDnisEnabled (boolean value) { 
        this.dnisEnabled = value;
    }
 
    /** GETTER
     * A flag indicating if ordinary calls are blocked on this DID
     */
    @JsonGetter("blockOrdinary")
    public boolean getBlockOrdinary ( ) { 
        return this.blockOrdinary;
    }
    
    /** SETTER
     * A flag indicating if ordinary calls are blocked on this DID
     */
    @JsonSetter("blockOrdinary")
    public void setBlockOrdinary (boolean value) { 
        this.blockOrdinary = value;
    }
 
    /** GETTER
     * A flag indicating if cellular calls are blocked on this DID
     */
    @JsonGetter("blockCellular")
    public boolean getBlockCellular ( ) { 
        return this.blockCellular;
    }
    
    /** SETTER
     * A flag indicating if cellular calls are blocked on this DID
     */
    @JsonSetter("blockCellular")
    public void setBlockCellular (boolean value) { 
        this.blockCellular = value;
    }
 
    /** GETTER
     * A flag indicating if payphone calls are blocked on this DID
     */
    @JsonGetter("blockPayphone")
    public boolean getBlockPayphone ( ) { 
        return this.blockPayphone;
    }
    
    /** SETTER
     * A flag indicating if payphone calls are blocked on this DID
     */
    @JsonSetter("blockPayphone")
    public void setBlockPayphone (boolean value) { 
        this.blockPayphone = value;
    }
 
    /** GETTER
     * A flag indicating if SMS Outbound is activated on this DID
     */
    @JsonGetter("smsOutbound")
    public boolean getSmsOutbound ( ) { 
        return this.smsOutbound;
    }
    
    /** SETTER
     * A flag indicating if SMS Outbound is activated on this DID
     */
    @JsonSetter("smsOutbound")
    public void setSmsOutbound (boolean value) { 
        this.smsOutbound = value;
    }
 
    /** GETTER
     * A flag indicating if WebRTC is activated on this DID
     */
    @JsonGetter("webRtc")
    public boolean getWebRtc ( ) { 
        return this.webRtc;
    }
    
    /** SETTER
     * A flag indicating if WebRTC is activated on this DID
     */
    @JsonSetter("webRtc")
    public void setWebRtc (boolean value) { 
        this.webRtc = value;
    }
 
    /** GETTER
     * The DID's caller id settings
     */
    @JsonGetter("callerId")
    public CallerIdModel getCallerId ( ) { 
        return this.callerId;
    }
    
    /** SETTER
     * The DID's caller id settings
     */
    @JsonSetter("callerId")
    public void setCallerId (CallerIdModel value) { 
        this.callerId = value;
    }
 
    /** GETTER
     * The DID's cli privacy settings
     */
    @JsonGetter("cliPrivacy")
    public String getCliPrivacy ( ) { 
        return this.cliPrivacy;
    }
    
    /** SETTER
     * The DID's cli privacy settings
     */
    @JsonSetter("cliPrivacy")
    public void setCliPrivacy (String value) { 
        this.cliPrivacy = value;
    }
 
    /** GETTER
     * The DID's in-call configuration
     */
    @JsonGetter("otherOptions")
    public DidOtherOptionsModel getOtherOptions ( ) { 
        return this.otherOptions;
    }
    
    /** SETTER
     * The DID's in-call configuration
     */
    @JsonSetter("otherOptions")
    public void setOtherOptions (DidOtherOptionsModel value) { 
        this.otherOptions = value;
    }
 
}
 