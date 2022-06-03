package com.quedg.medol.resource;

import com.quedg.medol.model.Measurement;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;




@Path("/")
public class MeasurementResource {
    @Path("measurement")
    @GET
    @Produces(  MediaType.APPLICATION_JSON)
    public Measurement getMeasurement() {
        return new Measurement();
    }
}