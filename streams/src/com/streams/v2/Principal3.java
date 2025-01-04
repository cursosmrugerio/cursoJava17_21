package com.streams.v2;

import java.util.Optional;

class ChainingOptionals{
	
	static Optional<Integer> calculator(String cadena){
		Optional<Integer> opt = Optional.of(cadena.length());
		return opt;
	}
	
}

public class Principal3 {
	
	public static void main(String[] args) {
		
		Optional<String> optional = Optional.of("HelloWorld");
		Optional<Optional<Integer>> result = optional.map(ChainingOptionals::calculator);
		
		Optional<String> optional1 = Optional.of("HelloWorldJava");
		Optional<Integer> result1 = optional1.flatMap(ChainingOptionals::calculator);
		result1.ifPresent(System.out::println);
		
			
	}

}
