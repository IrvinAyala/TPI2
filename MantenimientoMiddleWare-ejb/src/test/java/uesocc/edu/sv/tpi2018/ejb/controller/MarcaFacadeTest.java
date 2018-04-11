/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.ejb.controller;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.ClassRule;
import org.powermock.reflect.Whitebox;

import uesocc.edu.sv.tpi2018.ejb.entities.Marca;

/**
 *
 * @author danm
 */
public class MarcaFacadeTest {

    @ClassRule//Le puse esto por que con @Rule est objeto no puede ser statico
    public static EntityManagerProvider emp;

    static MarcaFacade mf = new MarcaFacade();

    @BeforeClass
    public static void init() {
        emp = EntityManagerProvider.getInstance("mantenimientoTestPU");
        Whitebox.setInternalState(mf, "em", emp.getEm());

    }

    @Test
    public void when_creating_null_marca_expect_false() {
        boolean result = mf.crear(null);

        assertEquals(0, mf.findAll().size());
        assertFalse(result);
    }

    @Test
    public void when_creating_new_marca_expect_true() {
        //paralelas
        Marca nuevaMarca = new Marca();
        nuevaMarca.setNombre("Test Marca");
        nuevaMarca.setActivo(true);

        boolean result = mf.crear(nuevaMarca);

        assertTrue(result);
        assertEquals(1, mf.findAll().size());
    }

    @Test
    public void when_modify_valid_marca_expect_true() {
        mf.getEntityManager().persist(new Marca(null, "test marca", true));

        Marca expected = new Marca(1, "changed marca", false);

        Marca result = mf.edit(expected);

        assertNotNull(result.getIdMarca());
        assertEquals(result.getNombre(), expected.getNombre());
    }

    @Test
    public void when_delete_null_marca_expect_false() {
        boolean result = mf.remove(null);
        assertEquals(0, mf.findAll().size());
        assertFalse(result);
    }

    @Test
    public void when_delete_valid_marca_expect_true() {
        mf.getEntityManager().persist(new Marca(null, "test marca", true));
        Marca entity = new Marca(1);
        boolean result = mf.remove(entity);
        assertTrue(result);
    }

    @Test
    public void testFindAll() {
        mf.getEntityManager().persist(new Marca(null, "test marca", true));
        mf.getEntityManager().persist(new Marca(null, "test marca", true));
        List<Marca> list = mf.findAll();
        assertEquals(2, list.size());
    }

    @Test
    public void when_find_valid_return_entity() {
        mf.getEntityManager().persist(new Marca(1, "test find", true));
        Marca result = mf.findById(1);
        assertEquals("test find", result.getNombre());
    }

    @Test
    public void when_find_invalid_return_entity() {
        Marca result = mf.findById(1);
        assertNull(result);
    }

    @Test
    public void testfindbynameLike() {
        mf.getEntityManager().persist(new Marca(null, "findName1", true));
        mf.getEntityManager().persist(new Marca(null, "findName2", true));
        mf.getEntityManager().persist(new Marca(null, "findName3", true));
        mf.getEntityManager().persist(new Marca(null, "findName4", true));
        List<Marca> result = mf.findByNameLike("findName", 0, 4);

        assertNotNull(result);
        assertEquals(4, result.size());

//        assertEquals(true, result.get(0).getNombre().contains("find4"));
    }

    @Test
    public void testCount() {
        mf.getEntityManager().persist(new Marca(null, "findRange1", true));
        mf.getEntityManager().persist(new Marca(null, "findRange2", true));

        assertEquals(2, mf.count());
    }

    @Test
    public void testFindRange() {
        mf.getEntityManager().persist(new Marca(null, "findRange1", true));
        mf.getEntityManager().persist(new Marca(null, "findRange2", true));
        mf.getEntityManager().persist(new Marca(null, "findRange3", true));
        mf.getEntityManager().persist(new Marca(null, "findRange4", true));
        List<Marca> result = mf.findRange(0, 4);

        assertNotNull(result);
        assertEquals(4, result.size());
    }

    @Before
    public void start() {
        mf.getEntityManager().getTransaction().begin();

    }

    @After
    public void cleanup() {
        //hacer mock de transacciones
        //paralelas
        mf.getEntityManager().getTransaction().rollback();
    }

    @AfterClass
    public static void tearDown() {
    }

}
