package ar.com.codoacodo.exeptions;

public class Pagador {

	public static void pagar(Venta venta) throws Exception,AmouintExedsAothorization,InvalidPaymentMethod {
		System.out.println("Invocando al medio de pago.....");

		
		if(venta.getMontoVenta()>1400) {
			throw new AmouintExedsAothorization ("El monto exede el maximo permitido");
		}
		
		if ("visa".equals(venta.getMedioDePago().getNombre())) {
			throw new InvalidPaymentMethod ("Metodo de pago invalido");
		}
	}
}
