/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingnieria.TPI.definiciones;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author katiro
 */
@Entity
@Table(name = "orden_trabajo_detalle_estado_paso", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenTrabajoDetalleEstadoPaso.findAll", query = "SELECT o FROM OrdenTrabajoDetalleEstadoPaso o")
    , @NamedQuery(name = "OrdenTrabajoDetalleEstadoPaso.findByIdOrdenTrabajoDetalle", query = "SELECT o FROM OrdenTrabajoDetalleEstadoPaso o WHERE o.ordenTrabajoDetalleEstadoPasoPK.idOrdenTrabajoDetalle = :idOrdenTrabajoDetalle")
    , @NamedQuery(name = "OrdenTrabajoDetalleEstadoPaso.findByIdProcedimientoPaso", query = "SELECT o FROM OrdenTrabajoDetalleEstadoPaso o WHERE o.ordenTrabajoDetalleEstadoPasoPK.idProcedimientoPaso = :idProcedimientoPaso")
    , @NamedQuery(name = "OrdenTrabajoDetalleEstadoPaso.findByCompletado", query = "SELECT o FROM OrdenTrabajoDetalleEstadoPaso o WHERE o.completado = :completado")})
public class OrdenTrabajoDetalleEstadoPaso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdenTrabajoDetalleEstadoPasoPK ordenTrabajoDetalleEstadoPasoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "completado")
    private boolean completado;
    @JoinColumn(name = "id_orden_trabajo_detalle", referencedColumnName = "id_orden_trabajo_detalle", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrdenTrabajoDetalle ordenTrabajoDetalle;
    @JoinColumn(name = "id_procedimiento_paso", referencedColumnName = "id_procedimiento_paso", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProcedimientoPaso procedimientoPaso;

    public OrdenTrabajoDetalleEstadoPaso() {
    }

    public OrdenTrabajoDetalleEstadoPaso(OrdenTrabajoDetalleEstadoPasoPK ordenTrabajoDetalleEstadoPasoPK) {
        this.ordenTrabajoDetalleEstadoPasoPK = ordenTrabajoDetalleEstadoPasoPK;
    }

    public OrdenTrabajoDetalleEstadoPaso(OrdenTrabajoDetalleEstadoPasoPK ordenTrabajoDetalleEstadoPasoPK, boolean completado) {
        this.ordenTrabajoDetalleEstadoPasoPK = ordenTrabajoDetalleEstadoPasoPK;
        this.completado = completado;
    }

    public OrdenTrabajoDetalleEstadoPaso(int idOrdenTrabajoDetalle, int idProcedimientoPaso) {
        this.ordenTrabajoDetalleEstadoPasoPK = new OrdenTrabajoDetalleEstadoPasoPK(idOrdenTrabajoDetalle, idProcedimientoPaso);
    }

    public OrdenTrabajoDetalleEstadoPasoPK getOrdenTrabajoDetalleEstadoPasoPK() {
        return ordenTrabajoDetalleEstadoPasoPK;
    }

    public void setOrdenTrabajoDetalleEstadoPasoPK(OrdenTrabajoDetalleEstadoPasoPK ordenTrabajoDetalleEstadoPasoPK) {
        this.ordenTrabajoDetalleEstadoPasoPK = ordenTrabajoDetalleEstadoPasoPK;
    }

    public boolean getCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    public OrdenTrabajoDetalle getOrdenTrabajoDetalle() {
        return ordenTrabajoDetalle;
    }

    public void setOrdenTrabajoDetalle(OrdenTrabajoDetalle ordenTrabajoDetalle) {
        this.ordenTrabajoDetalle = ordenTrabajoDetalle;
    }

    public ProcedimientoPaso getProcedimientoPaso() {
        return procedimientoPaso;
    }

    public void setProcedimientoPaso(ProcedimientoPaso procedimientoPaso) {
        this.procedimientoPaso = procedimientoPaso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordenTrabajoDetalleEstadoPasoPK != null ? ordenTrabajoDetalleEstadoPasoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenTrabajoDetalleEstadoPaso)) {
            return false;
        }
        OrdenTrabajoDetalleEstadoPaso other = (OrdenTrabajoDetalleEstadoPaso) object;
        if ((this.ordenTrabajoDetalleEstadoPasoPK == null && other.ordenTrabajoDetalleEstadoPasoPK != null) || (this.ordenTrabajoDetalleEstadoPasoPK != null && !this.ordenTrabajoDetalleEstadoPasoPK.equals(other.ordenTrabajoDetalleEstadoPasoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.ingnieria.TPI.definiciones.OrdenTrabajoDetalleEstadoPaso[ ordenTrabajoDetalleEstadoPasoPK=" + ordenTrabajoDetalleEstadoPasoPK + " ]";
    }
    
}
