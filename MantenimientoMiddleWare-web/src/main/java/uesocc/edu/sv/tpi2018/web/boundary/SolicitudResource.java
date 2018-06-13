/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.persistence.EntityExistsException;
import javax.json.JsonArray;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.SolicitudFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Equipo;
import uesocc.edu.sv.tpi2018.ejb.entities.Solicitud;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerException;
import uesocc.edu.sv.tpi2018.web.entities.EquipoEstado;

/**
 *
 * @author andrea
 */
@Path("solicitud")
public class SolicitudResource extends AbstractResource<Solicitud> {

    @EJB
    SolicitudFacadeLocal sfl;

    @Override
    protected AbstractInterface<Solicitud> getFacade() {
        return sfl;
    }

    @Override
    protected Solicitud crearNuevo() {
        return new Solicitud();
    }

    @GET
    @Path("{id}/estado")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<Equipo> obtenerEstado(@PathParam("id") int id){
        return sfl.obtenerEstado(id);
    }

    @Override
    @POST
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public Solicitud create(Solicitud registro) throws Exception {//en vez de T Object
        if (registro != null) {//igual cero 0 y areglar registro != null && registro.getidtipoDoc == null
            System.out.println(registro.toString());
            if (getFacade() != null) {
                try {
                    Solicitud r = getFacade().create(registro);
                    if (r != null) {
                        System.out.println(r.toString() + "Solicitud resource");
                        return r;
                    }
                    throw new ControllerException(ControllerException.Message.REGISTRO_NO_CREADO);
                } catch (EntityExistsException e) {
                    Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
                    throw new ControllerException(ControllerException.Message.REGISTRO_REPETIDO);
                }

            }
            throw new NullPointerException("Facade null");
        }
        throw new ControllerException(ControllerException.Message.FALTA_CAMPO_REQUERIDO);
>>>>>>> 344efcb5419b43ee60cb7a328b1b12840b6e811a
    }
        
}
