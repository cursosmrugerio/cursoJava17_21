package com.curso.v1;

import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f");

		String word = stream.reduce("", (s, c) -> s + c); 
		
		System.out.println(word); //wolf
		
		Stream<String> stream1 = Stream.of("w", "o", "l", "f");

		word = stream1.reduce("", String::concat); 
		
		System.out.println(word); // wolf
		
		Stream<Integer> stream2 = Stream.of(3, 5, 6);

		System.out.println(stream2.reduce(1, (a, b) -> a*b));
	}

}
