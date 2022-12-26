package ar.com.codoacodo.exepciones2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainMap {

	public static void main(String[] args) {
		Map<Integer,String> mapDias = new HashMap<>();
		
		mapDias.put(1, "Lunes");
		mapDias.put(2, "Martes");
		mapDias.put(3, "Miercoles");
		mapDias.put(4, "Jueves");
		mapDias.put(5, "Viernes");
		mapDias.put(6, "Sabado");
		mapDias.put(7, "Domingo");

		
		String diaEnString = mapDias.get(4);
		System.out.println(diaEnString);
		
		
		boolean mapIsEmpty = mapDias.isEmpty();
		System.out.println(mapIsEmpty);
	
		
		Set<Integer> mapKeys =  mapDias.keySet();
		System.out.println(mapKeys);
		
		Collection<String> mapValues = mapDias.values();
		System.out.println(mapValues);
		
		
		Set<Entry<Integer,String>> mapEntry = mapDias.entrySet();
		System.out.println(mapEntry);	
	
		for(Entry<Integer,String> anEntry:mapEntry) {
			Integer key = anEntry.getKey();
			String value = anEntry.getValue();
			System.out.println(key+" - "+value);
		}
	}
}
