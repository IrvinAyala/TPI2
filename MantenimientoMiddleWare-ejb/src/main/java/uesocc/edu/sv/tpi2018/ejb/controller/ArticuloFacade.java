/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import uesocc.edu.sv.tpi2018.ejb.entities.Articulo;

/**
 *
 * @author irvin
 */
@Stateless
public class ArticuloFacade extends AbstractFacade<Articulo> implements ArticuloFacadeLocal {

    @PersistenceContext(unitName = "mantenimientoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArticuloFacade() {
        super(Articulo.class,"Articulo.findByNombreLike");
    }

    @Override
    public List<Articulo> findByIdEquipo(int idEquipo) {
        Query q = getEntityManager().createNamedQuery("Articulo.findByIdEquipo");
        q.setParameter("idEquipo", idEquipo);
        return q.getResultList();
    }
    
}
