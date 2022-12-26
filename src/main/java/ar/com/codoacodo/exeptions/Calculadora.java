package ar.com.codoacodo.exeptions;

public class Calculadora {
	
	public static float dividir(int a, int b) throws Exception {
		if (b==0) {
			//Lanzo una exeption
			throw new Exception("No se puede dividir por 0");
		}
		return a/b;
	}
}
