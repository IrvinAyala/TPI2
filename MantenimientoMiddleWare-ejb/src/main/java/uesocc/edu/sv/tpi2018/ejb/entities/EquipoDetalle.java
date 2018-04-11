/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author irvin
 */
@Entity
@Table(name = "equipo_detalle", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipoDetalle.findAll", query = "SELECT e FROM EquipoDetalle e")
    , @NamedQuery(name = "EquipoDetalle.findByNumeroSerie", query = "SELECT e FROM EquipoDetalle e WHERE e.numeroSerie = :numeroSerie")
    , @NamedQuery(name = "EquipoDetalle.findByIdArticulo", query = "SELECT e FROM EquipoDetalle e WHERE e.idArticulo = :idArticulo")})
public class EquipoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "numero_serie")
    private String numeroSerie;
    
    //caracteristicas - pdf
    //surefire para pruebas paralelas
    //findbyname... notacion personalizada y reflexion...
    
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_articulo")
    private int idArticulo;
    @JoinColumn(name = "id_equipo", referencedColumnName = "id_equipo")
    @ManyToOne(optional = false)
    private Equipo idEquipo;

    public EquipoDetalle() {
    }

    public EquipoDetalle(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public EquipoDetalle(String numeroSerie, int idArticulo) {
        this.numeroSerie = numeroSerie;
        this.idArticulo = idArticulo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Equipo getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Equipo idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroSerie != null ? numeroSerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipoDetalle)) {
            return false;
        }
        EquipoDetalle other = (EquipoDetalle) object;
        if ((this.numeroSerie == null && other.numeroSerie != null) || (this.numeroSerie != null && !this.numeroSerie.equals(other.numeroSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entitiesI.EquipoDetalle[ numeroSerie=" + numeroSerie + " ]";
    }
    
}
