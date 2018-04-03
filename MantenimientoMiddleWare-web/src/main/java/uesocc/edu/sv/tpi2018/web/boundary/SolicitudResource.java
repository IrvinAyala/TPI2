/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.SolicitudFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Solicitud;

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
    
}
