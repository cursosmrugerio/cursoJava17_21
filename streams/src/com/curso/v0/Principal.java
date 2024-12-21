package com.curso.v0;

import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		Stream<Integer> oddNumberUnder100 = 
				Stream.iterate(1, 
						n -> n < 100, 
						n -> n + 2);
		
		oddNumberUnder100.forEach(System.out::println);
		
		Stream<Integer> otherOddNumberUnder100 = 
				Stream.iterate(1, 
						n -> n < 100, 
						n -> n + 2);
		
		long cantidad = otherOddNumberUnder100.count();
		
		System.out.println("Cantidad: "+cantidad);
		
	}

}
