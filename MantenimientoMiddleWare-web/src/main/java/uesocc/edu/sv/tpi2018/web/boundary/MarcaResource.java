/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.MarcaFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Marca;

/**
 *
 * @author danm
 */
@Path("marca")
public class MarcaResource extends AbstractResource<Marca> implements FindByName<Marca> {

    @EJB
    protected MarcaFacadeLocal mfl;
    
    @Override
    protected AbstractInterface<Marca> getFacade() {
        return mfl;
    }

    @Override
    protected Marca crearNuevo() {
        return new Marca();
    }

    @Override
    public AbstractInterface<Marca> getFacadeName() {
        return mfl;
    }
    
}
