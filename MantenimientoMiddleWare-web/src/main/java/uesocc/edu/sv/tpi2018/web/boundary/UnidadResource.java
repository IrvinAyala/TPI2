/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.UnidadFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Unidad;

/**
 *
 * @author andrea
 */
@Path("unidad")
public class UnidadResource extends AbstractResource<Unidad> implements FindByName<Unidad>{
    
    @EJB
    UnidadFacadeLocal ufl;

    @Override
    protected AbstractInterface<Unidad> getFacade() {
        return ufl;
    }

    @Override
    protected Unidad crearNuevo() {
        return new Unidad();
    }

    @Override
    public AbstractInterface<Unidad> getFacadeName() {
        return ufl;
    }
    
}
