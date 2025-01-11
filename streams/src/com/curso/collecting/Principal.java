package com.curso.collecting;

import java.util.TreeSet;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;


public class Principal {

	public static void main(String[] args) {

		var ohMy2 = Stream.of("lions", "tigers", "bears"); 
		Double result2 = ohMy2.collect(averagingInt(String::length)); 
		System.out.println(result2); // 5.333333333333333
		
		
		var ohMy = Stream.of("lions", "tigers", "too","bears","tigers");
		TreeSet<String> result = ohMy
						.filter(s -> s.startsWith("t")) 
						.collect(toCollection(TreeSet::new)); 
		
		System.out.println(result); // [tigers,too]
	}

}
