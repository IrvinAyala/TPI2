/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ejb.EJB;
import javax.ws.rs.Path;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.DiagnosticoParteFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.DiagnosticoParte;

/**
 *
 * @author andrea
 */
@Path("diagnosticoparte")
public class DiagnosticoParteResource extends AbstractResource<DiagnosticoParte>{
    
    @EJB
    DiagnosticoParteFacadeLocal dpfl;

    @Override
    protected AbstractInterface<DiagnosticoParte> getFacade() {
        return dpfl;
    }

    @Override
    protected DiagnosticoParte crearNuevo() {
        return new DiagnosticoParte();
    }
    
    
}
