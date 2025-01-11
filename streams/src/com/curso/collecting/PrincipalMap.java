package com.curso.collecting;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toMap;
import static java.util.function.Function.identity;

public class PrincipalMap {

	public static void main(String[] args) {

		var ohMy = Stream.of("lions", "tigers", "bears"); 
		//                                            s -> s
		Map<String, Integer> map = ohMy.collect(toMap(identity(), String::length)); 
		System.out.println(map); // {lions=5, bears=5, tigers=6}
		
		var ohMy2 = Stream.of("lions", "tigers", "bear"); 
		Map<Integer, String> map2 = ohMy2.collect(toMap(String::length,s -> s));
		System.out.println(map2); // {5=lions, 4=bear, 6=tigers}
		
		var ohMy3 = Stream.of("lions", "tigers", "bears"); 
		Map<Integer, String> map3 = ohMy3.collect(
										toMap(String::length,
											  s -> s,
											  (s1, s2) -> s1 + "," + s2
											 )
										);
		System.out.println(map3); // {5=lions,bears, 6=tigers}
		System.out.println(map3.getClass()); // class java.util.HashMap
		
		System.out.println("**********");
		
		var ohMy4 = Stream.of("lions", "tigers", "bears"); 
		
		TreeMap<Integer, String> map4 = ohMy4.collect(toMap(
											String::length,
											k -> k,
											(s1, s2) -> s1 + "," + s2,
											TreeMap::new)
										); 
		
		System.out.println(map4); // {5=lions,bears, 6=tigers}
		System.out.println(map4.getClass()); // class java.util.TreeMap

		

	}

}
