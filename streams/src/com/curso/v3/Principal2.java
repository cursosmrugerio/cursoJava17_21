package com.curso.v3;

import java.util.stream.Stream;
import java.util.function.Function;

public class Principal2 {

	public static void main(String[] args) {
		
		//public <R> Stream<R> map(Function<? super T, ? extends R> mapper)
		
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

		//s.map(cadena -> cadena.length())
		s.map(String::length) 
		 .forEach(System.out::println); //6 7 6
		
		System.out.println("*******");
		
		Function<String,Integer> func = cadena -> cadena.length();
		
		Stream<String> s1 = Stream.of("monkey", "gorilla","mono", "bonobo");
		
		Stream<Integer> s2 = s1.map(func);
		
		long suma = s2.reduce(0, Integer::sum );
		
		System.out.println(suma); //23
		
		
		
	}

}
