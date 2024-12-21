package com.curso.v3;

import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		//public Stream<T> filter(Predicate<? super T> predicate)
		
		String[] animals = {"monkey", "gorilla", "mono" , "bonobo"};

		Stream.of(animals) //CREA
			.filter(x -> x.startsWith("m"))  //INTERMEDIARIA
			.forEach(System.out::println);  //TERMINAL
		
		Stream.of(animals) //CREA
		.filter(x -> x.startsWith("g"));  //INTERMEDIARIA
		
		System.out.println("Fin de Programa");
	}

}
