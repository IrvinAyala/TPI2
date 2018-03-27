package uesocc.edu.sv.tpi2018.web.boundary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andrea
 */
public abstract class AbstractResource<T> implements Serializable {

    protected abstract AbstractInterface<T> getFacade();
    protected T entity;

    @GET
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<T> findAll(@QueryParam("first") @DefaultValue("1") int first,
            @QueryParam("pagesize") @DefaultValue("0") int pagesize) throws Exception {
        List<T> salida = null;
        if (getFacade() != null) {
            salida = getFacade().findAll();
        } else {
            throw new Exception("Error, facade null");
        }
        if (salida == null) {
            throw new ControllerException(ControllerException.Message.REGISTRO_NO_ENCONTRADO);
        }
        return salida;
    }

    protected abstract T crearNuevo();

    @GET
    @Path("{idfind}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public T findById(@PathParam("idfind") long id) {
        if (getFacade() != null) {
            return getFacade().find(id);
        }
        throw new ControllerException(ControllerException.Message.REGISTRO_NO_ENCONTRADO);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public T editElement(T registro) throws Exception {
        T salida;
        if (getFacade() != null) {
            salida = getFacade().edit(registro);
        } else {
            throw new Exception("Error, facade null");
        }
        if (salida = null) {
            throw new ControllerException(ControllerException.Message.REGISTRO_NO_EDITADO);

        }
        return salida;
    }

    @DELETE
    @Path("{iddelete}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public String deleteElement(@PathParam("iddelete") Integer id) {
        T salida;

        if (id > 0) {

            if (getFacade() != null) {
                salida = getFacade().find(id);
                if (salida != null) {
                    if (getFacade().remove(salida)) {
                        return "Se elimino";
                    }
                }
            }
        }

        return "Error al elminar";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public T create(T registro) throws Exception {
        if (registro != null) {//igual cero 0 y areglar registro != null && registro.getidtipoDoc == null
            if (getFacade() != null) {
                T r = getFacade().crear(registro);
                if (r != null) {
                    return r;
                }
                throw new ControllerException(ControllerException.Message.REGISTRO_NO_CREADO);
            }
            throw new Exception("Error, facade null");
        }
        throw new ControllerException(ControllerException.Message.FALTA_CAMPO_REQUERIDO);
    }
}
