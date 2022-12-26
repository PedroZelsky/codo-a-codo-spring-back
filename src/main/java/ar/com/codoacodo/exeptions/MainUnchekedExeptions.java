package ar.com.codoacodo.exeptions;

import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.Buscador;
import ar.com.codoacodo.herencia2.Libro;
import ar.com.codoacodo.herencia2.Musica;

public class MainUnchekedExeptions {

	public static void main(String[] args) {
		
	//Runtime Exeptions (Unchecked) , no las controla el desarrollador	
		/* ArithmeticalExeption
		int valor = 10;
		int divisor = 0;
		
		int c = valor / divisor;

		System.out.println(c);
		*/
		
		
		/*NullPointerExeption (a un objeto muerto o vacio le pido de ejecutar algun metodo)
		 * 
		Buscador buscador = null;
		
		buscador.buscar();
		
		*/
		
		/* ArrayIndexOutOfBounds
		int[] edades = new int[] {10,20,30};
		System.out.println(edades[0]);
		System.out.println(edades[1]);
		System.out.println(edades[2]);
		System.out.println(edades[3]);
		*/
		
		/* ClassCast (intento de casteo entre hermanos)
		Articulo articulo = new Libro("a","b","c",10);
		
		Libro l =(Libro)articulo;
		System.out.println(l.getIsbn());
		
		
		Musica musica = (Musica)articulo;
		System.out.println(musica.getAutor());
		*/
		
		
		
		
		
		}

}
