/*
 * APIv3SandboxLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 03/10/2015
 */
package com.voxbone.sandbox.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FileListModel 
        implements java.io.Serializable {

    private List<String> fileNames;
    /** GETTER
     * The list of file names
     */
    @JsonGetter("fileNames")
    public List<String> getFileNames ( ) { 
        return this.fileNames;
    }
    
    /** SETTER
     * The list of file names
     */
    @JsonSetter("fileNames")
    public void setFileNames (List<String> value) { 
        this.fileNames = value;
    }
 
}
 