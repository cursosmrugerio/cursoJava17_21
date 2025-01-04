package com.curso.sort.v0;

import java.util.Comparator;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		Stream<String> s = Stream.of("brown-", "bear-");
		
		//s.sorted().forEach(System.out::print);
		
		Stream<String> s1 = Stream.of("brown bear-", "grizzly-"); 
		
		//s1.sorted(Comparator.reverseOrder()) .forEach(System.out::print);
		
		Stream<String> s2 = Stream.of("brown bear-","duck-", "grizzly-"); 
		
		s2.sorted((x,y)->x.length()-y.length()).forEach(System.out::print);
	}

}
