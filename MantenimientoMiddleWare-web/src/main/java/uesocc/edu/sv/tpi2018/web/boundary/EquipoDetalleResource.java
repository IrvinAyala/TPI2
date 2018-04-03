/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.EquipoDetalleFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.EquipoDetalle;

/**
 *
 * @author andrea
 */
@Path("equipodetalle")
public class EquipoDetalleResource extends AbstractResource<EquipoDetalle> {

    @EJB
    EquipoDetalleFacadeLocal edfl;

    @Override
    protected AbstractInterface<EquipoDetalle> getFacade() {
        return edfl;
    }

    @Override
    protected EquipoDetalle crearNuevo() {
        return new EquipoDetalle();
    }

}
