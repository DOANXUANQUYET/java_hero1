/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoret;

import com.demo.ws.SinhVien;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author doanxuanquyet
 */
@Path("api")
public class DemoRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DemoRest
     */
    public DemoRest() {
    }

    /**
     * Retrieves representation of an instance of demoret.DemoRest
     * @return an instance of com.demo.ws.SinhVien
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SinhVien getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of DemoRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(SinhVien content) {
    }
}
