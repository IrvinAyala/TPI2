/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.ModeloDetalleFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.ModeloDetalle;

/**
 *
 * @author andrea
 */
@Path("modelodetalle")
public class ModeloDetalleResource extends AbstractResource<ModeloDetalle>{

    @EJB
    ModeloDetalleFacadeLocal mdfl;
    
    @Override
    protected AbstractInterface<ModeloDetalle> getFacade() {
        return mdfl;
    }

    @Override
    protected ModeloDetalle crearNuevo() {
        return new ModeloDetalle();
    }
    
}
