/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.sql.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import uesocc.edu.sv.tpi2018.ejb.controller.AbstractInterface;
import uesocc.edu.sv.tpi2018.ejb.controller.OrdenTrabajoFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajo;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerException;

/**
 *
 * @author andrea
 */
@Path("ordentrabajo")
public class OrdenTrabajoResource extends AbstractResource<OrdenTrabajo>{
    
    @EJB
    OrdenTrabajoFacadeLocal otfl;

    @Override
    protected AbstractInterface<OrdenTrabajo> getFacade() {
        return otfl;
    }

    @Override
    protected OrdenTrabajo crearNuevo() {
        return new OrdenTrabajo();
    }

    
    @GET
    @Path("/fecha/{fecha}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<OrdenTrabajo> getByDate(@PathParam("fecha")Date date){
        List<OrdenTrabajo> list=null;
        if(getFacade()!=null){
            if(date!=null){
                 list= otfl.getByDate(date);
            }
            if(list==null){
                throw new ControllerException(ControllerException.Message.PARAMETRO_INVALIDO);
            }
           return list;
        }
        throw new NullPointerException("El facade es null");
                
    }
    
    @GET
    @Path("/user/{user}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<OrdenTrabajo> getByUser(@PathParam("user")String user){
           List<OrdenTrabajo> list=null;
        if(getFacade()!=null){
            if(!user.isEmpty()){
                 list= otfl.getByUser(user);
            }
            if(list==null){
                throw new ControllerException(ControllerException.Message.PARAMETRO_INVALIDO);
            }
           return list;
        }
        throw new NullPointerException("El facade es null");
    }
    
    @GET
    @Path("/correlativo/{codigo}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<OrdenTrabajo> getByCorrelativo(@PathParam("codigo")String codigo){
           List<OrdenTrabajo> list=null;
        if(getFacade()!=null){
            if(!codigo.isEmpty()){
                 list= otfl.getByCorrelativo(codigo);
            }
            if(list==null){
                throw new ControllerException(ControllerException.Message.PARAMETRO_INVALIDO);
            }
           return list;
        }
        throw new NullPointerException("El facade es null");
    }
    
    @GET
    @Path("/noFinalizadas")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<OrdenTrabajo> obtenerOrdenesNoTerminadas(){
           List<OrdenTrabajo> list=null;
        if(getFacade()!=null){
            list = otfl.obtenerOrdenesNoTerminadas();
            if(list==null){
                throw new ControllerException(ControllerException.Message.NO_HAY_REGISTROS);
            }
           return list;
        }
        throw new NullPointerException("El facade es null");
    }


}
