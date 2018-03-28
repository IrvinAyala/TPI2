/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import uesocc.edu.sv.tpi2018.ejb.entities.TipoMantenimiento;

/**
 *
 * @author katiro
 */
public class TipoMantenimientoFacadeTest {
    
    public TipoMantenimientoFacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class TipoMantenimientoFacade.
     */
//    @Test
//    public void testCreate() throws Exception {
//        System.out.println("create");
//        TipoMantenimiento entity = null;
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        TipoMantenimiento expResult = null;
//        TipoMantenimiento result = instance.create(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of edit method, of class TipoMantenimientoFacade.
//     */
//    @Test
//    public void testEdit() throws Exception {
//        System.out.println("edit");
//        TipoMantenimiento entity = null;
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        TipoMantenimiento expResult = null;
//        TipoMantenimiento result = instance.edit(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class TipoMantenimientoFacade.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        TipoMantenimiento entity = null;
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        boolean expResult = false;
//        boolean result = instance.remove(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class TipoMantenimientoFacade.
//     */
//    @Test
//    public void testFindById() throws Exception {
//        System.out.println("findById");
//        Object id = null;
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        TipoMantenimiento expResult = null;
//        TipoMantenimiento result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findAll method, of class TipoMantenimientoFacade.
//     */
//    @Test
//    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        List<TipoMantenimiento> expResult = null;
//        List<TipoMantenimiento> result = instance.findAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findRange method, of class TipoMantenimientoFacade.
//     */
//    @Test
//    public void testFindRange() throws Exception {
//        System.out.println("findRange");
//        int desde = 0;
//        int pageSize = 0;
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        List<TipoMantenimiento> expResult = null;
//        List<TipoMantenimiento> result = instance.findRange(desde, pageSize);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of count method, of class TipoMantenimientoFacade.
//     */
//    @Test
//    public void testCount() throws Exception {
//        System.out.println("count");
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        int expResult = 0;
//        int result = instance.count();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findByNameLike method, of class TipoMantenimientoFacade.
     */
    @Test
    public void testFindByNameLike() throws Exception {
        System.out.println("findByNameLike");
        String name = "";
        int first = 0;
        int pageSize = 0;
        //EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
        List<TipoMantenimiento> expResult = null;
        List<TipoMantenimiento> result = instance.findByNameLike(name, first, pageSize);
        assertEquals(expResult, result);
        //container.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
