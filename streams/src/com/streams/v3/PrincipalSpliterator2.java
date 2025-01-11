package com.streams.v3;

import java.util.Spliterator;
import java.util.stream.Stream;

public class PrincipalSpliterator2 {

	public static void main(String[] args) {

		Spliterator<Integer> originalBag = Stream.iterate(1,n -> ++n)
											.spliterator();
		
		Spliterator<Integer> newBag = originalBag.trySplit();
		
		newBag.tryAdvance(System.out::print); // 1 
		newBag.tryAdvance(System.out::print); // 2 
		newBag.tryAdvance(System.out::print); // 3
	}

}
