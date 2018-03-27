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
@Table(name = "responsable", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Responsable.findAll", query = "SELECT r FROM Responsable r")
    , @NamedQuery(name = "Responsable.findByIdResponsable", query = "SELECT r FROM Responsable r WHERE r.idResponsable = :idResponsable")
    , @NamedQuery(name = "Responsable.findByNombre", query = "SELECT r FROM Responsable r WHERE r.nombre = :nombre")})
public class Responsable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_responsable")
    private Integer idResponsable;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "id_tipo_reponsable", referencedColumnName = "id_tipo_responsable")
    @ManyToOne(optional = false)
    private TipoResponsable idTipoReponsable;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idResponsable")
    private Collection<OrdenTrabajoDetalle> ordenTrabajoDetalleCollection;

    public Responsable() {
    }

    public Responsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }

    public Responsable(Integer idResponsable, String nombre) {
        this.idResponsable = idResponsable;
        this.nombre = nombre;
    }

    public Integer getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(Integer idResponsable) {
        this.idResponsable = idResponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoResponsable getIdTipoReponsable() {
        return idTipoReponsable;
    }

    public void setIdTipoReponsable(TipoResponsable idTipoReponsable) {
        this.idTipoReponsable = idTipoReponsable;
    }

    @XmlTransient
    public Collection<OrdenTrabajoDetalle> getOrdenTrabajoDetalleCollection() {
        return ordenTrabajoDetalleCollection;
    }

    public void setOrdenTrabajoDetalleCollection(Collection<OrdenTrabajoDetalle> ordenTrabajoDetalleCollection) {
        this.ordenTrabajoDetalleCollection = ordenTrabajoDetalleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idResponsable != null ? idResponsable.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Responsable)) {
            return false;
        }
        Responsable other = (Responsable) object;
        if ((this.idResponsable == null && other.idResponsable != null) || (this.idResponsable != null && !this.idResponsable.equals(other.idResponsable))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.ingnieria.TPI.definiciones.Responsable[ idResponsable=" + idResponsable + " ]";
    }
    
}
