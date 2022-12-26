package ar.com.codoacodo.exepciones2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionMain {
	
	public static void main(String[] args) {
		
		/*Creo colleccion
		Collection<String> nombres = new ArrayList<>();
		
		
		//Agrego elementos a ala coleccion
		nombres.add("Pedro");
		nombres.add("Juan");
		nombres.add("Pedro");
		
		//Tamaño?
		int size = nombres.size();
		System.out.println(size);
		
		//Vacia??
		boolean isEmpty = nombres.isEmpty();
		System.out.println(isEmpty);
		
		// 
		for (String dato:nombres) {
			System.out.println(dato);
		*/
		
		
		
		/* ------------------------------*/
		
		
		//Creo colleccion
		Collection<String> nombres = new HashSet<>();
		
		
		//Agrego elementos a ala coleccion
		nombres.add("Pedro");
		nombres.add("Juan");
		nombres.add("Pedro");
		
		//Tamaño?
		int size = nombres.size();
		System.out.println(size);
		
		//Vacia??
		boolean isEmpty = nombres.isEmpty();
		System.out.println(isEmpty);
		
		// 
		for (String dato:nombres) {
			System.out.println(dato);
		}
	
	}
}
