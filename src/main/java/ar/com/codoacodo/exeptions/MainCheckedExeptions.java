package ar.com.codoacodo.exeptions;

public class MainCheckedExeptions {
	
	public static void main(String[] args) {
		try {
			Calculadora.dividir(10, 0);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

		System.out.println("El programa continua");
	}
}
