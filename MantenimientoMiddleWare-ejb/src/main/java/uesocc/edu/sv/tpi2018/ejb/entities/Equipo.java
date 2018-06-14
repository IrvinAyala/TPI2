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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "equipo", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")
    , @NamedQuery(name = "Equipo.findByIdEquipo", query = "SELECT e FROM Equipo e WHERE e.idEquipo = :idEquipo")
    , @NamedQuery(name = "Equipo.historial", query = "SELECT o FROM OrdenTrabajo o WHERE NOT EXISTS(SELECT op FROM OrdenTrabajoDetalleEstadoPaso op WHERE op.completado=FALSE AND op.ordenTrabajoDetalle.idOrdenTrabajo.idOrdenTrabajo=o.idOrdenTrabajo) AND EXISTS(SELECT p FROM OrdenTrabajoDetalleEstadoPaso p WHERE p.ordenTrabajoDetalle.idOrdenTrabajo.idOrdenTrabajo=o.idOrdenTrabajo) AND o.idEquipo = :idEquipo")
    , @NamedQuery(name = "Equipo.findDetalle", query = "SELECT ed FROM Equipo e JOIN e.equipoDetalleList ed WHERE e.idEquipo = :idEquipo")
    , @NamedQuery(name = "Equipo.findByCodigoCorrelativoLike", query = "SELECT e FROM Equipo e WHERE LOWER(e.codigoCorrelativo) LIKE CONCAT('%',LOWER(:name),'%')")
    , @NamedQuery(name = "Equipo.findByCodigoCorrelativo", query = "SELECT e FROM Equipo e WHERE e.codigoCorrelativo = :codigoCorrelativo")})

public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_equipo")
    private Integer idEquipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "codigo_correlativo")
    private String codigoCorrelativo;
    @ManyToMany(cascade = CascadeType.MERGE, mappedBy = "equipoList")
    private List<Solicitud> solicitudList;
    @OneToMany(mappedBy = "idEquipo")
    private List<Calendario> calendarioList;
    @JoinColumn(name = "id_modelo", referencedColumnName = "id_modelo")
    @ManyToOne(optional = false)
    private Modelo idModelo;
    @JoinColumn(name = "id_unidad", referencedColumnName = "id_unidad")
    @ManyToOne(optional = false)
    private Unidad idUnidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipo")
    private List<CalendarioEquipo> calendarioEquipoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipo")
    private List<EquipoDetalle> equipoDetalleList;

    public Equipo() {
    }

    public Equipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Equipo(Integer idEquipo, String codigoCorrelativo) {
        this.idEquipo = idEquipo;
        this.codigoCorrelativo = codigoCorrelativo;
    }

    public Integer getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getCodigoCorrelativo() {
        return codigoCorrelativo;
    }

    public void setCodigoCorrelativo(String codigoCorrelativo) {
        this.codigoCorrelativo = codigoCorrelativo;
    }

    @XmlTransient
    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }

    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    @XmlTransient
    public List<Calendario> getCalendarioList() {
        return calendarioList;
    }

    public void setCalendarioList(List<Calendario> calendarioList) {
        this.calendarioList = calendarioList;
    }

    public Modelo getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(Modelo idModelo) {
        this.idModelo = idModelo;
    }

    public Unidad getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Unidad idUnidad) {
        this.idUnidad = idUnidad;
    }

    @XmlTransient
    public List<CalendarioEquipo> getCalendarioEquipoList() {
        return calendarioEquipoList;
    }

    public void setCalendarioEquipoList(List<CalendarioEquipo> calendarioEquipoList) {
        this.calendarioEquipoList = calendarioEquipoList;
    }

    @XmlTransient
    public List<EquipoDetalle> getEquipoDetalleList() {
        return equipoDetalleList;
    }

    public void setEquipoDetalleList(List<EquipoDetalle> equipoDetalleList) {
        this.equipoDetalleList = equipoDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipo != null ? idEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.idEquipo == null && other.idEquipo != null) || (this.idEquipo != null && !this.idEquipo.equals(other.idEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entitiesI.Equipo[ idEquipo=" + idEquipo + " ]";
    }

}
