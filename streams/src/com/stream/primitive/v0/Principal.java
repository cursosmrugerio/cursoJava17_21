package com.stream.primitive.v0;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {
	
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1, 2, 3);
		System.out.println(stream.reduce(0, (s, n) -> s + n));
		//System.out.println(stream.sum());

		Stream<Integer> stream1 = Stream.of(1, 2, 3);
		IntStream stream2 = stream1.mapToInt(x -> x);
		System.out.println(stream2.sum());
		
		IntStream intStream = IntStream.of(1, 2, 3); 
		OptionalDouble avg = intStream.average(); 
		System.out.println(avg.getAsDouble());
		
	}

}
