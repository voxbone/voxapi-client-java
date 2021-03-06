/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PeerModel 
        implements java.io.Serializable {

    private boolean t38Enabled;
    private String dtmf;
    private boolean dtmfInbandMute;
    private String codecs;
    /** GETTER
     * A flag indicating if T38 is enabled
     */
    @JsonGetter("t38Enabled")
    public boolean getT38Enabled ( ) { 
        return this.t38Enabled;
    }
    
    /** SETTER
     * A flag indicating if T38 is enabled
     */
    @JsonSetter("t38Enabled")
    public void setT38Enabled (boolean value) { 
        this.t38Enabled = value;
    }
 
    /** GETTER
     * The DTMF mode for the numbers
     */
    @JsonGetter("dtmf")
    public String getDtmf ( ) { 
        return this.dtmf;
    }
    
    /** SETTER
     * The DTMF mode for the numbers
     */
    @JsonSetter("dtmf")
    public void setDtmf (String value) { 
        this.dtmf = value;
    }
 
    /** GETTER
     * A flag indicating if DTMF inband mute is active
     */
    @JsonGetter("dtmfInbandMute")
    public boolean getDtmfInbandMute ( ) { 
        return this.dtmfInbandMute;
    }
    
    /** SETTER
     * A flag indicating if DTMF inband mute is active
     */
    @JsonSetter("dtmfInbandMute")
    public void setDtmfInbandMute (boolean value) { 
        this.dtmfInbandMute = value;
    }
 
    /** GETTER
     * The list of active codecs for a number
     */
    @JsonGetter("codecs")
    public String getCodecs ( ) { 
        return this.codecs;
    }
    
    /** SETTER
     * The list of active codecs for a number
     */
    @JsonSetter("codecs")
    public void setCodecs (String value) { 
        this.codecs = value;
    }
 
}
 