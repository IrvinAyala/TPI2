package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.Articulo;
import uesocc.edu.sv.tpi2018.ejb.entities.Modelo;
import uesocc.edu.sv.tpi2018.ejb.entities.ModeloDetallePK;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-04-02T15:56:29")
@StaticMetamodel(ModeloDetalle.class)
public class ModeloDetalle_ { 

    public static volatile SingularAttribute<ModeloDetalle, Articulo> articulo;
    public static volatile SingularAttribute<ModeloDetalle, ModeloDetallePK> modeloDetallePK;
    public static volatile SingularAttribute<ModeloDetalle, Modelo> modelo;
    public static volatile SingularAttribute<ModeloDetalle, Boolean> activo;

}