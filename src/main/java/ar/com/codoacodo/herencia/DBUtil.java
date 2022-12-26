package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia2.Libro;
import ar.com.codoacodo.herencia2.Musica;
import ar.com.codoacodo.herencia2.Pelicula;

public class DBUtil {

	public Articulo[] obtenerResultado(String claveBusqueda){
		 /* Simulacion de busqueda en base de datos*/
		 Libro primero = new Libro("http://sitio.com.ar/img/img1.jpg","Titulo"+claveBusqueda,"AutorL1",4390);
		 primero.setIsbn("9875642");
		 primero.setNroPaginas(72);
		 
		 Libro l2 = new Libro("http://sitio.com.ar/img/img1.jpg","Titulo"+claveBusqueda,"AutorL2",4390,56,"987654");
		 
		 Pelicula segundo = new Pelicula("http://sitio.com.ar/img/img2.jpg","Titulo"+claveBusqueda,"Autor2",40500);
		 
		 Musica m1 = new Musica("http://sitio.com.ar/img/img3.jpg","Titulo"+claveBusqueda,"Autor3",2040,"SonyMusic",new String[] {});
		 Musica m2 = new Musica("http://sitio.com.ar/img/img3.jpg","Titulo"+claveBusqueda,"Autor3",2040);
		 m2.setSello("warner");
		 
		 
		 /*Creo el vector (forma 1)
		 Articulo[] resultados =new Articulo[3];
		 resultados[0]=primero;
		 resultados[1]=segundo;
		 resultados[2]=tercero;
		 */
		 
		 /*Creo el vector (forma 2)
		 Articulo[] res = new Articulo[] {primero,segundo,tercero};
		 */
		 
		 //Creo el vector (forma 3)
		 
		 return new Articulo[] {primero,l2,segundo,m1,m2};
		 
	}
}
