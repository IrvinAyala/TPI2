package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.Articulo;
import uesocc.edu.sv.tpi2018.ejb.entities.DiagnosticoParte;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-03-27T12:38:12")
@StaticMetamodel(Parte.class)
public class Parte_ { 

    public static volatile SingularAttribute<Parte, String> descripcion;
    public static volatile ListAttribute<Parte, Articulo> articuloList;
    public static volatile ListAttribute<Parte, DiagnosticoParte> diagnosticoParteList;
    public static volatile SingularAttribute<Parte, String> nombre;
    public static volatile SingularAttribute<Parte, Integer> idParte;

}