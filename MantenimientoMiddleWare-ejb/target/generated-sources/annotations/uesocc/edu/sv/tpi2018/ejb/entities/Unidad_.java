package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.Equipo;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-03-27T14:50:25")
@StaticMetamodel(Unidad.class)
public class Unidad_ { 

    public static volatile SingularAttribute<Unidad, Integer> idUnidad;
    public static volatile ListAttribute<Unidad, Equipo> equipoList;
    public static volatile SingularAttribute<Unidad, String> nombre;

}