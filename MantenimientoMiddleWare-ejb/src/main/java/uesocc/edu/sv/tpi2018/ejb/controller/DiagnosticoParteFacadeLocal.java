/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.tpi2018.ejb.entities.DiagnosticoParte;

/**
 *
 * @author irvin
 */
@Local
public interface DiagnosticoParteFacadeLocal {

    void create(DiagnosticoParte diagnosticoParte);

    void edit(DiagnosticoParte diagnosticoParte);

    void remove(DiagnosticoParte diagnosticoParte);

    DiagnosticoParte find(Object id);

    List<DiagnosticoParte> findAll();

    List<DiagnosticoParte> findRange(int[] range);

    int count();
    
}
