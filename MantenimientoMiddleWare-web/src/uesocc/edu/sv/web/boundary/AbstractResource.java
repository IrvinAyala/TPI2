
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import sv.edu.uesocc.ingenieria.prn335_2016.inventario.datos.acesso.AbstractInterface;

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
    public List<T> findAll() {
        List<T> salida = null;

        if (getFacade() != null) {
            salida = getFacade().findAll();
        }

        if (salida == null) {
            salida = new ArrayList<>();
        }

        return salida;
    }

    protected abstract T crearNuevo();

    @GET
    @Path("{idfind}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public T findById(@PathParam("idfind") long id) {

        T salida = null;

        if (getFacade() != null) {
            salida = getFacade().find(id);
        }
        if (salida == null) {
            salida = crearNuevo();  //Aquí va la excepcion
        }
        return salida;
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public boolean editElement(T registro) {

        try {

            return getFacade().edit(registro);

        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }

        return false;
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
    public T create(T registro) {
        if (registro != null) {//igual cero 0 y areglar registro != null && registro.getidtipoDoc == null
            if (getFacade() != null) {
                T r = getFacade().crear(registro);
                if (r != null) {
                    return r;
                }
            }
        }
        return crearNuevo(); //Aquí va la excepcion
    }

}
