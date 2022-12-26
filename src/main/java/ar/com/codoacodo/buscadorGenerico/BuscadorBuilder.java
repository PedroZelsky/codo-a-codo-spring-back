package ar.com.codoacodo.buscadorGenerico;

import java.util.HashMap;
import java.util.Map;

public class BuscadorBuilder {
	
	public static Map<String, IBuscador> buildMapBuscador(){
		
		Map<String,IBuscador> mapBuscadores = new HashMap<>();

		//Cargar
		
		mapBuscadores.put("Titulo", new BuscadorTitulo());
		mapBuscadores.put("Isbn", new BuscadorIsbn());
		mapBuscadores.put("Autor", new BuscadorAutor());
		
		return mapBuscadores;
	}

}
