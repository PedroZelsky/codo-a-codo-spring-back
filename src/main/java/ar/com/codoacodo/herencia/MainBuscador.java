package ar.com.codoacodo.herencia;

public class MainBuscador {

	public static void main(String[] args) {
		
		//simulo entrada del ususario
		String claveDelUsuario = "Iron Man";
		String claveDeOrdenamiento = "MAYORPRECIO";
		
		Buscador miBuscador = new Buscador(claveDelUsuario);
		//miBuscador.claveBusqueda = claveDelUsuario;
		
		miBuscador.buscar();
		
		miBuscador.mostrarResultados();
		
		System.out.println("*******************");
		
		miBuscador.ordenar(claveDeOrdenamiento);
		
		miBuscador.mostrarResultados();
		
		System.out.println("*******************");
		
		
		
		
	}

}
