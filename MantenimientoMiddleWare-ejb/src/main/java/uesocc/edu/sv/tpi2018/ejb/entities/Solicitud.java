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
import javax.persistence.ManyToMany;
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
@Table(name = "solicitud", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s")
    , @NamedQuery(name = "Solicitud.findByIdSolicitud", query = "SELECT s FROM Solicitud s WHERE s.idSolicitud = :idSolicitud")
    , @NamedQuery(name = "Solicitud.findByUnidad", query = "SELECT s FROM Solicitud s WHERE s.unidad = :unidad")
    , @NamedQuery(name = "Solicitud.findBySolicitante", query = "SELECT s FROM Solicitud s WHERE s.solicitante = :solicitante")
    , @NamedQuery(name = "Solicitud.pasosNoCompletados", query = "SELECT COUNT(otdep.completado) SUM(CASE ) FROM Solicitud s JOIN s.ordenTrabajoList ot JOIN ot.ordenTrabajoDetalleList otd JOIN otd.ordenTrabajoDetalleEstadoPasoList otdep WHERE s.idSolicitud = :idSolicitud AND otdep.completado = FALSE")
    , @NamedQuery(name = "Solicitud.estado", query = "SELECT DISTINCT e FROM Solicitud s JOIN s.equipoList e WHERE s.idSolicitud = :idSolicitud")
    , @NamedQuery(name = "Solicitud.findByEstado", query = "SELECT s FROM Solicitud s WHERE s.estado = :estado")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_solicitud")
    private Integer idSolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "unidad")
    private String unidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "solicitante")
    private String solicitante;
    @Column(name = "estado")
    private Boolean estado;
    @ManyToMany(mappedBy = "solicitudList")
    private List<Equipo> equipoList;
    @ManyToMany(mappedBy = "solicitudList")
    private List<Calendario> calendarioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSolicitud")
    private List<OrdenTrabajo> ordenTrabajoList;

    public Solicitud() {
    }

    public Solicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Solicitud(Integer idSolicitud, String unidad, String solicitante) {
        this.idSolicitud = idSolicitud;
        this.unidad = unidad;
        this.solicitante = solicitante;
    }

    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Integer idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @XmlTransient
    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    @XmlTransient
    public List<Calendario> getCalendarioList() {
        return calendarioList;
    }

    public void setCalendarioList(List<Calendario> calendarioList) {
        this.calendarioList = calendarioList;
    }

    @XmlTransient
    public List<OrdenTrabajo> getOrdenTrabajoList() {
        return ordenTrabajoList;
    }

    public void setOrdenTrabajoList(List<OrdenTrabajo> ordenTrabajoList) {
        this.ordenTrabajoList = ordenTrabajoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitud != null ? idSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.idSolicitud == null && other.idSolicitud != null) || (this.idSolicitud != null && !this.idSolicitud.equals(other.idSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entitiesI.Solicitud[ idSolicitud=" + idSolicitud + " ]";
    }
    
}
