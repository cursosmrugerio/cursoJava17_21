package com.curso.flatmap.v0;

import java.util.List;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		List<String> zero = List.of();
		var one = List.of("Bonobo"); 
		var two = List.of("Mama Gorilla", "Baby Gorilla");
		var three = List.of("Gorilla", "Baby Duck", "Duck");

		Stream<List<String>> animals = Stream.of(zero, one, two, three);
		
		Stream<String> streamStringAnimals = animals.flatMap(m -> m.stream());
		
		streamStringAnimals.forEach(System.out::println);		
		
	}

}
