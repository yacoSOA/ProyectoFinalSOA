/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author ycarmona
 */
@Path("comprasservicesport")
public class ComprasServicesPort {
    private com.services_client.ComprasServices port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ComprasServicesPort
     */
    public ComprasServicesPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method hello
     * @param name resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("hello/")
    public String getHello(@QueryParam("name") String name) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.hello(name);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private com.services_client.ComprasServices getPort() {
        try {
            // Call Web Service Operation
            com.services_client.ComprasServices_Service service = new com.services_client.ComprasServices_Service();
            com.services_client.ComprasServices p = service.getComprasServicesPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
