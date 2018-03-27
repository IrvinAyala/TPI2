package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.Calendario;
import uesocc.edu.sv.tpi2018.ejb.entities.CalendarioEquipo;
import uesocc.edu.sv.tpi2018.ejb.entities.EquipoDetalle;
import uesocc.edu.sv.tpi2018.ejb.entities.Modelo;
import uesocc.edu.sv.tpi2018.ejb.entities.Solicitud;
import uesocc.edu.sv.tpi2018.ejb.entities.Unidad;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-03-27T12:38:12")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile SingularAttribute<Equipo, Integer> idEquipo;
    public static volatile ListAttribute<Equipo, Calendario> calendarioList;
    public static volatile ListAttribute<Equipo, CalendarioEquipo> calendarioEquipoList;
    public static volatile SingularAttribute<Equipo, Unidad> idUnidad;
    public static volatile SingularAttribute<Equipo, String> codigoCorrelativo;
    public static volatile SingularAttribute<Equipo, Modelo> idModelo;
    public static volatile ListAttribute<Equipo, EquipoDetalle> equipoDetalleList;
    public static volatile ListAttribute<Equipo, Solicitud> solicitudList;

}