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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "calendario_equipo", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CalendarioEquipo.findAll", query = "SELECT c FROM CalendarioEquipo c")
    , @NamedQuery(name = "CalendarioEquipo.findByPeriodo", query = "SELECT c FROM CalendarioEquipo c WHERE c.periodo = :periodo")
    , @NamedQuery(name = "CalendarioEquipo.findByIdCalendarioEquipo", query = "SELECT c FROM CalendarioEquipo c WHERE c.idCalendarioEquipo = :idCalendarioEquipo")})
public class CalendarioEquipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "periodo")
    private int periodo;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_calendario_equipo")
    private Integer idCalendarioEquipo;
    @JoinColumn(name = "id_equipo", referencedColumnName = "id_equipo")
    @ManyToOne(optional = false)
    private Equipo idEquipo;

    public CalendarioEquipo() {
    }

    public CalendarioEquipo(Integer idCalendarioEquipo) {
        this.idCalendarioEquipo = idCalendarioEquipo;
    }

    public CalendarioEquipo(Integer idCalendarioEquipo, int periodo) {
        this.idCalendarioEquipo = idCalendarioEquipo;
        this.periodo = periodo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Integer getIdCalendarioEquipo() {
        return idCalendarioEquipo;
    }

    public void setIdCalendarioEquipo(Integer idCalendarioEquipo) {
        this.idCalendarioEquipo = idCalendarioEquipo;
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
        hash += (idCalendarioEquipo != null ? idCalendarioEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CalendarioEquipo)) {
            return false;
        }
        CalendarioEquipo other = (CalendarioEquipo) object;
        if ((this.idCalendarioEquipo == null && other.idCalendarioEquipo != null) || (this.idCalendarioEquipo != null && !this.idCalendarioEquipo.equals(other.idCalendarioEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.edu.sv.tpi2018.ejb.entitiesI.CalendarioEquipo[ idCalendarioEquipo=" + idCalendarioEquipo + " ]";
    }
    
}
