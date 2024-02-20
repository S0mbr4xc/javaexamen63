package ec.edu.ups.ppw63.recuperacion.business;

import ec.edu.ups.ppw63.recuperacion.model.Cuota;
import ec.edu.ups.ppw63.recuperacion.model.Solicitudes;
import jakarta.ejb.Stateless;

@Stateless
public class GestionCuota {
	
	public Cuota calculo(Solicitudes sol) {
		Cuota c = new Cuota();
		double interes = sol.getMonto()*0.1;
		c.setCapital(sol.getMonto()/sol.getMeses());
		c.setInteres(c.getCapital()*0.1);
		c.setNumero(sol.getId());
		c.setTotal(c.getInteres()+c.getCapital());
		return c;
	}
}
