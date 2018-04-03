/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uesocc.edu.sv.tpi2018.ejb.entities.Unidad;

/**
 *
 * @author irvin
 */
@Stateless
public class UnidadFacade extends AbstractFacade<Unidad> implements UnidadFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UnidadFacade() {
        super(Unidad.class,"Unidad.findByNombreLike");
    }
    
}
