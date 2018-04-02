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
public class OrdenTrabajoDetalleEstadoPasoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "id_orden_trabajo_detalle")
    private int idOrdenTrabajoDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_procedimiento_paso")
    private int idProcedimientoPaso;

    public OrdenTrabajoDetalleEstadoPasoPK() {
    }

    public OrdenTrabajoDetalleEstadoPasoPK(int idOrdenTrabajoDetalle, int idProcedimientoPaso) {
        this.idOrdenTrabajoDetalle = idOrdenTrabajoDetalle;
        this.idProcedimientoPaso = idProcedimientoPaso;
    }

    public int getIdOrdenTrabajoDetalle() {
        return idOrdenTrabajoDetalle;
    }

    public void setIdOrdenTrabajoDetalle(int idOrdenTrabajoDetalle) {
        this.idOrdenTrabajoDetalle = idOrdenTrabajoDetalle;
    }

    public int getIdProcedimientoPaso() {
        return idProcedimientoPaso;
    }

    public void setIdProcedimientoPaso(int idProcedimientoPaso) {
        this.idProcedimientoPaso = idProcedimientoPaso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOrdenTrabajoDetalle;
        hash += (int) idProcedimientoPaso;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenTrabajoDetalleEstadoPasoPK)) {
            return false;
        }
        OrdenTrabajoDetalleEstadoPasoPK other = (OrdenTrabajoDetalleEstadoPasoPK) object;
        if (this.idOrdenTrabajoDetalle != other.idOrdenTrabajoDetalle) {
            return false;
        }
        if (this.idProcedimientoPaso != other.idProcedimientoPaso) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entitiesI.OrdenTrabajoDetalleEstadoPasoPK[ idOrdenTrabajoDetalle=" + idOrdenTrabajoDetalle + ", idProcedimientoPaso=" + idProcedimientoPaso + " ]";
    }
    
}
