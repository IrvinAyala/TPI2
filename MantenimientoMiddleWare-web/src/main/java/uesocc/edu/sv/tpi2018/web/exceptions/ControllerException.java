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
public class ControllerException extends RuntimeException {
    
    public ControllerException(String message){
        super(message);
    }
}
