/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.PasosFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Pasos;

/**
 *
 * @author andrea
 */
@Path("pasos")
public class PasosResource extends AbstractResource<Pasos> implements FindByName<Pasos>{

    @EJB
    PasosFacadeLocal pfl;
    
    @Override
    protected AbstractInterface<Pasos> getFacade() {
        return pfl;
    }

    @Override
    protected Pasos crearNuevo() {
        return new Pasos();
    }

    @Override
    public AbstractInterface<Pasos> getFacadeName() {
        return pfl;
    }
    
}
