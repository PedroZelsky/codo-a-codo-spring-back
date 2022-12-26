package ar.com.codoacodo.polimorfismo;

public class XBox extends Consola implements IJugable {
	
	public XBox(String nombre, String marca) {
		super(nombre, marca);
	}

	public void jugar() {
		System.out.println(getNombre()+" "+getMarca()+" - jugando...");
	}
	
}
