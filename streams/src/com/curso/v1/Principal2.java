package com.curso.v1;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {

		BinaryOperator<Integer> op = (a, b) -> a * b;

		Stream<Integer> empty = Stream.empty();

		Stream<Integer> oneElement = Stream.of(3); 
		
		Stream<Integer> threeElements = Stream.of(3, 5, 6);
		
		empty.reduce(op).ifPresent(System.out::println);//
		
		oneElement.reduce(op).ifPresent(System.out::println); //3
		
		threeElements.reduce(op).ifPresent(System.out::println); //90
		
		System.out.println("Fin de Programa");
	}

}
