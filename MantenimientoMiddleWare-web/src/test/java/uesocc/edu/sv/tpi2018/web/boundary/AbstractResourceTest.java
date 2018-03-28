/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danm
 */
public class AbstractResourceTest {

    private class FakeResource extends AbstractResource<Fake> {

        @Override
        protected AbstractInterface<Fake> getFacade() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        protected Fake crearNuevo() {
            return new Fake();
        }
        
    }
    
    private class Fake{
        String name;

        
        public Fake() {
        }
        public Fake(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
        
    }

    public AbstractResourceTest() {
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
     * Test of getFacade method, of class AbstractResource.
     */
    @Test
    public void testGetFacade() {
        System.out.println("getFacade");
        AbstractResource instance = new AbstractResourceImpl();
        AbstractInterface expResult = null;
        AbstractInterface result = instance.getFacade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AbstractResource.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        int first = 0;
        int pagesize = 0;
        AbstractResource instance = new AbstractResourceImpl();
        List expResult = null;
        List result = instance.findAll(first, pagesize);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearNuevo method, of class AbstractResource.
     */
    @Test
    public void testCrearNuevo() {
        System.out.println("crearNuevo");
        AbstractResource instance = new AbstractResourceImpl();
        Object expResult = null;
        Object result = instance.crearNuevo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class AbstractResource.
     */
    @Test
    public void testFindById() throws Exception {
        System.out.println("findById");
        long id = 0L;
        AbstractResource instance = new AbstractResourceImpl();
        Object expResult = null;
        Object result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editElement method, of class AbstractResource.
     */
    @Test
    public void testEditElement() throws Exception {
        System.out.println("editElement");
        Object registro = null;
        AbstractResource instance = new AbstractResourceImpl();
        Object expResult = null;
        Object result = instance.editElement(registro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteElement method, of class AbstractResource.
     */
    @Test
    public void testDeleteElement() throws Exception {
        System.out.println("deleteElement");
        Integer id = null;
        AbstractResource instance = new AbstractResourceImpl();
        boolean expResult = false;
        boolean result = instance.deleteElement(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class AbstractResource.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Object registro = null;
        AbstractResource instance = new AbstractResourceImpl();
        Object expResult = null;
        Object result = instance.create(registro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractResourceImpl extends AbstractResource {

        public AbstractInterface<T> getFacade() {
            return null;
        }

        public T crearNuevo() {
            return null;
        }
    }

}
