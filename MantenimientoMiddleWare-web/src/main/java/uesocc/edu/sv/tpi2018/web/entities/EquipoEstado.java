/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.entities;

import java.io.Serializable;
import uesocc.edu.sv.tpi2018.ejb.entities.Equipo;

/**
 *
 * @author danm
 */
public class EquipoEstado extends Equipo implements Serializable {

    public EquipoEstado(Equipo e, int faltantes) {
        super(e.getIdEquipo(), e.getCodigoCorrelativo());
        this.faltantes = faltantes;
        
    }

    public EquipoEstado() {

    }

    public int getFaltantes() {
        return faltantes;
    }

    public void setFaltantes(int faltantes) {
        this.faltantes = faltantes;
    }
    
    

    public int faltantes;

}
