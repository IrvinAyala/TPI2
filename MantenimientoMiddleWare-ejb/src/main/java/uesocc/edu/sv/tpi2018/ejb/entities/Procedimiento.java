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
@Table(name = "procedimiento", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procedimiento.findAll", query = "SELECT p FROM Procedimiento p")
    , @NamedQuery(name = "Procedimiento.findByIdProcedimiento", query = "SELECT p FROM Procedimiento p WHERE p.idProcedimiento = :idProcedimiento")
    , @NamedQuery(name = "Procedimiento.findByNombre", query = "SELECT p FROM Procedimiento p WHERE p.nombre = :nombre")})
public class Procedimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_procedimiento")
    private Integer idProcedimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @ManyToMany(mappedBy = "procedimientoList")
    private List<DiagnosticoParte> diagnosticoParteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProcedimiento")
    private List<ProcedimientoPaso> procedimientoPasoList;

    public Procedimiento() {
    }

    public Procedimiento(Integer idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public Procedimiento(Integer idProcedimiento, String nombre) {
        this.idProcedimiento = idProcedimiento;
        this.nombre = nombre;
    }

    public Integer getIdProcedimiento() {
        return idProcedimiento;
    }

    public void setIdProcedimiento(Integer idProcedimiento) {
        this.idProcedimiento = idProcedimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<DiagnosticoParte> getDiagnosticoParteList() {
        return diagnosticoParteList;
    }

    public void setDiagnosticoParteList(List<DiagnosticoParte> diagnosticoParteList) {
        this.diagnosticoParteList = diagnosticoParteList;
    }

    @XmlTransient
    public List<ProcedimientoPaso> getProcedimientoPasoList() {
        return procedimientoPasoList;
    }

    public void setProcedimientoPasoList(List<ProcedimientoPaso> procedimientoPasoList) {
        this.procedimientoPasoList = procedimientoPasoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcedimiento != null ? idProcedimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedimiento)) {
            return false;
        }
        Procedimiento other = (Procedimiento) object;
        if ((this.idProcedimiento == null && other.idProcedimiento != null) || (this.idProcedimiento != null && !this.idProcedimiento.equals(other.idProcedimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entities.Procedimiento[ idProcedimiento=" + idProcedimiento + " ]";
    }
    
}
