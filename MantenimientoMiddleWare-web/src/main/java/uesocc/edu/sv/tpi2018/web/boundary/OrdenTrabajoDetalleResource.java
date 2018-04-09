/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.OrdenTrabajoDetalleFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalle;

/**
 *
 * @author andrea
 */
@Path("ordentrabajodetalle")
public class OrdenTrabajoDetalleResource extends AbstractResource<OrdenTrabajoDetalle> {

    @EJB
    OrdenTrabajoDetalleFacadeLocal otdfl;

    @Override
    protected AbstractInterface<OrdenTrabajoDetalle> getFacade() {
        return otdfl;
    }

    @Override
    protected OrdenTrabajoDetalle crearNuevo() {
        return new OrdenTrabajoDetalle();
    }

}
