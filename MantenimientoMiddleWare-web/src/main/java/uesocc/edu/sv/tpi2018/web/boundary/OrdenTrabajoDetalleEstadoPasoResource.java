/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.OrdenTrabajoDetalleEstadoPasoFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalleEstadoPaso;
import uesocc.edu.sv.tpi2018.web.entities.DetalleEstadoPasoCompletado;

/**
 *
 * @author andrea
 */
@Path("ordentrabajodetalleestadopaso")
public class OrdenTrabajoDetalleEstadoPasoResource extends AbstractResource<OrdenTrabajoDetalleEstadoPaso> {

    @EJB
    OrdenTrabajoDetalleEstadoPasoFacadeLocal otdepfl;

    @Override
    protected AbstractInterface<OrdenTrabajoDetalleEstadoPaso> getFacade() {
        return otdepfl;
    }

    @Override
    protected OrdenTrabajoDetalleEstadoPaso crearNuevo() {
        return new OrdenTrabajoDetalleEstadoPaso();
    }

    @GET
    @Path("detalleestadopasocompletado/{idEquipoDetalle}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<DetalleEstadoPasoCompletado> getDetalleEstadoPasoCompletado(@PathParam("idEquipoDetalle") String idEquipoDetalle) {
        List<Object[]> lista = otdepfl.getDetalleEstadoPasoCompletado(idEquipoDetalle);
        List<DetalleEstadoPasoCompletado> listaPasosCompletados = new ArrayList<>();
        lista.forEach((Object[] objeto) -> {
            DetalleEstadoPasoCompletado depc = new DetalleEstadoPasoCompletado(objeto[0].toString(), Boolean.parseBoolean(objeto[1].toString()));
            listaPasosCompletados.add(depc);
        });
        return listaPasosCompletados;
    }

}
