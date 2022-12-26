package ar.com.codoacodo.buscadorGenerico;

import java.util.HashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;

public class MainBuscadorGenerico {

	public static void main(String[] args) {
		
		String tipoDeBusqueda = "algo";
		
		Map<String,IBuscador> mapBuscadores = BuscadorBuilder.buildMapBuscador();
		
		boolean existe = mapBuscadores.containsKey("tipoDeBusqueda");
		
		if (existe) {
			IBuscador buscador = mapBuscadores.get("tipoDeBusqueda");
			String dato = buscador.buscar();
			System.out.println(dato);
		}else {
			throw new RuntimeException("No existe el buscador " + tipoDeBusqueda);
		}
	}

}
