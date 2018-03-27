package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajo;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-03-27T14:50:25")
@StaticMetamodel(TipoMantenimiento.class)
public class TipoMantenimiento_ { 

    public static volatile SingularAttribute<TipoMantenimiento, String> descripcion;
    public static volatile SingularAttribute<TipoMantenimiento, Integer> idTipoMantenimiento;
    public static volatile ListAttribute<TipoMantenimiento, OrdenTrabajo> ordenTrabajoList;
    public static volatile SingularAttribute<TipoMantenimiento, String> nombre;

}