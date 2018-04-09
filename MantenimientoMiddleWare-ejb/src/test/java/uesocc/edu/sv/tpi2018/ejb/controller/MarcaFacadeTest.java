/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import uesocc.edu.sv.tpi2018.ejb.entities.Marca;

/**
 *
 * @author doratt
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(value = {Persistence.class, EntityManagerFactory.class})

public class MarcaFacadeTest {

    
    MarcaFacade mf = new MarcaFacade();
    
    EntityManagerFactory mockedEMF = Mockito.mock(EntityManagerFactory.class);
    EntityManager ema = Mockito.mock(EntityManager.class);
    public MarcaFacadeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void inicializar() {
        PowerMockito.mockStatic(Persistence.class);
        PowerMockito.mockStatic(EntityManagerFactory.class);
        PowerMockito.when(Persistence.createEntityManagerFactory(Matchers.anyString())).thenReturn(mockedEMF);
        PowerMockito.when(mockedEMF.createEntityManager()).thenReturn(ema);
        PowerMockito.doNothing().when(ema).persist(Marca.class);
        
       
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of create method, of class MarcaFacade.
     */
    @Test
    public void testCreate() throws Exception {
        mf.setEm(ema);
        System.out.println("create");
        Marca result = mf.create(new Marca());
        Marca expResult = new Marca();

        assertEquals(expResult.getClass(), result.getClass());

//        
//        Marca entity = null;
//        MarcaFacade instance = new MarcaFacade();
//        Marca expResult = null;
//        Marca result = instance.create(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of crear method, of class MarcaFacade.
     */
//    @Test
//    public void testCrear() throws Exception {
//        System.out.println("crear");
//        Marca entity = null;
//        MarcaFacade instance = new MarcaFacade();
//        boolean expResult = false;
//        boolean result = instance.crear(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of edit method, of class MarcaFacade.
//     */
//    @Test
//    public void testEdit() throws Exception {
//        System.out.println("edit");
//        Marca entity = null;
//        MarcaFacade instance = new MarcaFacade();
//        Marca expResult = null;
//        Marca result = instance.edit(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of editar method, of class MarcaFacade.
//     */
//    @Test
//    public void testEditar() throws Exception {
//        System.out.println("editar");
//        Marca entity = null;
//        MarcaFacade instance = new MarcaFacade();
//        boolean expResult = false;
//        boolean result = instance.editar(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of remove method, of class MarcaFacade.
//     */
//    @Test
//    public void testRemove() throws Exception {
//        System.out.println("remove");
//        Marca entity = null;
//        MarcaFacade instance = new MarcaFacade();
//        boolean expResult = false;
//        boolean result = instance.remove(entity);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findById method, of class MarcaFacade.
//     */
//    @Test
//    public void testFindById() throws Exception {
//        System.out.println("findById");
//        Object id = null;
//        MarcaFacade instance = new MarcaFacade();
//        Marca expResult = null;
//        Marca result = instance.findById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findAll method, of class MarcaFacade.
//     */
//    @Test
//    public void testFindAll() throws Exception {
//        System.out.println("findAll");
//        MarcaFacade instance = new MarcaFacade();
//        List<Marca> expResult = null;
//        List<Marca> result = instance.findAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of findRange method, of class MarcaFacade.
//     */
//    @Test
//    public void testFindRange() throws Exception {
//        System.out.println("findRange");
//        int first = 0;
//        int pageSize = 0;
//        MarcaFacade instance = new MarcaFacade();
//        List<Marca> expResult = null;
//        List<Marca> result = instance.findRange(first, pageSize);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of count method, of class MarcaFacade.
//     */
//    @Test
//    public void testCount() throws Exception {
//        System.out.println("count");
//        MarcaFacade instance = new MarcaFacade();
//        int expResult = 0;
//        int result = instance.count();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
