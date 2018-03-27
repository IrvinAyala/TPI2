/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author irvin
 */
@Embeddable
public class ModeloDetallePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_modelo")
    private int idModelo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_articulo")
    private int idArticulo;

    public ModeloDetallePK() {
    }

    public ModeloDetallePK(int idModelo, int idArticulo) {
        this.idModelo = idModelo;
        this.idArticulo = idArticulo;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idModelo;
        hash += (int) idArticulo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModeloDetallePK)) {
            return false;
        }
        ModeloDetallePK other = (ModeloDetallePK) object;
        if (this.idModelo != other.idModelo) {
            return false;
        }
        if (this.idArticulo != other.idArticulo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entities.ModeloDetallePK[ idModelo=" + idModelo + ", idArticulo=" + idArticulo + " ]";
    }
    
}
