/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.PrioridadFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Prioridad;

/**
 *
 * @author andrea
 */
@Path("prioridad")
public class PrioridadResource extends AbstractResource<Prioridad> implements FindByName<Prioridad>{
    
    @EJB
    PrioridadFacadeLocal pfl;

    @Override
    protected AbstractInterface<Prioridad> getFacade() {
        return pfl;
    }

    @Override
    protected Prioridad crearNuevo() {
        return new Prioridad();
    }

    @Override
    public AbstractInterface<Prioridad> getFacadeName() {
        return pfl;
    }
}
