/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.EquipoFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Equipo;

/**
 *
 * @author andrea
 */
@Path("equipo")
public class EquipoResource extends AbstractResource<Equipo>{

    @EJB
    EquipoFacadeLocal efl;
    
    @Override
    protected AbstractInterface<Equipo> getFacade() {
        return efl;
    }

    @Override
    protected Equipo crearNuevo() {
        return new Equipo();
    }
    
}
