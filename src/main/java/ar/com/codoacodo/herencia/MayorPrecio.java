package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class MayorPrecio extends FiltroBase implements IFiltro{
	
 	
	public MayorPrecio (Articulo[] lista) {
		super("MAYORPRECIO",lista);
	}

	public void ordenar() {
		System.out.println("Ordenado por mayor precio");
		
		Arrays.sort(lista, (a,b) -> Float.compare(b.getPrecio(), a.getPrecio()));
	}

	public Articulo[] getLista() {
		return lista;
	}

	public void setLista(Articulo[] lista) {
		this.lista = lista;
	}

	
}
