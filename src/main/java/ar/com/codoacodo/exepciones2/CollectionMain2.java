package ar.com.codoacodo.exepciones2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain2 {

	public static void main(String[] args) {

		Collection<String> nombres = new ArrayList<>();
		nombres.add("Pedro");
		nombres.add("Juan");
		nombres.add("Pedro");
		
		//Recorro collection con iterator
		Iterator<String> itNombre = nombres.iterator();
		
		while(itNombre.hasNext()) {
			String nombre = itNombre.next();
			if ("Juan".equals(nombre)) {
				System.out.println(nombre);
				itNombre.remove();
			}
		}
		
		
	}
}
