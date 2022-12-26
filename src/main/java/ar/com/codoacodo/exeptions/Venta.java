package ar.com.codoacodo.exeptions;

import java.util.Date;

public class Venta {

	private String socios;
	private MedioDePago medioDePago;
	private Date fecha;
	private Double montoVenta;
	
	
	
	public Venta(String socios, MedioDePago medioDePago, Date fecha, Double montoVenta) {
		this.setSocios(socios);
		this.setMedioDePago(medioDePago);
		this.setFecha(fecha);
		this.setMontoVenta(montoVenta);
	}
	public String getSocios() {
		return socios;
	}
	public void setSocios(String socios) {
		this.socios = socios;
	}
	public MedioDePago getMedioDePago() {
		return medioDePago;
	}
	public void setMedioDePago(MedioDePago medioDePago) {
		this.medioDePago = medioDePago;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getMontoVenta() {
		return montoVenta;
	}
	public void setMontoVenta(Double montoVenta) {
		this.montoVenta = montoVenta;
	}
	
	
	
	
}
