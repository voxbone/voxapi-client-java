/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class StateListModel 
        implements java.io.Serializable {

    private List<StateModel> states;
    /** GETTER
     * The list of states
     */
    @JsonGetter("states")
    public List<StateModel> getStates ( ) { 
        return this.states;
    }
    
    /** SETTER
     * The list of states
     */
    @JsonSetter("states")
    public void setStates (List<StateModel> value) { 
        this.states = value;
    }
 
}
 