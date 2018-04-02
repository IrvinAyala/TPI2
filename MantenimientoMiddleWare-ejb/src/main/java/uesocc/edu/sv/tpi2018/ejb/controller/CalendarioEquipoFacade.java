/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uesocc.edu.sv.tpi2018.ejb.entities.CalendarioEquipo;

/**
 *
 * @author irvin
 */
@Stateless
public class CalendarioEquipoFacade extends AbstractFacade<CalendarioEquipo> implements CalendarioEquipoFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CalendarioEquipoFacade() {
        super(CalendarioEquipo.class);
    }
    
}
