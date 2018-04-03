/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.ProcedimientoPasoFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.ProcedimientoPaso;

/**
 *
 * @author andrea
 */
@Path("procedimientopaso")
public class ProcedimientoPasoResource extends AbstractResource<ProcedimientoPaso>{

    @EJB
    ProcedimientoPasoFacadeLocal ppfl;
    
    @Override
    protected AbstractInterface<ProcedimientoPaso> getFacade() {
        return ppfl;
    }

    @Override
    protected ProcedimientoPaso crearNuevo() {
        return new ProcedimientoPaso();
    }
    
}
