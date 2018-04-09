/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.DiagnosticoFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Diagnostico;

/**
 *
 * @author andrea
 */
@Path("diagnostico")
public class DiagnosticoResource extends AbstractResource<Diagnostico> implements FindByName<Diagnostico>{
    
    @EJB
    DiagnosticoFacadeLocal dfl;

    @Override
    protected AbstractInterface<Diagnostico> getFacade() {
        return dfl;
    }

    @Override
    protected Diagnostico crearNuevo() {
        return new Diagnostico();
    }

    @Override
    public AbstractInterface<Diagnostico> getFacadeName() {
       return dfl;
    }
    
}
