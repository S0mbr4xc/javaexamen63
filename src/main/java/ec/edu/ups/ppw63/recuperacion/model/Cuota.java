package ec.edu.ups.ppw63.recuperacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cuota {
	
	@Id
	public int numero;
	public double capital;
	public double interes;
	public double total;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}
