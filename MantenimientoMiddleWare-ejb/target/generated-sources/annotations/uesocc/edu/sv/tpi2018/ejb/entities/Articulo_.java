package uesocc.edu.sv.tpi2018.ejb.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.edu.sv.tpi2018.ejb.entities.Marca;
import uesocc.edu.sv.tpi2018.ejb.entities.ModeloDetalle;
import uesocc.edu.sv.tpi2018.ejb.entities.Parte;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2018-03-27T12:38:12")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, Integer> idArticulo;
    public static volatile SingularAttribute<Articulo, String> descripcion;
    public static volatile ListAttribute<Articulo, ModeloDetalle> modeloDetalleList;
    public static volatile SingularAttribute<Articulo, Marca> idMarca;
    public static volatile SingularAttribute<Articulo, String> nombre;
    public static volatile SingularAttribute<Articulo, Parte> idParte;

}