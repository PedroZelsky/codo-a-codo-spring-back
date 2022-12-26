package ar.com.codoacodo.herencia;

public abstract class FiltroBase {

	protected String nombre;
	protected Articulo[]lista;
	
	public FiltroBase(String nombre,Articulo[] lista) {
		this.setNombre(nombre);
		this.setLista(lista);
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Articulo[] getLista() {
		return lista;
	}

	public void setLista(Articulo[] lista) {
		this.lista = lista;
	}

	public String getNombre() {
		return nombre;
	}
	
	
}
