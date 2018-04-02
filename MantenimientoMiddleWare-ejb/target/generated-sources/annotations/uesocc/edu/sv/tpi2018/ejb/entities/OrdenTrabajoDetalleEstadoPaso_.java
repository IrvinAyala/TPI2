package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalle;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalleEstadoPasoPK;
import uesocc.edu.sv.tpi2018.ejb.entities.ProcedimientoPaso;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-04-01T22:46:09")
@StaticMetamodel(OrdenTrabajoDetalleEstadoPaso.class)
public class OrdenTrabajoDetalleEstadoPaso_ { 

    public static volatile SingularAttribute<OrdenTrabajoDetalleEstadoPaso, ProcedimientoPaso> procedimientoPaso;
    public static volatile SingularAttribute<OrdenTrabajoDetalleEstadoPaso, OrdenTrabajoDetalle> ordenTrabajoDetalle;
    public static volatile SingularAttribute<OrdenTrabajoDetalleEstadoPaso, Boolean> completado;
    public static volatile SingularAttribute<OrdenTrabajoDetalleEstadoPaso, OrdenTrabajoDetalleEstadoPasoPK> ordenTrabajoDetalleEstadoPasoPK;

}