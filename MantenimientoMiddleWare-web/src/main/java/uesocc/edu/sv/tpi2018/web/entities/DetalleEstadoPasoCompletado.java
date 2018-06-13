/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author irvin
 */
@Entity
public class DetalleEstadoPasoCompletado implements Serializable {

    public DetalleEstadoPasoCompletado(String nombrePaso, boolean completado) {
        this.nombrePaso = nombrePaso;
        this.completado = completado;
    }

    public DetalleEstadoPasoCompletado() {

    }
    
    @Id
    public String nombrePaso;
    
    public boolean completado;

    public String getNombrePaso() {
        return nombrePaso;
    }

    public void setNombrePaso(String nombrePaso) {
        this.nombrePaso = nombrePaso;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

}
