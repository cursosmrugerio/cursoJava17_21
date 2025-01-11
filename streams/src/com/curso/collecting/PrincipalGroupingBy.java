package com.curso.collecting;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalGroupingBy {
	
	public static void main(String[] args) {
		var ohMy = Stream.of("lions", "bears", "tigers", "bears"); 
		Map<Integer, List<String>> map = 
				
				ohMy.collect( 
						//                    cadena -> cadena.length()
						Collectors.groupingBy(String::length)
				); 
		
		System.out.println(map);
		System.out.println(map.getClass().getName());
		System.out.println(map.values().getClass().getName());


		
		System.out.println("V2");

		
		var ohMy2 = Stream.of("lions","bears", "tigers", "bears"); 
		
		Map<Integer, Set<String>> map2 = 
				ohMy2.collect(
						Collectors.groupingBy(
								String::length,
								Collectors.toSet() //Definir Collection Lista Valores
						)
					 ); 
		
		System.out.println(map2);
		System.out.println(map2.getClass().getName());
		System.out.println("V3");
		
		var ohMy3 = Stream.of("lions","bears", "tigers", "bears"); 
		
		TreeMap<Integer, Set<String>> map3 = 
				ohMy3.collect(
						Collectors.groupingBy(
								String::length,
								TreeMap::new,//Definir el tipo de Map
								Collectors.toSet() //Definir Collection Lista Valores
						)
					 ); 
		
		System.out.println(map3);
		System.out.println(map3.values().getClass().getName());
		
		System.out.println("****");
		
		var ohMy4 = Stream.of("lions", "tigers", "bears"); 
		
		Map<Integer, Long> map4 = ohMy4.collect(
				Collectors.groupingBy(
						String::length,
						Collectors.counting()
				)
		); 
		
		System.out.println(map4); //{5=2,6=1}

		

		
		
		
		
	}

}
