package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.DiagnosticoParte;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-03-27T12:38:12")
@StaticMetamodel(Diagnostico.class)
public class Diagnostico_ { 

    public static volatile SingularAttribute<Diagnostico, String> descripcion;
    public static volatile SingularAttribute<Diagnostico, Integer> idDiagnostico;
    public static volatile ListAttribute<Diagnostico, DiagnosticoParte> diagnosticoParteList;
    public static volatile SingularAttribute<Diagnostico, String> nombre;

}