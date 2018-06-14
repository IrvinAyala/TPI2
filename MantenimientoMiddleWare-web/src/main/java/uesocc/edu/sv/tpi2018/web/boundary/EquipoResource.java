/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.EquipoFacade;
import uesocc.edu.sv.tpi2018.ejb.controller.EquipoFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Equipo;
import uesocc.edu.sv.tpi2018.ejb.entities.EquipoDetalle;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajo;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerException;

/**
 *
 * @author andrea
 */
@Path("equipo")
public class EquipoResource extends AbstractResource<Equipo>{

    @EJB
    EquipoFacadeLocal efl;
    
    @Override
    protected AbstractInterface<Equipo> getFacade() {
        return efl;
    }

    @Override
    protected Equipo crearNuevo() {
        return new Equipo();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    @Path("{id}/detalle/")
    public List<EquipoDetalle> getDetalle(@PathParam("id") int id){
        return efl.getDetalle(id);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    @Path("{id}/historial")
    public List<OrdenTrabajo> historial(@PathParam("id") int id){
        System.out.println("historial");
        return efl.historial(id);
    }
    
    @GET
    @Path("codigo/{nombre}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
     public List<Equipo> findByName(@PathParam("nombre") String nombre,
            @QueryParam("first") @DefaultValue("0") int first,
            @QueryParam("pagesize") @DefaultValue("50") int pagesize) throws Exception {
        
        if (efl != null) {
            if (pagesize > 0 && first >= 0) {
                List<Equipo> salida = efl.findByCodigoCorrelativoLike(nombre, first, pagesize);
                if (salida != null) {
                    return salida;
                }
                throw new ControllerException(ControllerException.Message.REGISTRO_NO_ENCONTRADO);
            }
            throw new ControllerException(ControllerException.Message.PARAMETRO_INVALIDO);
        }
        throw new NullPointerException("Facade null");

    }
    
    
}
