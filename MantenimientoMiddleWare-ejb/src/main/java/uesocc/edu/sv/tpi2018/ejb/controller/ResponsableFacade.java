/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uesocc.edu.sv.tpi2018.ejb.entities.Responsable;

/**
 *
 * @author irvin
 */
@Stateless
public class ResponsableFacade extends AbstractFacade<Responsable> implements ResponsableFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResponsableFacade() {
        super(Responsable.class,"Responsable.findByNombreLike");
    }
    
}
