/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dekses.jersey.docker.demo;

import DAO.PacienteDAO;
import VO.Paciente;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Cristian
 */
@Path("pacientes")
public class PacienteService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Paciente> getPacientes_JSON() {
        List<Paciente> listOfCountries = PacienteDAO.getAllPacientes();
        return listOfCountries;
    }

    @GET
    @Path("/{paName}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Paciente getPaciente(@PathParam("paName") String paName) {
        return PacienteDAO.getPaciente(paName);
    }

    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Paciente addEmployee(Paciente pa) {
        return PacienteDAO.addPaciente(pa);
    }

}
