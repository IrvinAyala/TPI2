/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.entities;

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
 * @author irvin
 */
@Entity
@Table(name = "modelo_detalle", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModeloDetalle.findAll", query = "SELECT m FROM ModeloDetalle m")
    , @NamedQuery(name = "ModeloDetalle.findByIdModelo", query = "SELECT m FROM ModeloDetalle m WHERE m.modeloDetallePK.idModelo = :idModelo")
    , @NamedQuery(name = "ModeloDetalle.findByIdArticulo", query = "SELECT m FROM ModeloDetalle m WHERE m.modeloDetallePK.idArticulo = :idArticulo")
    , @NamedQuery(name = "ModeloDetalle.findByActivo", query = "SELECT m FROM ModeloDetalle m WHERE m.activo = :activo")})
public class ModeloDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModeloDetallePK modeloDetallePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "activo")
    private boolean activo;
    @JoinColumn(name = "id_articulo", referencedColumnName = "id_articulo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulo articulo;
    @JoinColumn(name = "id_modelo", referencedColumnName = "id_modelo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Modelo modelo;

    public ModeloDetalle() {
    }

    public ModeloDetalle(ModeloDetallePK modeloDetallePK) {
        this.modeloDetallePK = modeloDetallePK;
    }

    public ModeloDetalle(ModeloDetallePK modeloDetallePK, boolean activo) {
        this.modeloDetallePK = modeloDetallePK;
        this.activo = activo;
    }

    public ModeloDetalle(int idModelo, int idArticulo) {
        this.modeloDetallePK = new ModeloDetallePK(idModelo, idArticulo);
    }

    public ModeloDetallePK getModeloDetallePK() {
        return modeloDetallePK;
    }

    public void setModeloDetallePK(ModeloDetallePK modeloDetallePK) {
        this.modeloDetallePK = modeloDetallePK;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modeloDetallePK != null ? modeloDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModeloDetalle)) {
            return false;
        }
        ModeloDetalle other = (ModeloDetalle) object;
        if ((this.modeloDetallePK == null && other.modeloDetallePK != null) || (this.modeloDetallePK != null && !this.modeloDetallePK.equals(other.modeloDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entitiesI.ModeloDetalle[ modeloDetallePK=" + modeloDetallePK + " ]";
    }
    
}
