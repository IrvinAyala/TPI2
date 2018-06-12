package uesocc.edu.sv.tpi2018.web.boundary;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityExistsException;
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
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andrea
 * @param <T>
 */
public abstract class AbstractResource<T> implements Serializable {

    protected abstract AbstractInterface<T> getFacade();
    protected T entity;

    @GET
    @Produces({MediaType.APPLICATION_JSON + "; charset=utf-8"})
    public List<T> findAll(@QueryParam("first") @DefaultValue("0") int first,
            @QueryParam("pagesize") @DefaultValue("0") int pagesize) throws Exception {
        List<T> salida = null;
        if (getFacade() != null) {
            if (pagesize == 0) {
                salida = getFacade().findAll();
            } else if (pagesize > 0 && first >= 0) {
                salida = getFacade().findRange(first, pagesize);
            }
            if (salida == null) {
                throw new ControllerException(ControllerException.Message.PARAMETRO_INVALIDO);
            }
            return salida;
        }
        throw new NullPointerException("Facade null");
    }

    protected abstract T crearNuevo();

    @GET
    @Path("{idfind}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public T findById(@PathParam("idfind") int id) throws Exception {
        if (getFacade() != null) {
            T salida;
            salida = getFacade().findById(id);
            if (salida != null) {
                return salida;
            }
            throw new ControllerException(ControllerException.Message.ID_NO_ENCONTRADO);
        }
        throw new NullPointerException("Facade null");
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public T editElement(T registro) throws Exception {
        T salida;
        if (getFacade() != null) {
            salida = getFacade().edit(registro);
            if (salida != null) {
                return salida;
            }
            throw new ControllerException(ControllerException.Message.REGISTRO_NO_EDITADO);
        }
        throw new NullPointerException("Facade null");
    }

    @DELETE
    @Path("{iddelete}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public String deleteElement(@PathParam("iddelete") Integer id) throws Exception {
        if (id > 0) {
            if (getFacade() != null) {
                T encontrado = getFacade().findById(id);
                if (encontrado != null) {
                    return String.valueOf(getFacade().remove(encontrado));
                }
                throw new ControllerException(ControllerException.Message.REGISTRO_NO_ENCONTRADO);
            }
            throw new NullPointerException("Facade null");
        }
        throw new ControllerException(ControllerException.Message.PARAMETRO_INVALIDO);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public T create(T registro) throws Exception {//en vez de T Object
        if (registro != null) {//igual cero 0 y areglar registro != null && registro.getidtipoDoc == null
            if (getFacade() != null) {
                try {
                    T r = getFacade().create(registro);
                    if (r != null) {
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
    }
    
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN+"; charset=utf-8")
    public int count(){
        return getFacade().count();
    }
}
