package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalleEstadoPaso;
import uesocc.edu.sv.tpi2018.ejb.entities.Pasos;
import uesocc.edu.sv.tpi2018.ejb.entities.Procedimiento;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-03-27T14:50:25")
@StaticMetamodel(ProcedimientoPaso.class)
public class ProcedimientoPaso_ { 

    public static volatile SingularAttribute<ProcedimientoPaso, Procedimiento> idProcedimiento;
    public static volatile SingularAttribute<ProcedimientoPaso, Integer> idProcedimientoPaso;
    public static volatile ListAttribute<ProcedimientoPaso, OrdenTrabajoDetalleEstadoPaso> ordenTrabajoDetalleEstadoPasoList;
    public static volatile SingularAttribute<ProcedimientoPaso, Pasos> idPaso;

}