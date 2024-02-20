package ec.edu.ups.ppw63.recuperacion.dao;

import java.util.List;

import jakarta.persistence.Query;

import ec.edu.ups.ppw63.recuperacion.model.Solicitudes;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class SolicitudesDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Solicitudes solicitud) {
		em.persist(solicitud);
	}
	
	public Solicitudes read(int codigo) {
		Solicitudes solicitud = em.find(Solicitudes.class, codigo);
		return solicitud;
	}
	
	public void update (Solicitudes solicitud) {
		em.merge(solicitud);
	}
	
	public List<Solicitudes> getAll(){
		String jpql = "SELECT c FROM Solicitudes c";
		Query q = em.createQuery(jpql, Solicitudes.class);
		return q.getResultList();
	}
}
