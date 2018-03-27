package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.Diagnostico;
import uesocc.edu.sv.tpi2018.ejb.entities.Parte;
import uesocc.edu.sv.tpi2018.ejb.entities.Procedimiento;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-03-27T14:50:25")
@StaticMetamodel(DiagnosticoParte.class)
public class DiagnosticoParte_ { 

    public static volatile SingularAttribute<DiagnosticoParte, Integer> idDiagnosticoParte;
    public static volatile SingularAttribute<DiagnosticoParte, Diagnostico> idDiagnostico;
    public static volatile ListAttribute<DiagnosticoParte, Procedimiento> procedimientoList;
    public static volatile SingularAttribute<DiagnosticoParte, Parte> idParte;

}