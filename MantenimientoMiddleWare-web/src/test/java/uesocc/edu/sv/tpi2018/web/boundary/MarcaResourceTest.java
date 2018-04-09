/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import java.util.ArrayList;
import java.util.List;
import javax.json.JsonObject;
import javax.persistence.EntityExistsException;
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
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.Whitebox;
import org.mockito.runners.MockitoJUnitRunner;
import uesocc.edu.sv.tpi2018.ejb.controller.MarcaFacadeLocal;
import uesocc.edu.sv.tpi2018.ejb.entities.Marca;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerException;
import uesocc.edu.sv.tpi2018.web.exceptions.ControllerExceptionMapper;
import uesocc.edu.sv.tpi2018.web.exceptions.ExceptionMapper;
import uesocc.edu.sv.tpi2018.web.exceptions.NotFoundMapper;

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

    @BeforeClass
    public static void setUpClass() throws Exception {
//        server = InMemoryRestServer.create(mr,ControllerExceptionMapper.class, ExceptionMapper.class, NotFoundMapper.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
//        server.close();
    }

    @Before
    public void setUp() throws Exception {
        server = InMemoryRestServer.create(mr, ControllerExceptionMapper.class, ExceptionMapper.class, NotFoundMapper.class);
    }

    @After
    public void tearDown() {
        server.close();
    }

    /**
     * Test of getAll method, of class MarcaResource.
     */
    @Test
    public void findAllNotNullNotEmptyTest() throws Exception {
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
    public void findAllInvalidParamsTest() throws Exception {
        Response response = server.newRequest("/marca?pagesize=-1").request().buildGet().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.PARAMETRO_INVALIDO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void findAllByRangeTest() {
        List<Marca> lista = new ArrayList<>();
        lista.add(marca);
        lista.add(new Marca(2, "Marca2", true));
        lista.add(new Marca(3, "Marca3", false));
        lista.add(new Marca(4, "Marca4", false));
        Mockito.when(this.mfl.findRange(Matchers.anyInt(), Matchers.anyInt())).thenReturn(lista);
        Response response = server.newRequest("/marca?pagesize=3&first=0").request().buildGet().invoke();
        Assert.assertNotNull(response);
        assertEquals(response.getStatus(), Response.Status.OK.getStatusCode());
        List<Marca> lista2 = response.readEntity(new GenericType<List<Marca>>() {
        });
        assertEquals(4, lista2.size());
    }

    /**
     * Test of create method, of class MarcaResource.
     */
    @Test
    public void createTest() {
        Mockito.when(this.mfl.create(Matchers.any(Marca.class))).thenReturn(marca);
        Marca expMarca = new Marca(null, "Marca2", true);
        Response response = server.newRequest("/marca").request().buildPost(Entity.entity(expMarca, MediaType.APPLICATION_JSON)).invoke();
        Marca resultMarca = response.readEntity(Marca.class);
        Assert.assertNotNull(resultMarca);
        assertEquals(id, resultMarca.getIdMarca());
    }

    @Test
    public void createReturnNullTest() {
        Mockito.when(this.mfl.create(Matchers.any(Marca.class))).thenReturn(null);
        Response response = server.newRequest("/marca").request().buildPost(Entity.entity(marca, MediaType.APPLICATION_JSON)).invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.REGISTRO_NO_CREADO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void createExistingRegistryTest() {
        Mockito.when(this.mfl.create(Matchers.any(Marca.class))).thenThrow(EntityExistsException.class);
        Response response = server.newRequest("/marca").request().buildPost(Entity.entity(marca, MediaType.APPLICATION_JSON)).invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.REGISTRO_REPETIDO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }

    @Test
    public void findByExistingIdTest() {
        Mockito.when(this.mfl.findById(Matchers.anyInt())).thenReturn(null);
        Response response = server.newRequest("/marca/1").request().buildGet().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.ID_NO_ENCONTRADO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }
    
    @Test
    public void editSuccesfulTest(){
        Mockito.when(this.mfl.edit(Matchers.any(Marca.class))).thenReturn(marca);
        Response response = server.newRequest("/marca").request().buildPut(Entity.entity(marca, MediaType.APPLICATION_JSON)).invoke();
        Marca resultMarca = response.readEntity(Marca.class);
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(id, resultMarca.getIdMarca());
    }
    
    @Test
    public void editNonSuccesfulTest(){
        Mockito.when(this.mfl.edit(Matchers.any(Marca.class))).thenReturn(null);
        Response response = server.newRequest("/marca").request().buildPut(Entity.entity(marca, MediaType.APPLICATION_JSON)).invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.REGISTRO_NO_EDITADO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }
    
    @Test
    public void deleteBadIdTest(){
        Response response = server.newRequest("/marca/-1").request().buildDelete().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.PARAMETRO_INVALIDO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }
    
    @Test
    public void deleteNonExistingRegistry(){
        Mockito.when(this.mfl.findById(Matchers.anyInt())).thenReturn(null);
        Response response = server.newRequest("/marca/1").request().buildDelete().invoke();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals(ControllerException.Message.REGISTRO_NO_ENCONTRADO.getErrorMessage(), response.getHeaderString("controller-exception"));
    }
    
    @Test
    public void deleteExistingRegistry(){
        Mockito.when(this.mfl.findById(Matchers.anyInt())).thenReturn(marca);
        Mockito.when(this.mfl.remove(Matchers.any(Marca.class))).thenReturn(true);
        Response response = server.newRequest("/marca/1").request(MediaType.APPLICATION_JSON).buildDelete().invoke();
        String result = response.readEntity(String.class);
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        assertEquals("true", result);
    }
}
