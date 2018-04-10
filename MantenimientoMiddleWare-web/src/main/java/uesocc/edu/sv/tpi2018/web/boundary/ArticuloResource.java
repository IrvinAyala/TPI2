/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.ArticuloFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Articulo;

/**
 *
 * @author andrea
 */
@Path("articulo")
public class ArticuloResource extends AbstractResource<Articulo> implements FindByName<Articulo>{
    
    @EJB
    ArticuloFacadeLocal afl;

    @Override
    protected AbstractInterface<Articulo> getFacade() {
        return afl;
    }

    @Override
    protected Articulo crearNuevo() {
        return new Articulo();
    }

    @Override
    public AbstractInterface<Articulo> getFacadeName() {
        return afl;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    @Path("posiblesSegunIdEquipo/{idEquipo}")
    public List<Articulo> findByIdEquipo(@PathParam("idEquipo") int idEquipo){
         return afl.findByIdEquipo(idEquipo);
     }
    
}
