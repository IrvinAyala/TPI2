/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import uesocc.edu.sv.tpi2018.ejb.entities.OrdenTrabajo;

/**
 *
 * @author irvin
 */
@Stateless
public class OrdenTrabajoFacade extends AbstractFacade<OrdenTrabajo> implements OrdenTrabajoFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdenTrabajoFacade() {
        super(OrdenTrabajo.class);
    }

    @Override
    public List<OrdenTrabajo> getByDate(Date date) {
        if(date!=null){
        try {
            Query q = getEntityManager().createNamedQuery("OrdenTrabajo.findcompletosByFecha");
            q.setParameter("fecha", date);
            return q.getResultList();
        } catch (Exception e) {
            
        }
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<OrdenTrabajo> getByUser(String name) {
        if(!name.isEmpty()){
            try {
                Query q = getEntityManager().createNamedQuery("OrdenTrabajo.findCompletosByUsuario");
                q.setParameter("name", name);
                q.getResultList();
            } catch (Exception e) {
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public List<OrdenTrabajo> getByCorrelativo(String correlativo) {
    if(!correlativo.isEmpty()){
            try {
                Query q = getEntityManager().createNamedQuery("OrdenTrabajo.findcompletosByCorrelativo");
                q.setParameter("codigo", correlativo);
                q.getResultList();
            } catch (Exception e) {
            }
        }
        return Collections.EMPTY_LIST;
    }
    
    @Override
    public List<OrdenTrabajo> obtenerOrdenesNoTerminadas(int first, int pagesize){
        try {
            Query q = getEntityManager().createNamedQuery("OrdenTrabajo.noCompletado");
            q.setFirstResult(first);
            q.setMaxResults(pagesize);
            return q.getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return Collections.emptyList();
    }
}
