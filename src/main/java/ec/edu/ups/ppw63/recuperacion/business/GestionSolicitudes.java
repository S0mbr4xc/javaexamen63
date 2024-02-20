package ec.edu.ups.ppw63.recuperacion.business;

import java.util.List;

import ec.edu.ups.ppw63.recuperacion.dao.SolicitudesDAO;
import ec.edu.ups.ppw63.recuperacion.model.Cuota;
import ec.edu.ups.ppw63.recuperacion.model.Solicitudes;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionSolicitudes {
	
	@Inject
	private SolicitudesDAO solicitudesDAO;
	
	@Inject GestionCuota cuo;
	
	Cuota cuota;
	
	public void guardar(Solicitudes solicitudes) {
		Solicitudes solicitud = solicitudesDAO.read(solicitudes.getId());
		if (solicitud != null) {
			solicitudesDAO.update(solicitud);
		}else {
			solicitudesDAO.insert(solicitud);
		}
		cuota = cuo.calculo(solicitud);
	}
	
	public Cuota getCuota() {
		return cuota;
	}
	
	public List<Solicitudes> getAll() {
		return solicitudesDAO.getAll();
	}
}
