/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.OrdenTrabajoDetalleEstadoPasoFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalleEstadoPaso;

/**
 *
 * @author andrea
 */
@Path("ordentrabajodetalleestadopaso")
public class OrdenTrabajoDetalleEstadoPasoResource extends AbstractResource<OrdenTrabajoDetalleEstadoPaso>{

    @EJB
    OrdenTrabajoDetalleEstadoPasoFacadeLocal otdepfl;
    
    @Override
    protected AbstractInterface<OrdenTrabajoDetalleEstadoPaso> getFacade() {
        return  otdepfl;
    }

    @Override
    protected OrdenTrabajoDetalleEstadoPaso crearNuevo() {
        return new OrdenTrabajoDetalleEstadoPaso();
    }
    
}
