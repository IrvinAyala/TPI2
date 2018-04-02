package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalle;
import uesocc.edu.sv.tpi2018.ejb.entities.Prioridad;
import uesocc.edu.sv.tpi2018.ejb.entities.Solicitud;
import uesocc.edu.sv.tpi2018.ejb.entities.TipoMantenimiento;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-04-02T15:56:29")
@StaticMetamodel(OrdenTrabajo.class)
public class OrdenTrabajo_ { 

    public static volatile SingularAttribute<OrdenTrabajo, Integer> idOrdenTrabajo;
    public static volatile SingularAttribute<OrdenTrabajo, TipoMantenimiento> idTipoMantenimiento;
    public static volatile ListAttribute<OrdenTrabajo, OrdenTrabajoDetalle> ordenTrabajoDetalleList;
    public static volatile SingularAttribute<OrdenTrabajo, Prioridad> idPrioridad;
    public static volatile SingularAttribute<OrdenTrabajo, Solicitud> idSolicitud;

}