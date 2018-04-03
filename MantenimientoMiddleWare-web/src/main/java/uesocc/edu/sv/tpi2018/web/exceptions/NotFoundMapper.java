/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.exceptions;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author danm
 */
@Provider
public class NotFoundMapper implements javax.ws.rs.ext.ExceptionMapper<NotFoundException> {

    public EnumControllerException messages;
    
    @Override
    public Response toResponse(NotFoundException exception) {
        return Response.status(Response.Status.NOT_FOUND).header("ServerException", exception.getMessage()).build();
    }
    
}
