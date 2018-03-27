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
@Table(name = "parte", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parte.findAll", query = "SELECT p FROM Parte p")
    , @NamedQuery(name = "Parte.findByIdParte", query = "SELECT p FROM Parte p WHERE p.idParte = :idParte")
    , @NamedQuery(name = "Parte.findByNombre", query = "SELECT p FROM Parte p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Parte.findByDescripcion", query = "SELECT p FROM Parte p WHERE p.descripcion = :descripcion")})
public class Parte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_parte")
    private Integer idParte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idParte")
    private Collection<DiagnosticoParte> diagnosticoParteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idParte")
    private Collection<Articulo> articuloCollection;

    public Parte() {
    }

    public Parte(Integer idParte) {
        this.idParte = idParte;
    }

    public Parte(Integer idParte, String nombre) {
        this.idParte = idParte;
        this.nombre = nombre;
    }

    public Integer getIdParte() {
        return idParte;
    }

    public void setIdParte(Integer idParte) {
        this.idParte = idParte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<DiagnosticoParte> getDiagnosticoParteCollection() {
        return diagnosticoParteCollection;
    }

    public void setDiagnosticoParteCollection(Collection<DiagnosticoParte> diagnosticoParteCollection) {
        this.diagnosticoParteCollection = diagnosticoParteCollection;
    }

    @XmlTransient
    public Collection<Articulo> getArticuloCollection() {
        return articuloCollection;
    }

    public void setArticuloCollection(Collection<Articulo> articuloCollection) {
        this.articuloCollection = articuloCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParte != null ? idParte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parte)) {
            return false;
        }
        Parte other = (Parte) object;
        if ((this.idParte == null && other.idParte != null) || (this.idParte != null && !this.idParte.equals(other.idParte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.ingnieria.TPI.definiciones.Parte[ idParte=" + idParte + " ]";
    }
    
}
