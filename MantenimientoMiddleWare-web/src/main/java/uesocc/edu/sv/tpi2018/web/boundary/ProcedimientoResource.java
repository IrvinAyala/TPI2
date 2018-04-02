/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.ProcedimientoFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Procedimiento;

/**
 *
 * @author andrea
 */
@Path("procedimiento")
public class ProcedimientoResource extends AbstractResource<Procedimiento> implements FindByName<Procedimiento>{

    @EJB
    ProcedimientoFacadeLocal pfl;
    
    @Override
    protected AbstractInterface<Procedimiento> getFacade() {
        return pfl;
    }

    @Override
    protected Procedimiento crearNuevo() {
        return new Procedimiento();
    }

    @Override
    public AbstractInterface<Procedimiento> getFacadeName() {
        return pfl;
    }


    
}
