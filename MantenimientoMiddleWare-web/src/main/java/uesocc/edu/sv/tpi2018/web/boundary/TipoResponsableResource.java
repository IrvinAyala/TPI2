/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.TipoResponsableFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.TipoResponsable;

/**
 *
 * @author andrea
 */
@Path("tiporesponsable")
public class TipoResponsableResource extends AbstractResource<TipoResponsable> implements FindByName<TipoResponsable>{
  
    @EJB
    TipoResponsableFacadeLocal trfl;

    @Override
    protected AbstractInterface<TipoResponsable> getFacade() {
        return trfl;
    }

    @Override
    protected TipoResponsable crearNuevo() {
        return new TipoResponsable();
    }

    @Override
    public AbstractInterface<TipoResponsable> getFacadeName() {
        return trfl;
    }
}
