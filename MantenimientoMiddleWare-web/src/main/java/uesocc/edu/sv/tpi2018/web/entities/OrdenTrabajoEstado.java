/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.entities;

import java.io.Serializable;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajo;

/**
 *
 * @author andrea
 */
public class OrdenTrabajoEstado extends OrdenTrabajo implements Serializable{
    public OrdenTrabajoEstado(OrdenTrabajo o, int completados, int totales){
        super(o.getIdOrdenTrabajo());
        this.setIdEquipo(o.getIdEquipo());
        this.completados= completados;
        this.totales= totales;
    }
    public OrdenTrabajoEstado(){
        
    }
    int completados;
    int totales;

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
