/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import com.sun.org.glassfish.gmbal.ParameterNames;
import java.util.List;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerException;

/**
 *
 * @author andrea
 */
public interface FIndByName<T> {

    abstract AbstractInterface<T> getFacade();

    @GET
    @Path("findbyname/{nombre}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    default List<T> findByName(@PathParam("nombre") String nombre,
            @QueryParam("first") @DefaultValue("1") int first,
            @QueryParam("pagesize") @DefaultValue("50") int pagesize) {
        return getFacade().findByName(nombre, first, pagesize);
    }

}
