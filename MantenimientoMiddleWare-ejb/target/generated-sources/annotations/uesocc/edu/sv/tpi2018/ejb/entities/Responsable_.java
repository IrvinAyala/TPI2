package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalle;
import uesocc.edu.sv.tpi2018.ejb.entities.TipoResponsable;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-04-01T22:46:09")
@StaticMetamodel(Responsable.class)
public class Responsable_ { 

    public static volatile SingularAttribute<Responsable, TipoResponsable> idTipoReponsable;
    public static volatile SingularAttribute<Responsable, Integer> idResponsable;
    public static volatile ListAttribute<Responsable, OrdenTrabajoDetalle> ordenTrabajoDetalleList;
    public static volatile SingularAttribute<Responsable, String> nombre;

}