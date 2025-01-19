package com.curso.v0;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question11 {

	public static void main(String[] args) {

		String cadena = Stream.iterate("1", x -> "2") 
		.limit(5)
		.map(x -> x) 
		.collect(Collectors.joining());
		
		System.out.println(cadena);
	}

}
