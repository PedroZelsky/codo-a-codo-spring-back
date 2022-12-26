package ar.com.codoacodo.polimorfismo;

public class MainConsola {

	public static void main(String[] args) {
		
		VendedorConsolas vc = new VendedorConsolas();
		IJugable algo = vc.vender();		
		algo.jugar();
		
		
	}
}
