package ar.com.codoacodo.exepciones2;

public class MainGenerador {

	public static void main(String[] args) {
		
		GeneradorString generadorString = new GeneradorString();
		String v = generadorString.generar();
		System.out.println(v);
		
		GeneradorNumeros gn = new GeneradorNumeros();
		Long ng = gn.generar();
		System.out.println(ng);
		
		
	}
}
