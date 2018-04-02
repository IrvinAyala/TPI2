package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.Responsable;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-04-01T22:46:09")
@StaticMetamodel(TipoResponsable.class)
public class TipoResponsable_ { 

    public static volatile SingularAttribute<TipoResponsable, Integer> idTipoResponsable;
    public static volatile SingularAttribute<TipoResponsable, String> nombre;
    public static volatile SingularAttribute<TipoResponsable, String> observacion;
    public static volatile ListAttribute<TipoResponsable, Responsable> responsableList;

}