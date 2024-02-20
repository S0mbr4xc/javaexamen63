package ec.edu.ups.ppw63.recuperacion.business;

import java.util.Date;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import ec.edu.ups.ppw63.recuperacion.dao.SolicitudesDAO;
import ec.edu.ups.ppw63.recuperacion.model.Solicitudes;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class GestionDatos {
	@Inject
	private SolicitudesDAO dao;
	@Inject
	private GestionCuota cuo;
	
	
	@PostConstruct
	public void init() {
		
		System.out.println("Iniciando");
		Solicitudes sol = new Solicitudes();
		sol.setId(1);
		sol.setNombreCliente("Esteban");
		sol.setCedulaCliente("0106785678");
		sol.setCorreoElectronico("ayuda@mequieromorir.com");
		sol.setFecha(new Date());
		sol.setMonto(500);
		sol.setMeses(3);
		
		dao.insert(sol);
		cuo.calculo(sol);
		
		System.out.println(sol.toString());
	}
}
