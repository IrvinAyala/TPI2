/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import uesocc.edu.sv.tpi2018.ejb.entities.Equipo;
import uesocc.edu.sv.tpi2018.ejb.entities.Solicitud;

/**
 *
 * @author irvin
 */
@Stateless
public class SolicitudFacade extends AbstractFacade<Solicitud> implements SolicitudFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SolicitudFacade() {
        super(Solicitud.class);
    }

    @Override
    public List<Equipo> obtenerEstado(int id) {

        try {
            Query q = getEntityManager().createNamedQuery("Solicitud.estado");
            q.setParameter("idSolicitud", id);
            return q.getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }

        return Collections.emptyList();
    }
}
