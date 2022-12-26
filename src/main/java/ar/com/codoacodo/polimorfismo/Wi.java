package ar.com.codoacodo.polimorfismo;

public class Wi extends Consola implements IJugable {
	
	private int cantidadMandos;
	
	public Wi(String nombre, String marca) {
		super(nombre,marca);
		this.setCantidadMandos(2);
	}
	


	public void jugar() {
		System.out.println(getNombre()+" "+getMarca()+" - jugando...");
	}
	
	
	public void setCantidadMandos(int cantidadMandos) {
		this.cantidadMandos = cantidadMandos;
	}



	public int getCantidadMandos() {
		return cantidadMandos;
	}
	
	
	
}
