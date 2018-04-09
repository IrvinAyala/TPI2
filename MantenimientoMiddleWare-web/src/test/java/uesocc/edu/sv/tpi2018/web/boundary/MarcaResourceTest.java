/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.InstanceOf;
import org.mockito.runners.MockitoJUnitRunner;
import uesocc.edu.sv.tpi2018.ejb.controller.MarcaFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Marca;

/**
 *
 * @author doratt
 */
@RunWith(MockitoJUnitRunner.class)
public class MarcaResourceTest {

    public MarcaResourceTest() {
    }
    @InjectMocks
    public static MarcaResource mr = new MarcaResource();
    public static InMemoryRestServer server;
    @Mock
    MarcaFacadeLocal mfl;

    @BeforeClass
    public static void setUpClass() throws Exception {
        server = InMemoryRestServer.create(mr);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        server.close();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class MarcaResource.
     */
    @Test
    public void getAllTest() {
        Integer id = 1;
        List<Marca> lista = new ArrayList<>();
        lista.add(new Marca(1, "Marca1", true));
        lista.add(new Marca(2, "Marca2", true));
        Mockito.when(this.mfl.findAll()).thenReturn(lista);
        Response response = server.newRequest("/marca").request().buildGet().invoke();
        assertEquals(response.getStatus(), Response.Status.OK.getStatusCode());
        List<Marca> lista2 = response.readEntity(new GenericType<List<Marca>>() {
        });
        assertEquals(lista2.size(), 2);
        assertEquals(lista2.get(0).getIdMarca(), id);
    }

    /**
     * Test of create method, of class MarcaResource.
     */
    @Test
    public void createTest() {
        Integer id = 1;
        Mockito.when(this.mfl.create(Matchers.any(Marca.class))).thenReturn(new Marca(1, "Marca 2", true));
        Marca expMarca = new Marca(null, "Marca2", true);
        Response response = server.newRequest("/marca").request().buildPost(Entity.entity(expMarca, MediaType.APPLICATION_JSON)).invoke();
        Marca resultMarca = response.readEntity(Marca.class);
        Assert.assertNotNull(resultMarca);
        assertEquals(id, resultMarca.getIdMarca());
        
    }
}
