/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.tpi2018.web.boundary;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
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
import org.mockito.runners.MockitoJUnitRunner;
import uesocc.edu.sv.tpi2018.ejb.entities.Marca;

/**
 *
 * @author doratt
 */
@RunWith(MockitoJUnitRunner.class)
public class IntegrationIT {

    public IntegrationIT() {
    }

    public Client cliente = ClientBuilder.newClient();
    public WebTarget target = cliente.target("http://192.168.43.50:8080/MantenimientoMiddleWare-web-1.0-SNAPSHOT/webresources");
    

    @BeforeClass
    public static void setUpClass() throws Exception {
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
//        server.close();
    }

    @Before
    public void setUp() throws Exception {
        
    }

    @After
    public void tearDown() {
        
    }

    
    @Test
    public void getAllMarcasTest(){
        Response response = target.path("/marca/1").request(MediaType.APPLICATION_JSON).get();
        Assert.assertNotNull(response);
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
        Marca m = response.readEntity(Marca.class);
        assertEquals(new Integer(1), m.getIdMarca());
    }
    
}
