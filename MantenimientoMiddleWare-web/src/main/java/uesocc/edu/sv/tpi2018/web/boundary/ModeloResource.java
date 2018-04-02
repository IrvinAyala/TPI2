/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.ModeloFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Modelo;

/**
 *
 * @author andrea
 */
@Path("modelo")
public class ModeloResource extends AbstractResource<Modelo> implements FindByName<Modelo>{

    @EJB
    ModeloFacadeLocal mfl;
    
    @Override
    protected AbstractInterface<Modelo> getFacade() {
        return mfl;
    }

    @Override
    protected Modelo crearNuevo() {
        return new Modelo();
    }

    @Override
    public AbstractInterface<Modelo> getFacadeName() {
        return mfl;
    }
    
}
