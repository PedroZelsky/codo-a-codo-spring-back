package ar.com.codoacodo.herencia2;

import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.Buscador;

public class MainHerencia {

	public static void main(String[] args) {
		
		String clave = "Harry Potter";
		
		Buscador buscador = new Buscador(clave);
		
		buscador.buscar();
		
		Articulo[] resultados = buscador.getResultados();
		
		//simulo la primer pantalla de resultados
		for(Articulo unResultado : resultados) {
			
			unResultado.getAutor();
			unResultado.getImg();
			unResultado.getTitulo();
			unResultado.getPrecio();
			
			if(unResultado instanceof Libro) {
				Libro l = (Libro)unResultado;
				l.getIsbn();
				l.getNroPaginas();
			}
			
			if(unResultado instanceof Musica) {
				
			}
		}
		
		
			

		
		/*
		//simulo entrada del ususario
		String claveDelUsuario = "Iron Man";
		
		Buscador miBuscador = new Buscador(claveDelUsuario);
		//miBuscador.claveBusqueda = claveDelUsuario;
		
		miBuscador.buscar();
		
		miBuscador.mostrarResultados();
		

		// accedo a padre + hijo
		Libro libro1 = new Libro("/liobro1img.jpg","titulo1","autor1",1000);
		
		// accedo a padre
		Articulo articulo1 = new Articulo("/articulo1img.jpg","titulo1","autor1",1000);
		
		// accedo a padre   (hijo por downcasting)
		Articulo a = new Libro("/liobro2img.jpg","titulo2","autor2",2000);
		
		//Downcastign
		Libro libroDentroDeA = (Libro)a;
		libroDentroDeA.getIsbn();
		
		
		System.out.println(libro1);
		*/
		
		
	}

}
