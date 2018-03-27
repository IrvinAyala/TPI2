/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

/**
 *
 * @author danm
 */
public class ControllerExceptionMapper implements ExceptionMapper<ControllerException>{

    @Override
    public Response toResponse(ControllerException exception) {
        return Response.status(Response.Status.BAD_REQUEST).header("controllerException", exception.getMessage()).build();
    }
    
}
