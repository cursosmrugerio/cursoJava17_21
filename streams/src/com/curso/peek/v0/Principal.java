package com.curso.peek.v0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		var stream = Stream.of("black bear","gato", "brown bear", "grizzly");
	
		//stream.filter(s -> s.startsWith("g")).forEach(System.out::println);
		
		long count = stream.filter(s -> s.startsWith("g")) 
				           .peek(System.out::println)
				           .count();
		
		System.out.println(count);
		
		var numbers = new ArrayList<>(); 
		var letters = new ArrayList<>(); 
		numbers.add(1); 
		letters.add('a');
		
		Stream<List<?>> bad = Stream.of(numbers, letters); 
		
		bad.peek(x -> x.remove(0))
		   .map(List::size) 
		   .forEach(System.out::print);
	}

}
