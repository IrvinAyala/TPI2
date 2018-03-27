/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingnieria.TPI.definiciones;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * @author katiro
 */
@Entity
@Table(name = "equipo", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")
    , @NamedQuery(name = "Equipo.findByIdEquipo", query = "SELECT e FROM Equipo e WHERE e.idEquipo = :idEquipo")
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
    @JoinTable(name = "solicitud_equipo", joinColumns = {
        @JoinColumn(name = "id_equipo", referencedColumnName = "id_equipo")}, inverseJoinColumns = {
        @JoinColumn(name = "id_solicitud", referencedColumnName = "id_solicitud")})
    @ManyToMany
    private Collection<Solicitud> solicitudCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipo")
    private Collection<Calendario> calendarioCollection;
    @JoinColumn(name = "id_modelo", referencedColumnName = "id_modelo")
    @ManyToOne(optional = false)
    private Modelo idModelo;
    @JoinColumn(name = "id_unidad", referencedColumnName = "id_unidad")
    @ManyToOne(optional = false)
    private Unidad idUnidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipo")
    private Collection<CalendarioEquipo> calendarioEquipoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipo")
    private Collection<EquipoDetalle> equipoDetalleCollection;

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
    public Collection<Solicitud> getSolicitudCollection() {
        return solicitudCollection;
    }

    public void setSolicitudCollection(Collection<Solicitud> solicitudCollection) {
        this.solicitudCollection = solicitudCollection;
    }

    @XmlTransient
    public Collection<Calendario> getCalendarioCollection() {
        return calendarioCollection;
    }

    public void setCalendarioCollection(Collection<Calendario> calendarioCollection) {
        this.calendarioCollection = calendarioCollection;
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
    public Collection<CalendarioEquipo> getCalendarioEquipoCollection() {
        return calendarioEquipoCollection;
    }

    public void setCalendarioEquipoCollection(Collection<CalendarioEquipo> calendarioEquipoCollection) {
        this.calendarioEquipoCollection = calendarioEquipoCollection;
    }

    @XmlTransient
    public Collection<EquipoDetalle> getEquipoDetalleCollection() {
        return equipoDetalleCollection;
    }

    public void setEquipoDetalleCollection(Collection<EquipoDetalle> equipoDetalleCollection) {
        this.equipoDetalleCollection = equipoDetalleCollection;
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
        return "uesocc.edu.sv.ingnieria.TPI.definiciones.Equipo[ idEquipo=" + idEquipo + " ]";
    }
    
}
