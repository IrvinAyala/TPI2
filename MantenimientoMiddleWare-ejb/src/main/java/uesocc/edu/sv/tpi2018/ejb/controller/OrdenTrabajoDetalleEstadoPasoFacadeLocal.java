/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalleEstadoPaso;

/**
 *
 * @author irvin
 */
@Local
public interface OrdenTrabajoDetalleEstadoPasoFacadeLocal extends AbstractInterface<OrdenTrabajoDetalleEstadoPaso> {

    public List<OrdenTrabajoDetalleEstadoPaso> getDetalleEstadoPasoCompletado(String idEquipoDetalle);

}
