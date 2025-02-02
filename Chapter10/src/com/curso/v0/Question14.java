package com.curso.v0;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question14 {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(1);
		
		//IntStream is = s.boxed();
		//IntStream is = s.mapToInt(x -> x);
		DoubleStream ds = s.mapToDouble(x -> x);
		
		IntStream s2 = ds.mapToInt(x -> (int)x);
		
		s2.forEach(System.out::print);
	}

}
