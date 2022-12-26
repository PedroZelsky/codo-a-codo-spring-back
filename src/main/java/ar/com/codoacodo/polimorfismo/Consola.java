package ar.com.codoacodo.polimorfismo;

public class Consola {

	private String nombre;
	private String marca;
	
	private boolean encendida;
	
	
	
	public Consola(String nombre, String marca) {
		this.nombre = nombre;
		this.marca = marca;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
}
