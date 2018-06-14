/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.sql.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;
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
    @Path("/completos")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<OrdenTrabajo> getAll(@QueryParam("first") @DefaultValue("0") int first,
            @QueryParam("pagesize") @DefaultValue("1") int pagesize){
        List<OrdenTrabajo> list=null;
        if(otfl!=null){
            
            if(pagesize>0&&first>=0){
                list=otfl.getAll(first, pagesize);
            }
            if(list==null){
                throw new ControllerException(ControllerException.Message.PARAMETRO_INVALIDO);
            }
            return list;
            
        }
        throw new NullPointerException("facade es null");
    }
    
    @GET
    @Path("/correlativo/{codigo}")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<OrdenTrabajo> getByCorrelativo(@PathParam("codigo")String codigo){
           List<OrdenTrabajo> list=null;
        if(otfl!=null){
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
    @Path("/countFinalizadas")
    @Produces(MediaType.TEXT_PLAIN)
    public int countFinalizados(){
        return otfl.countFinalizadas();
        
    }
    
    @GET
    @Path("/filter")
    @Produces(MediaType.APPLICATION_JSON + "; charset=utf-8")
    public List<OrdenTrabajo> getbyFilter(@QueryParam("first") @DefaultValue("0") int first,
            @QueryParam("pagesize") @DefaultValue("1") int pagesize,@QueryParam("filter")String filter){
        System.out.println("string: "+filter);
        
      List<OrdenTrabajo> list=null;
      if(otfl!=null){
          if(filter!=null){
              list=otfl.getByFiltro(first, pagesize, filter);
              System.out.println(list);
          }
          if(list==null){
              throw new ControllerException(ControllerException.Message.PARAMETRO_INVALIDO);
          }
          return list;
      }
      throw new NullPointerException("El facade es null");
    }
    
    
}
