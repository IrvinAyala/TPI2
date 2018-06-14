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
    public OrdenTrabajoEstado(OrdenTrabajo o, String correlativo){
        super(o.getIdOrdenTrabajo());
        this.setIdEquipo(o.getIdEquipo());
        this.setFecha(o.getFecha());
        this.setIdPrioridad(o.getIdPrioridad());
        this.setIdTipoMantenimiento(o.getIdTipoMantenimiento());
        this.setIdSolicitud(o.getIdSolicitud());
        this.correlativo=correlativo;
    }
    public OrdenTrabajoEstado(){
        
    }
    public String correlativo;

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }
}

  