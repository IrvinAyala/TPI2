package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajo;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalleEstadoPaso;
import uesocc.edu.sv.tpi2018.ejb.entities.Responsable;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-04-01T22:46:09")
@StaticMetamodel(OrdenTrabajoDetalle.class)
public class OrdenTrabajoDetalle_ { 

    public static volatile SingularAttribute<OrdenTrabajoDetalle, OrdenTrabajo> idOrdenTrabajo;
    public static volatile SingularAttribute<OrdenTrabajoDetalle, Integer> idOrdenTrabajoDetalle;
    public static volatile SingularAttribute<OrdenTrabajoDetalle, String> idEquipoDetalle;
    public static volatile ListAttribute<OrdenTrabajoDetalle, OrdenTrabajoDetalleEstadoPaso> ordenTrabajoDetalleEstadoPasoList;
    public static volatile SingularAttribute<OrdenTrabajoDetalle, Responsable> idResponsable;
    public static volatile SingularAttribute<OrdenTrabajoDetalle, String> observacion;

}