package uesocc.edu.sv.tpi2018.ejb.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.Equipo;
import uesocc.edu.sv.tpi2018.ejb.entities.Solicitud;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-04-01T22:46:09")
@StaticMetamodel(Calendario.class)
public class Calendario_ { 

    public static volatile SingularAttribute<Calendario, Date> fecha;
    public static volatile SingularAttribute<Calendario, Equipo> idEquipo;
    public static volatile ListAttribute<Calendario, Solicitud> solicitudList;
    public static volatile SingularAttribute<Calendario, Integer> idCalendario;

}