package ec.edu.ups.ppw63.recuperacion.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Solicitudes")
public class Solicitudes {
	
	@Id
	private int id;
	
	private String cedulaCliente;
	private String nombreCliente;
	private String correoElectronico;
	private Date fecha;
	private double monto;
	private int meses;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getMeses() {
		return meses;
	}
	public void setMeses(int meses) {
		this.meses = meses;
	}
	@Override
	public String toString() {
		return "Solicitudes [id=" + id + ", cedulaCliente=" + cedulaCliente + ", nombreCliente=" + nombreCliente
				+ ", correoElectronico=" + correoElectronico + ", fecha=" + fecha + ", monto=" + monto + ", meses="
				+ meses + "]";
	}
	
	
}
