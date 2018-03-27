/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.tpi2018.ejb.entities.ProcedimientoPaso;

/**
 *
 * @author irvin
 */
@Local
public interface ProcedimientoPasoFacadeLocal {

    void create(ProcedimientoPaso procedimientoPaso);

    void edit(ProcedimientoPaso procedimientoPaso);

    void remove(ProcedimientoPaso procedimientoPaso);

    ProcedimientoPaso find(Object id);

    List<ProcedimientoPaso> findAll();

    List<ProcedimientoPaso> findRange(int[] range);

    int count();
    
}
