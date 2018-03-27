/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.tpi2018.ejb.entities.ModeloDetalle;

/**
 *
 * @author irvin
 */
@Local
public interface ModeloDetalleFacadeLocal {

    void create(ModeloDetalle modeloDetalle);

    void edit(ModeloDetalle modeloDetalle);

    void remove(ModeloDetalle modeloDetalle);

    ModeloDetalle find(Object id);

    List<ModeloDetalle> findAll();

    List<ModeloDetalle> findRange(int[] range);

    int count();
    
}
