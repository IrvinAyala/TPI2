/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.transaction.UserTransaction;
import junit.framework.Assert;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import uesocc.edu.sv.tpi2018.ejb.entities.TipoMantenimiento;

/**
 *
 * @author katiro
 */
@RunWith(Arquillian.class)
public class TipoMantenimientoFacadeTest {

    @Deployment
    public static WebArchive createDeployment() {
        WebArchive salida = ShrinkWrap.create(WebArchive.class)
                .addPackage(TipoMantenimiento.class.getPackage())
                .addAsWebInfResource("glassfish-resources.xml")
//                .addClass(AbstractFacade.class)
//                .addClass(AbstractInterface.class)
                .addPackage(TipoMantenimientoFacade.class.getPackage())
                .addAsResource("test-persistence.xml", "persistence.xml")
                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
        System.out.println(salida);

        return salida;

    }

    @EJB
    TipoMantenimientoFacadeLocal tmf;
    
    @Inject
    UserTransaction tx;

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
     * Test of findByNameLike method, of class TipoMantenimientoFacade.
     */
//    @Test
//    public void testFindByNameLike() throws Exception {
//        System.out.println("findByNameLike");
//        String name = "";
//        int first = 0;
//        int pagesize = 0;
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        List<TipoMantenimiento> expResult = null;
//        List<TipoMantenimiento> result = instance.findByNameLike(name, first, pagesize);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of create method, of class TipoMantenimientoFacade.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        TipoMantenimiento tm = new TipoMantenimiento();
        tm.setNombre("TipoMantenimiento1");
        TipoMantenimiento tm2 = new TipoMantenimiento();
        tm.setNombre("TipoMantenimiento2");
        try {
            tx.begin();
            tmf.create(tm);
            tmf.crear(tm2);
            tx.commit();
        } catch (Exception e) {
        }
        Assert.assertNotNull(tm.getIdTipoMantenimiento());
        Assert.assertNotNull(tm2.getIdTipoMantenimiento());

    }

//    /**
//     * Test of crear method, of class TipoMantenimientoFacade.
//     */
//    @Test
//    public void testCrear() throws Exception {
//        System.out.println("crear");
//        TipoMantenimiento entity = null;
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        boolean expResult = false;
//        boolean result = instance.crear(entity);
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
//     * Test of editar method, of class TipoMantenimientoFacade.
//     */
//    @Test
//    public void testEditar() throws Exception {
//        System.out.println("editar");
//        TipoMantenimiento entity = null;
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        boolean expResult = false;
//        boolean result = instance.editar(entity);
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
//        int first = 0;
//        int pageSize = 0;
//        TipoMantenimientoFacade instance = new TipoMantenimientoFacade();
//        List<TipoMantenimiento> expResult = null;
//        List<TipoMantenimiento> result = instance.findRange(first, pageSize);
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
//    
}
