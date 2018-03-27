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
@Table(name = "procedimiento_paso", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcedimientoPaso.findAll", query = "SELECT p FROM ProcedimientoPaso p")
    , @NamedQuery(name = "ProcedimientoPaso.findByIdProcedimientoPaso", query = "SELECT p FROM ProcedimientoPaso p WHERE p.idProcedimientoPaso = :idProcedimientoPaso")})
public class ProcedimientoPaso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_procedimiento_paso")
    private Integer idProcedimientoPaso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "procedimientoPaso")
    private List<OrdenTrabajoDetalleEstadoPaso> ordenTrabajoDetalleEstadoPasoList;
    @JoinColumn(name = "id_paso", referencedColumnName = "id_paso")
    @ManyToOne(optional = false)
    private Pasos idPaso;
    @JoinColumn(name = "id_procedimiento", referencedColumnName = "id_procedimiento")
    @ManyToOne(optional = false)
    private Procedimiento idProcedimiento;

    public ProcedimientoPaso() {
    }

    public ProcedimientoPaso(Integer idProcedimientoPaso) {
        this.idProcedimientoPaso = idProcedimientoPaso;
    }

    public Integer getIdProcedimientoPaso() {
        return idProcedimientoPaso;
    }

    public void setIdProcedimientoPaso(Integer idProcedimientoPaso) {
        this.idProcedimientoPaso = idProcedimientoPaso;
    }

    @XmlTransient
    public List<OrdenTrabajoDetalleEstadoPaso> getOrdenTrabajoDetalleEstadoPasoList() {
        return ordenTrabajoDetalleEstadoPasoList;
    }

    public void setOrdenTrabajoDetalleEstadoPasoList(List<OrdenTrabajoDetalleEstadoPaso> ordenTrabajoDetalleEstadoPasoList) {
        this.ordenTrabajoDetalleEstadoPasoList = ordenTrabajoDetalleEstadoPasoList;
    }

    public Pasos getIdPaso() {
        return idPaso;
    }

    public void setIdPaso(Pasos idPaso) {
        this.idPaso = idPaso;
    }

    public Procedimiento getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(Procedimiento idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcedimientoPaso != null ? idProcedimientoPaso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientoPaso)) {
            return false;
        }
        ProcedimientoPaso other = (ProcedimientoPaso) object;
        if ((this.idProcedimientoPaso == null && other.idProcedimientoPaso != null) || (this.idProcedimientoPaso != null && !this.idProcedimientoPaso.equals(other.idProcedimientoPaso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entities.ProcedimientoPaso[ idProcedimientoPaso=" + idProcedimientoPaso + " ]";
    }
    
}
