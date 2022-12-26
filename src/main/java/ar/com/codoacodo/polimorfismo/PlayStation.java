package ar.com.codoacodo.polimorfismo;

public class PlayStation extends Consola implements IJugable {

	public PlayStation(String nombre, String marca) {
		super(nombre, marca);
	}

	private boolean chipeada;

	public boolean isChipeada() {
		return chipeada;
	}

	public void chipear() {
		if(!isChipeada() ) {
			setChipeada(true);
		};
	}

	private void setChipeada(boolean chipeada) {
		this.chipeada = chipeada;
		
	}
	
	public void jugar() {
		System.out.println(getNombre()+" "+getMarca()+" - jugando...");
	}
	
}
