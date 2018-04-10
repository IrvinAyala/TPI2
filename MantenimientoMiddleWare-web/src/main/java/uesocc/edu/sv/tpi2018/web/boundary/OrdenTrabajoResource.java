/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.OrdenTrabajoFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajo;

/**
 *
 * @author andrea
 */
@Path("ordentrabajo")
public class OrdenTrabajoResource extends AbstractResource<OrdenTrabajo>{
    
    @EJB
    OrdenTrabajoFacadeLocal otfl;

    @Override
    protected AbstractInterface<OrdenTrabajo> getFacade() {
        return otfl;
    }

    @Override
    protected OrdenTrabajo crearNuevo() {
        return new OrdenTrabajo();
    }
    
    
}
