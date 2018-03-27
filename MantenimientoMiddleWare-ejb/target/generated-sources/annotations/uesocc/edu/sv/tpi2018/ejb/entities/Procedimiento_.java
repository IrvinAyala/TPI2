package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.DiagnosticoParte;
import uesocc.edu.sv.tpi2018.ejb.entities.ProcedimientoPaso;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-03-27T14:34:26")
@StaticMetamodel(Procedimiento.class)
public class Procedimiento_ { 

    public static volatile SingularAttribute<Procedimiento, Integer> idProcedimiento;
    public static volatile ListAttribute<Procedimiento, ProcedimientoPaso> procedimientoPasoList;
    public static volatile ListAttribute<Procedimiento, DiagnosticoParte> diagnosticoParteList;
    public static volatile SingularAttribute<Procedimiento, String> nombre;

}