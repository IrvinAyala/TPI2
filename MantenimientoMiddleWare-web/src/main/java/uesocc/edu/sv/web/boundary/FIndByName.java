/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.web.boundary;

import com.sun.org.glassfish.gmbal.ParameterNames;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author andrea
 */
public interface FIndByName<T> {

    abstract AbstractInterface<T> getFacade();
    
    @GET
    @Path("findbyname/{nombre}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    default T findByName(@PathParam("nombre") String nombre) {
        return getFacade().findByName(nombre);
    }
         
}
