/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajoDetalleEstadoPaso;

/**
 *
 * @author irvin
 */
@Stateless
public class OrdenTrabajoDetalleEstadoPasoFacade extends AbstractFacade<OrdenTrabajoDetalleEstadoPaso> implements OrdenTrabajoDetalleEstadoPasoFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenTrabajoDetalleEstadoPasoFacade() {
        super(OrdenTrabajoDetalleEstadoPaso.class);
    }

    @Override
    public JsonArray getDetalleEstadoPasoCompletado(String idEquipoDetalle) {
        Query q = getEntityManager().createNamedQuery("OrdenTrabajoDetalleEstadoPaso.findDetalleEstadoPasoCompletado");
        q.setParameter("idEquipoDetalle", idEquipoDetalle);

        JsonBuilderFactory factory = Json.createBuilderFactory(null);
//        JsonValue nombrePaso = q.getResultList().get(0).toString();
//        JsonValue completado = q.getResultList().get(1).toString();

//        JsonObject object = factory.createObjectBuilder()
//                .add("nombrePaso", q.getResultList().get(0))
//                .add("completado", q.getResultList().get(1)).build();
            JsonArray value = Json.createArrayBuilder()
                    .add(Json.createObjectBuilder()
                            .add("type", "home")
                            .add("number", "212 555-1234"))
                    .add(Json.createObjectBuilder()
                            .add("type", "fax")
                            .add("number", "646 555-4567"))
                    .build();


//        JsonObject object = factory.createObjectBuilder()
//                .add("pasoEstado", factory.createArrayBuilder()
//                        .add(factory.createObjectBuilder()
//                                .add("nombrePaso", nombrePaso)
//                                .add("completado", completado))).build();

        return object;

    }

//    public JsonObject toJson(){
//        JsonBuilderFactory factory=Json.createBuilderFactory(null);
//        JsonObject object=factory.createObjectBuilder()
//                .add("numero",this.numero)
//                .add("historico",this.historico)
//                .add("numeroInventario",this.numeroInventario)
//                .add("marca",this.marca)
//                .add("numeroSerie",this.numeroSerie)
//                .add("modelo",this.responsable)
//                .add("sistemaOperativo",this.sistemaOperativo)
//                .add("version",this.version)
//                .add("licencia",this.licencia)
//                .add("observaciones",this.observaciones).build();
//        
//        return object;
//    }
}
