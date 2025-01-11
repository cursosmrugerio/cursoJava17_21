package com.chapter10;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Question14 {

	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(1);
		IntStream is = s.mapToInt(x->x);
		
		DoubleStream ds = s.mapToDouble(x -> x);
		Stream<Integer> s2 = ds.mapToObj(d -> (int) d);
		
		
		
		
	}

}
