/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VoiceUriSaveModel 
        implements java.io.Serializable {

    private int voiceUriId;
    private String backupUriId;
    private String voiceUriProtocol;
    private String uri;
    private String description;
    /** GETTER
     * The identifier of the voice URI
     */
    @JsonGetter("voiceUriId")
    public int getVoiceUriId ( ) { 
        return this.voiceUriId;
    }
    
    /** SETTER
     * The identifier of the voice URI
     */
    @JsonSetter("voiceUriId")
    public void setVoiceUriId (int value) { 
        this.voiceUriId = value;
    }
 
    /** GETTER
     * The identifier of the voice URI used as backup (set to an empty string to remove the backup URI)
     */
    @JsonGetter("backupUriId")
    public String getBackupUriId ( ) { 
        return this.backupUriId;
    }
    
    /** SETTER
     * The identifier of the voice URI used as backup (set to an empty string to remove the backup URI)
     */
    @JsonSetter("backupUriId")
    public void setBackupUriId (String value) { 
        this.backupUriId = value;
    }
 
    /** GETTER
     * The protocol of the voice URI
     */
    @JsonGetter("voiceUriProtocol")
    public String getVoiceUriProtocol ( ) { 
        return this.voiceUriProtocol;
    }
    
    /** SETTER
     * The protocol of the voice URI
     */
    @JsonSetter("voiceUriProtocol")
    public void setVoiceUriProtocol (String value) { 
        this.voiceUriProtocol = value;
    }
 
    /** GETTER
     * The URI where the call will be delivered
     */
    @JsonGetter("uri")
    public String getUri ( ) { 
        return this.uri;
    }
    
    /** SETTER
     * The URI where the call will be delivered
     */
    @JsonSetter("uri")
    public void setUri (String value) { 
        this.uri = value;
    }
 
    /** GETTER
     * A human readable description of the voice URI
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * A human readable description of the voice URI
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
}
 