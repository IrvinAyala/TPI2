/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.core.Dispatcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import uesocc.edu.sv.tpi2018.ejb.controller.MarcaFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Marca;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerException;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerExceptionMapper;
import uesocc.edu.sv.tpi2018.web.exceptions.WebExceptionMapper;
import uesocc.edu.sv.tpi2018.web.exceptions.NotFoundMapper;
import org.jboss.resteasy.mock.*;
import org.junit.Rule;

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
    public final Marca marca = new Marca(1, "Marca1", true);
    Integer id = 1;
    @Mock
    MarcaFacadeLocal mfl;
    Dispatcher dispatcher = MockDispatcherFactory.createDispatcher();
    public Client cliente = ClientBuilder.newClient();
    public WebTarget target = cliente.target("http://localhost:8080/MantenimientoMiddleWare-web-1.0-SNAPSHOT/webresources");
    

    @BeforeClass
    public static void setUpClass() throws Exception {
//        server = InMemoryRestServer.create(mr,ControllerExceptionMapper.class, WebExceptionMapper.class, NotFoundMapper.class);

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
//        server.close();
    }

    @Before
    public void setUp() throws Exception {
        server = InMemoryRestServer.create(mr, ControllerExceptionMapper.class, WebExceptionMapper.class, NotFoundMapper.class);
    }

    @After
    public void tearDown() {
        server.close();
    }

    /**
     * Test of getAll method, of class MarcaResource.
     */
    @Test
    public void testFindAllNotNullNotEmpty() {
        List<Marca> lista = new ArrayList<>();
        lista.add(marca);
        lista.add(new Marca(2, "Marca2", true));
        Mockito.when(this.mfl.findAll()).thenReturn(lista);
        Response response = server.newRequest("/marca").request().buildGet().invoke();
        Assert.assertNotNull(response);
        assertEquals(response.getStatus(), Response.Status.OK.getStatusCode());
        List<Marca> lista2 = response.readEntity(new GenericType<List<Marca>>() {
        });
        assertEquals(lista2.size(), 2);
        assertEquals(lista2.get(0).getIdMarca(), id);
    }

    @Test
    public void testFindAllInvalidParams() {
        Response response = server.newRequest("/marca?pagesize=-1").request().buildGet().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.PARAMETRO_INVALIDO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void testFindAllByRange() {
        List<Marca> lista = new ArrayList<>();
        lista.add(marca);
        lista.add(new Marca(2, "Marca2", true));
        lista.add(new Marca(3, "Marca3", false));
        lista.add(new Marca(4, "Marca4", false));
        Mockito.when(this.mfl.findRange(Matchers.anyInt(), Matchers.anyInt())).thenReturn(lista);
        Response response = server.newRequest("/marca/?pagesize=3&first=0").request().buildGet().invoke();
        Assert.assertNotNull(response);
        assertEquals(response.getStatus(), Response.Status.OK.getStatusCode());
        List<Marca> lista2 = response.readEntity(new GenericType<List<Marca>>() {
        });
        assertEquals(4, lista2.size());
    }

    @Test
    public void testFindByNameLike() {
        List<Marca> lista = new ArrayList<>();
        lista.add(marca);
        lista.add(new Marca(2, "Marca2", true));
        lista.add(new Marca(3, "Marca3", false));
        lista.add(new Marca(4, "Marca4", false));
        Mockito.when(this.mfl.findByNameLike(Matchers.anyString(), Matchers.anyInt(), Matchers.anyInt())).thenReturn(lista);
        Response response = server.newRequest("/marca/nombre/Marca?pagesize=3&first=0").request().buildGet().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        List<Marca> lista2 = response.readEntity(new GenericType<List<Marca>>() {
        });
        assertEquals(4, lista2.size());
    }

    @Test
    public void testFindByNameLikeInvalidParams() {
        Response response = server.newRequest("/marca/nombre/marca?pagesize=-1&first=-3").request().buildGet().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.PARAMETRO_INVALIDO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    /**
     * Test of create method, of class MarcaResource.
     */
    @Test
    public void testCreate() {
        Mockito.when(this.mfl.create(Matchers.any(Marca.class))).thenReturn(marca);
        Marca expMarca = new Marca(null, "Marca2", true);
        Response response = server.newRequest("/marca").request().buildPost(Entity.entity(expMarca, MediaType.APPLICATION_JSON)).invoke();
        Marca resultMarca = response.readEntity(Marca.class);
        Assert.assertNotNull(resultMarca);
        assertEquals(id, resultMarca.getIdMarca());
    }

    @Test
    public void testCreateReturnNull() {
        Mockito.when(this.mfl.create(Matchers.any(Marca.class))).thenReturn(null);
        Response response = server.newRequest("/marca").request().buildPost(Entity.entity(marca, MediaType.APPLICATION_JSON)).invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.REGISTRO_NO_CREADO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void testCreateExistingRegistry() {
        Mockito.when(this.mfl.create(Matchers.any(Marca.class))).thenThrow(EntityExistsException.class);
        Response response = server.newRequest("/marca").request().buildPost(Entity.entity(marca, MediaType.APPLICATION_JSON)).invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.REGISTRO_REPETIDO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void testFindByExistingId() {
        Mockito.when(this.mfl.findById(Matchers.anyInt())).thenReturn(null);
        Response response = server.newRequest("/marca/1").request().buildGet().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.ID_NO_ENCONTRADO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void testEditSuccesful() {
        Mockito.when(this.mfl.edit(Matchers.any(Marca.class))).thenReturn(marca);
        Response response = server.newRequest("/marca").request().buildPut(Entity.entity(marca, MediaType.APPLICATION_JSON)).invoke();
        Marca resultMarca = response.readEntity(Marca.class);
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(id, resultMarca.getIdMarca());
    }

    @Test
    public void testEditNonSuccesful() {
        Mockito.when(this.mfl.edit(Matchers.any(Marca.class))).thenReturn(null);
        Response response = server.newRequest("/marca").request().buildPut(Entity.entity(marca, MediaType.APPLICATION_JSON)).invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.REGISTRO_NO_EDITADO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void testDeleteBadIdTest() {
        Response response = server.newRequest("/marca/-1").request().buildDelete().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.PARAMETRO_INVALIDO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void testDeleteNonExistingRegistry() {
        Mockito.when(this.mfl.findById(Matchers.anyInt())).thenReturn(null);
        Response response = server.newRequest("/marca/1").request().buildDelete().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.REGISTRO_NO_ENCONTRADO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void testDeleteExistingRegistry() {
        Mockito.when(this.mfl.findById(Matchers.anyInt())).thenReturn(marca);
        Mockito.when(this.mfl.remove(Matchers.any(Marca.class))).thenReturn(true);
        Response response = server.newRequest("/marca/1").request(MediaType.APPLICATION_JSON).buildDelete().invoke();
        String result = response.readEntity(String.class);
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals("true", result);
    }
    @Ignore
    @Test
    public void testFindAllNotNullNotEmptyIT() {
        Integer id = 1;
        Response response = target.path("/marca").request(MediaType.APPLICATION_JSON).get();
        Assert.assertNotNull(response);
        List<Marca> resultLista = response.readEntity(new GenericType<List<Marca>>() {
        });
        Assert.assertNotNull(resultLista);
        assertEquals(3, resultLista.size());
        assertEquals(id, resultLista.get(0).getIdMarca());
    }

    @Ignore
    @Test
    public void testFindAllInvalidParamsIT() {
        Response response = target.path("/marca/-1").request(MediaType.APPLICATION_JSON).get();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.PARAMETRO_INVALIDO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }
    @Ignore
    @Test
    public void testFindAllByRangeIT() {
        Response response = target.path("/marca/?pagesize=3&first=0").request(MediaType.APPLICATION_JSON).get();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        List<Marca> lista = response.readEntity(new GenericType<List<Marca>>() {
        });
        assertEquals(3, lista.size());
    }
    @Ignore
    @Test
    public void testFindByNameLikeIT() {
        Response response = target.path("/marca/nombre/h?pagesize=3&first=0").request(MediaType.APPLICATION_JSON).get();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        List<Marca> lista2 = response.readEntity(new GenericType<List<Marca>>() {
        });
        assertEquals(1, lista2.size());
    }
}
