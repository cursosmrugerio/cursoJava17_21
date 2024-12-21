package com.curso.v0;

import java.util.Optional;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {
		
		//                   6         3      7
		String[] animals = {"monkey", "ape", "bonobox"};

		Stream<String> s = Stream.of(animals);

		Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length()); 
		
		min.ifPresent(System.out::println); //ape
		
		System.out.println("*********");

		Stream.of(animals)
		.max((s1, s2) -> s1.length()-s2.length())
		.ifPresent(System.out::println); //bonobox
		
		System.out.println("*********");
		
		Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
		
		System.out.println(minEmpty.isPresent()); // false
	}

}
