package com.curso.v1;

import java.util.stream.Stream;

public class Principal3 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f!");

		int length = stream.reduce(0, 
				(i, s) -> i+s.length(),  
				(a, b) -> a+b); //5
		
		System.out.println(length);
		
		System.out.println("Fin de Programa");
	}

}
