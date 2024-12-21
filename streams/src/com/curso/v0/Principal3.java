package com.curso.v0;

import java.util.stream.Stream;

public class Principal3 {

	public static void main(String[] args) {
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

		Stream<String> infinite = Stream.generate(() -> "chimp");

		s.findAny().ifPresent(System.out::println); // monkey (usually) 
		infinite.findAny().ifPresent(System.out::println); // chimp
		
		
	}

}
