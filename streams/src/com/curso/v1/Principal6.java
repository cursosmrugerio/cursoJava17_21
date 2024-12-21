package com.curso.v1;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal6 {

	public static void main(String[] args) {

		//public <R,A> R collect(Collector<? super T, A,R> collector)

		Stream<String> stream = Stream.of("w", "o", "l", "w",  "f");

		TreeSet<String> set =
				stream.collect(
					//  Collectors.toCollection(() -> new TreeSet());
						Collectors.toCollection(TreeSet::new)); 
		
		System.out.println(set);
		
		System.out.println("****************");
		
		Stream<String> stream2 = Stream.of("w", "o", "l", "f");

		Set<String> set2 = 
				stream2.collect(Collectors.toSet()); 
		
		System.out.println(set2); // [f, w, l, o]
		
	}

}
