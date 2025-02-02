package com.curso.v0;

import java.util.Spliterator;
import java.util.stream.Stream;

public class Question21 {

	public static void main(String[] args) {

		Spliterator<String> spliterator = 
				Stream.generate(() -> "x") 
				.spliterator();
		
		spliterator.tryAdvance(System.out::print);
		
		Spliterator<String> split = spliterator.trySplit();
		
		split.tryAdvance(System.out::print);
		
		//split.forEachRemaining(System.out::print);
	}

}
