/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author irvin
 */
@Entity
@Table(name = "diagnostico_parte", catalog = "tpitest", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DiagnosticoParte.findAll", query = "SELECT d FROM DiagnosticoParte d")
    , @NamedQuery(name = "DiagnosticoParte.findByIdDiagnosticoParte", query = "SELECT d FROM DiagnosticoParte d WHERE d.idDiagnosticoParte = :idDiagnosticoParte")})
public class DiagnosticoParte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_diagnostico_parte")
    private Integer idDiagnosticoParte;
    @JoinTable(name = "procedimiento__diagnostico_parte", joinColumns = {
        @JoinColumn(name = "id_diagnostico_parte", referencedColumnName = "id_diagnostico_parte")}, inverseJoinColumns = {
        @JoinColumn(name = "id_procedimiento", referencedColumnName = "id_procedimiento")})
    @ManyToMany
    private List<Procedimiento> procedimientoList;
    @JoinColumn(name = "id_diagnostico", referencedColumnName = "id_diagnostico")
    @ManyToOne(optional = false)
    private Diagnostico idDiagnostico;
    @JoinColumn(name = "id_parte", referencedColumnName = "id_parte")
    @ManyToOne(optional = false)
    private Parte idParte;

    public DiagnosticoParte() {
    }

    public DiagnosticoParte(Integer idDiagnosticoParte) {
        this.idDiagnosticoParte = idDiagnosticoParte;
    }

    public Integer getIdDiagnosticoParte() {
        return idDiagnosticoParte;
    }

    public void setIdDiagnosticoParte(Integer idDiagnosticoParte) {
        this.idDiagnosticoParte = idDiagnosticoParte;
    }

    @XmlTransient
    public List<Procedimiento> getProcedimientoList() {
        return procedimientoList;
    }

    public void setProcedimientoList(List<Procedimiento> procedimientoList) {
        this.procedimientoList = procedimientoList;
    }

    public Diagnostico getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Diagnostico idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Parte getIdParte() {
        return idParte;
    }

    public void setIdParte(Parte idParte) {
        this.idParte = idParte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiagnosticoParte != null ? idDiagnosticoParte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiagnosticoParte)) {
            return false;
        }
        DiagnosticoParte other = (DiagnosticoParte) object;
        if ((this.idDiagnosticoParte == null && other.idDiagnosticoParte != null) || (this.idDiagnosticoParte != null && !this.idDiagnosticoParte.equals(other.idDiagnosticoParte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entities.DiagnosticoParte[ idDiagnosticoParte=" + idDiagnosticoParte + " ]";
    }
    
}
