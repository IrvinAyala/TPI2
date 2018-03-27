/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.tpi2018.ejb.entities.Diagnostico;

/**
 *
 * @author irvin
 */
@Local
public interface DiagnosticoFacadeLocal {

    void create(Diagnostico diagnostico);

    void edit(Diagnostico diagnostico);

    void remove(Diagnostico diagnostico);

    Diagnostico find(Object id);

    List<Diagnostico> findAll();

    List<Diagnostico> findRange(int[] range);

    int count();
    
}
