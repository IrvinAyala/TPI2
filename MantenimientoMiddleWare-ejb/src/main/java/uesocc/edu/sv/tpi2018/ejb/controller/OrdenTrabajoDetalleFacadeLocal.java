/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalle;

/**
 *
 * @author irvin
 */
@Local
public interface OrdenTrabajoDetalleFacadeLocal {

    void create(OrdenTrabajoDetalle ordenTrabajoDetalle);

    void edit(OrdenTrabajoDetalle ordenTrabajoDetalle);

    void remove(OrdenTrabajoDetalle ordenTrabajoDetalle);

    OrdenTrabajoDetalle find(Object id);

    List<OrdenTrabajoDetalle> findAll();

    List<OrdenTrabajoDetalle> findRange(int[] range);

    int count();
    
}
