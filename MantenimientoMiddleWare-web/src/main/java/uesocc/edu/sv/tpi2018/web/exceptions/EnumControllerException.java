/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.exceptions;

/**
 *
 * @author danm
 */
public enum EnumControllerException {
    
    MISSING_REQUIRED_FIELD("Missing required field. Please check documentation for required fields"),
    COULD_NOT_CREATE_USER_PROFILE("Could not create user profile"),
    COULD_NOT_UPDATE_USER_PROFILE("Could not update user profile"),
    COULD_NOT_DELETE_USER_PROFILE("Could not delete user profile"),
    NO_RECORD_FOUND("No record found for provided id"),
    RECORD_ALREADY_EXISTS("Record already exists"),
    INTERNAL_SERVER_ERROR("Something went wrong. Please repeat this operation later.");
    
    private String errorMessage;
    
    private EnumControllerException(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    
    

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    
    
    
    
    
}
