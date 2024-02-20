package ec.edu.ups.ppw63.recuperacion.services;

import java.util.Date;
import java.util.List;

import ec.edu.ups.ppw63.recuperacion.business.GestionSolicitudes;
import ec.edu.ups.ppw63.recuperacion.model.Cuota;
import ec.edu.ups.ppw63.recuperacion.model.Solicitudes;
import jakarta.ws.rs.Produces;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("solicitudes")
public class SolicitudesServices {
	
	@Inject
	private GestionSolicitudes gd;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response post(Solicitudes sol) {
		try {
			System.out.println(sol.toString());
			gd.guardar(sol);
			return Response.ok(sol).build();
		} catch (Exception e) {
			ErrorMessage em = new ErrorMessage(1, e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
					.entity(em)
					.build();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("list")
	public Response getSolicitudes() {
		List<Solicitudes> list = gd.getAll();
		if(list.size()>0) {
			return Response.ok(list).build();
		}else {
			ErrorMessage em = new ErrorMessage(2, "No hay nada");
			return Response.status(Response.Status.NOT_FOUND)
					.entity(em)
					.build();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("list/cuotas")
	public Response getCuotas() {
		try {
			Cuota cuo = gd.getCuota();
			return Response.ok(cuo).build();
		}catch(Exception e) {
			ErrorMessage em = new ErrorMessage(2,e.getMessage());
			return Response.status(Response.Status.NOT_FOUND)
					.entity(em)
					.build();
		}
	}
}
