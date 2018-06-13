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

    public EquipoEstado(Equipo e, int completados, int totales) {
        super(e.getIdEquipo(), e.getCodigoCorrelativo());
        this.completados = completados;
        this.totales = totales;
    }

    public EquipoEstado() {

    }

    public int completados;

    public int totales;

    public int getCompletados() {
        return completados;
    }

    public void setCompletados(int completados) {
        this.completados = completados;
    }

    public int getTotales() {
        return totales;
    }

    public void setTotales(int totales) {
        this.totales = totales;
    }

}
