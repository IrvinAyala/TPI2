/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author irvin
 */
@Entity
@Table(name = "orden_trabajo_detalle", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenTrabajoDetalle.findAll", query = "SELECT o FROM OrdenTrabajoDetalle o")
    , @NamedQuery(name = "OrdenTrabajoDetalle.findByIdOrdenTrabajoDetalle", query = "SELECT o FROM OrdenTrabajoDetalle o WHERE o.idOrdenTrabajoDetalle = :idOrdenTrabajoDetalle")
    , @NamedQuery(name = "OrdenTrabajoDetalle.findByIdEquipoDetalle", query = "SELECT o FROM OrdenTrabajoDetalle o WHERE o.idEquipoDetalle = :idEquipoDetalle")
    , @NamedQuery(name = "OrdenTrabajoDetalle.findByObservacion", query = "SELECT o FROM OrdenTrabajoDetalle o WHERE o.observacion = :observacion")})
public class OrdenTrabajoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orden_trabajo_detalle")
    private Integer idOrdenTrabajoDetalle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "id_equipo_detalle")
    private String idEquipoDetalle;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenTrabajoDetalle")
    private List<OrdenTrabajoDetalleEstadoPaso> ordenTrabajoDetalleEstadoPasoList;
    @JoinColumn(name = "id_orden_trabajo", referencedColumnName = "id_orden_trabajo")
    @ManyToOne(optional = false)
    private OrdenTrabajo idOrdenTrabajo;
    @JoinColumn(name = "id_responsable", referencedColumnName = "id_responsable")
    @ManyToOne(optional = false)
    private Responsable idResponsable;

    public OrdenTrabajoDetalle() {
    }

    public OrdenTrabajoDetalle(Integer idOrdenTrabajoDetalle) {
        this.idOrdenTrabajoDetalle = idOrdenTrabajoDetalle;
    }

    public OrdenTrabajoDetalle(Integer idOrdenTrabajoDetalle, String idEquipoDetalle) {
        this.idOrdenTrabajoDetalle = idOrdenTrabajoDetalle;
        this.idEquipoDetalle = idEquipoDetalle;
    }

    public Integer getIdOrdenTrabajoDetalle() {
        return idOrdenTrabajoDetalle;
    }

    public void setIdOrdenTrabajoDetalle(Integer idOrdenTrabajoDetalle) {
        this.idOrdenTrabajoDetalle = idOrdenTrabajoDetalle;
    }

    public String getIdEquipoDetalle() {
        return idEquipoDetalle;
    }

    public void setIdEquipoDetalle(String idEquipoDetalle) {
        this.idEquipoDetalle = idEquipoDetalle;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @XmlTransient
    public List<OrdenTrabajoDetalleEstadoPaso> getOrdenTrabajoDetalleEstadoPasoList() {
        return ordenTrabajoDetalleEstadoPasoList;
    }

    public void setOrdenTrabajoDetalleEstadoPasoList(List<OrdenTrabajoDetalleEstadoPaso> ordenTrabajoDetalleEstadoPasoList) {
        this.ordenTrabajoDetalleEstadoPasoList = ordenTrabajoDetalleEstadoPasoList;
    }

    public OrdenTrabajo getIdOrdenTrabajo() {
        return idOrdenTrabajo;
    }

    public void setIdOrdenTrabajo(OrdenTrabajo idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    public Responsable getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Responsable idResponsable) {
        this.idResponsable = idResponsable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdenTrabajoDetalle != null ? idOrdenTrabajoDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenTrabajoDetalle)) {
            return false;
        }
        OrdenTrabajoDetalle other = (OrdenTrabajoDetalle) object;
        if ((this.idOrdenTrabajoDetalle == null && other.idOrdenTrabajoDetalle != null) || (this.idOrdenTrabajoDetalle != null && !this.idOrdenTrabajoDetalle.equals(other.idOrdenTrabajoDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entitiesI.OrdenTrabajoDetalle[ idOrdenTrabajoDetalle=" + idOrdenTrabajoDetalle + " ]";
    }
    
}
