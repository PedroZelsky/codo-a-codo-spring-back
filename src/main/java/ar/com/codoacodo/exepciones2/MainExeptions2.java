package ar.com.codoacodo.exepciones2;

import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.Buscador;

public class MainExeptions2 {

	public static void main(String[] args) {
		
		String clave = "Harry Potter";
		
		Buscador buscador = new Buscador(clave);
		
		buscador.buscar();

		
	}

}
