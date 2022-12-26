package ar.com.codoacodo.herencia;

public class Buscador {

	 private String claveBusqueda;
	 private Articulo[] resultados;
 	 private IFiltro filtro;
	 
	 public Buscador(String claveDelUsuario){
		 this.setClaveBusqueda(claveDelUsuario); 
		 //Prevengo error nulo
		 //this.resultados = new Articulo[] {};
		 this.setResultados(new Articulo[] {});
		 
		 this.setFiltros(new MasVendidos());
	 }
	 
	 private void setFiltros(IFiltro filtro) {
		this.filtro = filtro;
	}
	 
	public void cambiarFiltro(IFiltro nuevoFiltro) {
		setFiltros(nuevoFiltro);
		
	}
	
	public void ordenar(String claveOrdenamiento) {
		switch (claveOrdenamiento) {
		case "MASVENDIDOS": {
				this.setFiltros(new MasVendidos(this.getResultados()));

		}
		case "MAYORPRECIO": {
			this.setFiltros(new MayorPrecio(this.getResultados()));

		}
		default:
			this.setFiltros(new MasVendidos(this.getResultados()));
		}
		
		Articulo[] ordenados= this.filtro.ordenar();
		setResultados(ordenados);
	}
		/*setResultados(this.filtro.ordenar())*/

	public void buscar(){
		 DBUtil db = new DBUtil();
		 
		 /*
		 Articulo[] resultados = db.obtenerResultado(this.claveBusqueda);
		 this.resultados = resultados;*/
		 
		 this.setResultados(db.obtenerResultado(claveBusqueda));
		 
	 }
	 
	 public void mostrarResultados() {
			System.out.println("Hemos encontrado "+ cantidadResultados() +" resultados para"+ getClaveBusqueda());
			for( Articulo aux : getResultados() ) {
				System.out.println("Titulo:"+aux.getTitulo());
				System.out.println("Autor:"+aux.getAutor());
				System.out.println("img:"+aux.getImg());
				System.out.println("Precio:"+aux.getPrecio());
				System.out.println("-----------------------");
			}
	 }
	 
	 int cantidadResultados() {
		 return this.resultados.length;
	 }

	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public Articulo[] getResultados() {
		return resultados;
	}

	public void setResultados(Articulo[] resultados) {
		this.resultados = resultados;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
	
	
	
}
