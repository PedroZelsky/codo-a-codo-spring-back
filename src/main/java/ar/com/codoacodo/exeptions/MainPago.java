package ar.com.codoacodo.exeptions;

import java.util.Date;

public class MainPago {

	public static void main(String[] args) {
		
		String nombre = "Pedro";
		
		MedioDePago medioDePago = new MedioDePago("visa");
		
		Venta venta = new Venta(nombre, medioDePago, new Date(), 1300d);
		

		int cantidadReintentos = 3;
		boolean success = false;
		do {
			try {
				Pagador.pagar(venta);
				success = true;
				
			}catch (AmouintExedsAothorization aea) {
				aea.printStackTrace();
			}catch (InvalidPaymentMethod ip) {
				ip.printStackTrace();
				cantidadReintentos = 0;
			}catch (Exception e) {
				e.printStackTrace();
				cantidadReintentos--;
			}
			
			System.out.println("El programa continua");
		}while(cantidadReintentos>0 && !success);
		
		if (success) {
			System.out.println("El pago fue exitoso");
		}else {
			System.err.println("No se pudo realizar el pago");
		}
		

	}
}
