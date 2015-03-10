/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DidOtherOptionsModel 
        implements java.io.Serializable {

    private boolean t38Enabled;
    private String dtmf;
    private boolean dtmfInbandMute;
    private List<String> codecs;
    /** GETTER
     * A flag indicating if T38 is enabled for the DID
     */
    @JsonGetter("t38Enabled")
    public boolean getT38Enabled ( ) { 
        return this.t38Enabled;
    }
    
    /** SETTER
     * A flag indicating if T38 is enabled for the DID
     */
    @JsonSetter("t38Enabled")
    public void setT38Enabled (boolean value) { 
        this.t38Enabled = value;
    }
 
    /** GETTER
     * The DID's DTMF mode
     */
    @JsonGetter("dtmf")
    public String getDtmf ( ) { 
        return this.dtmf;
    }
    
    /** SETTER
     * The DID's DTMF mode
     */
    @JsonSetter("dtmf")
    public void setDtmf (String value) { 
        this.dtmf = value;
    }
 
    /** GETTER
     * A flag indicating if the DTMF inband mute property is enabled
     */
    @JsonGetter("dtmfInbandMute")
    public boolean getDtmfInbandMute ( ) { 
        return this.dtmfInbandMute;
    }
    
    /** SETTER
     * A flag indicating if the DTMF inband mute property is enabled
     */
    @JsonSetter("dtmfInbandMute")
    public void setDtmfInbandMute (boolean value) { 
        this.dtmfInbandMute = value;
    }
 
    /** GETTER
     * The list of active codecs
     */
    @JsonGetter("codecs")
    public List<String> getCodecs ( ) { 
        return this.codecs;
    }
    
    /** SETTER
     * The list of active codecs
     */
    @JsonSetter("codecs")
    public void setCodecs (List<String> value) { 
        this.codecs = value;
    }
 
}
 