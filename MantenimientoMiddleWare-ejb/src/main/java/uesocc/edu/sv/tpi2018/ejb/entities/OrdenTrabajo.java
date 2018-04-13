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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author irvin
 */
@Entity
@Table(name = "orden_trabajo", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdenTrabajo.findAll", query = "SELECT o FROM OrdenTrabajo o")
    , @NamedQuery(name = "OrdenTrabajo.findByIdOrdenTrabajo", query = "SELECT o FROM OrdenTrabajo o WHERE o.idOrdenTrabajo = :idOrdenTrabajo")})
public class OrdenTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_orden_trabajo")
    private Integer idOrdenTrabajo;
    @Basic(optional = false)
    @Column(name = "id_equipo")
    private Integer idEquipo;

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }
    @JoinColumn(name = "id_prioridad", referencedColumnName = "id_prioridad")
    @ManyToOne(optional = false)
    private Prioridad idPrioridad;
    @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud")
    @ManyToOne(optional = false)
    private Solicitud idSolicitud;
    @JoinColumn(name = "id_tipo_mantenimiento", referencedColumnName = "id_tipo_mantenimiento")
    @ManyToOne(optional = false)
    private TipoMantenimiento idTipoMantenimiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrdenTrabajo")
    private List<OrdenTrabajoDetalle> ordenTrabajoDetalleList;

    public OrdenTrabajo() {
    }

    public OrdenTrabajo(Integer idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    public Integer getIdOrdenTrabajo() {
        return idOrdenTrabajo;
    }

    public void setIdOrdenTrabajo(Integer idOrdenTrabajo) {
        this.idOrdenTrabajo = idOrdenTrabajo;
    }

    public Prioridad getIdPrioridad() {
        return idPrioridad;
    }

    public void setIdPrioridad(Prioridad idPrioridad) {
        this.idPrioridad = idPrioridad;
    }

    public Solicitud getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Solicitud idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public TipoMantenimiento getIdTipoMantenimiento() {
        return idTipoMantenimiento;
    }

    public void setIdTipoMantenimiento(TipoMantenimiento idTipoMantenimiento) {
        this.idTipoMantenimiento = idTipoMantenimiento;
    }

    @XmlTransient
    public List<OrdenTrabajoDetalle> getOrdenTrabajoDetalleList() {
        return ordenTrabajoDetalleList;
    }

    public void setOrdenTrabajoDetalleList(List<OrdenTrabajoDetalle> ordenTrabajoDetalleList) {
        this.ordenTrabajoDetalleList = ordenTrabajoDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdenTrabajo != null ? idOrdenTrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdenTrabajo)) {
            return false;
        }
        OrdenTrabajo other = (OrdenTrabajo) object;
        if ((this.idOrdenTrabajo == null && other.idOrdenTrabajo != null) || (this.idOrdenTrabajo != null && !this.idOrdenTrabajo.equals(other.idOrdenTrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entitiesI.OrdenTrabajo[ idOrdenTrabajo=" + idOrdenTrabajo + " ]";
    }
    
}
