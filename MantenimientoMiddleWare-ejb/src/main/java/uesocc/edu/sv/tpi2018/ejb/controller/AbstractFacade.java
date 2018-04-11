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
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author irvin
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;
    private String query;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public AbstractFacade(Class<T> entityClass, String query) {
        this.entityClass = entityClass;
        this.query=query;
    }
    
    
    public List<T> findByNameLike(String name, int first, int pagesize) {
         if (!(name.isEmpty())) {
              if(query!=null){
            try {
               
                Query q = getEntityManager().createNamedQuery(query);
                q.setParameter("name", name);
                q.setMaxResults(pagesize);
                q.setFirstResult(first);
                return q.getResultList();
            } catch (Exception e) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
            }
        }
         }
        return Collections.emptyList();
    }


    protected abstract EntityManager getEntityManager();

    public T create(T entity) {
        T salida = null;
        try {//propagar excepciones - 
            EntityManager em = getEntityManager();
            if (em != null && entity != null) {
                em.persist(entity);
                salida = entity;
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return salida;
    }

    public boolean crear(T entity) {
        boolean salida = false;
        T e = this.create(entity);
        if (e != null) {
            salida = true;
        }
        return salida;
    }

    public T edit(T entity) {
        T salida = null;
        try {
            EntityManager em = getEntityManager();
            if (em != null && entity != null) {
                em.merge(entity);
                salida = entity;
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
        return salida;
    }

    public boolean editar(T entity) {
        boolean salida = false;
        T e = this.edit(entity);
        if (e != null) {
            salida = true;
        }
        return salida;
    }

    public boolean remove(T entity) {
        try {
            getEntityManager().remove(getEntityManager().merge(entity));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public T findById(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }

    public List<T> findRange(int first, int pageSize) {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        q.setMaxResults(pageSize);
        q.setFirstResult(first);
        return q.getResultList();
    }

    public int count() {
        javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        javax.persistence.criteria.Root<T> rt = cq.from(entityClass);
        cq.select(getEntityManager().getCriteriaBuilder().count(rt));
        javax.persistence.Query q = getEntityManager().createQuery(cq);
        return ((Long) q.getSingleResult()).intValue();
    }
}
