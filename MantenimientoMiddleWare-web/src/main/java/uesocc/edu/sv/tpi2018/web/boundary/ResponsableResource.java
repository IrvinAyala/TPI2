/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.ResponsableFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Responsable;

/**
 *
 * @author andrea
 */
@Path("responsable")
public class ResponsableResource extends AbstractResource<Responsable> implements FindByName<Responsable>{
   
    @EJB
    ResponsableFacadeLocal rfl;

    @Override
    protected AbstractInterface<Responsable> getFacade() {
        return rfl;
    }

    @Override
    protected Responsable crearNuevo() {
        return new Responsable();
    }

    @Override
    public AbstractInterface<Responsable> getFacadeName() {
        return rfl;
    }
    
}
