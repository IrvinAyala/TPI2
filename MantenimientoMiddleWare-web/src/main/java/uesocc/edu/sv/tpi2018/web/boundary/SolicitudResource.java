/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ejb.EJB;
import javax.json.JsonArray;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.SolicitudFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Equipo;
import uesocc.edu.sv.tpi2018.ejb.entities.Solicitud;
import uesocc.edu.sv.tpi2018.web.entities.EquipoEstado;

/**
 *
 * @author andrea
 */
@Path("solicitud")
public class SolicitudResource extends AbstractResource<Solicitud>{

    @EJB
    SolicitudFacadeLocal sfl;
    
    @Override
    protected AbstractInterface<Solicitud> getFacade() {
        return sfl;
    }

    @Override
    protected Solicitud crearNuevo() {
        return new Solicitud();
    }
    
    @GET
    @Path("estado/{id}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<EquipoEstado> obtenerEstado(@PathParam("id") int id){
        List<Object[]> lista = sfl.obtenerEstado(id);
        List<EquipoEstado> listaEquipos = new ArrayList<>();
        System.out.println("lista de object");
        lista.forEach( (Object[] o) -> {
            Equipo e = (Equipo) o[0];
            EquipoEstado es = new EquipoEstado(e, Integer.parseInt(o[1].toString()),Integer.parseInt(o[2].toString()));
            es.setIdModelo(e.getIdModelo());
            es.setIdUnidad(e.getIdUnidad());
            listaEquipos.add(es);
        });

        return listaEquipos;
    }
    
    
    
}
