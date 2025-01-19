package com.curso.v0;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question11A {

	public static void main(String[] args) {

		//Stream<Integer> stream = Stream.iterate(1, x -> x++); 
		
		System.out.println(Stream.iterate(1, x -> ++x) 
				.limit(5)
				.map(x -> ""+x) //Stream<String>
				.collect(Collectors.joining()));
		
	}

}
