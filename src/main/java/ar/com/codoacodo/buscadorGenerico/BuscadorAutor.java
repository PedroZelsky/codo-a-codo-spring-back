package ar.com.codoacodo.buscadorGenerico;

public class BuscadorAutor implements IBuscador{

	public String buscar() {
		System.out.println("Buscando autor...");
		return "JK Rowlling";
	}

}
