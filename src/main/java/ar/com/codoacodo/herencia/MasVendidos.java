package ar.com.codoacodo.herencia;

public class MasVendidos extends FiltroBase implements IFiltro{
	
	public MasVendidos () {
		super("MAS VENDIDOS", new Articulo[] {});
	}
	
	public MasVendidos (Articulo[] lista) {
		super("MAS VENDIDOS", lista);
	}

	public Articulo[] ordenar () {
		System.out.println("Ordenado por mas vendido");
		return lista;
	}

	public Articulo[] getLista() {
		return lista;
	}

	public void setLista(Articulo[] lista) {
		this.lista = lista;
	}


}
