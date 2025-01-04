package com.stream.primitive.v0;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Principal2 {

	public static void main(String[] args) {

		Stream<String> stream0 = Stream.of("goldfish","bobobo","mono","finch"); 
		Stream<Integer> stream1 = stream0.map(x -> x.length());
		stream1.forEach(System.out::println);
		
		Stream<String> objStream = Stream.of("penguin", "fish");
		IntStream intStream = objStream.mapToInt(s -> s.length());
		
		LongStream longStream = LongStream.of(1L, 2L, 3L); 
		DoubleStream doubleStream = longStream.mapToDouble(x -> x);

		doubleStream.forEach(System.out::println);
		
		System.out.println("***********");
		
		LongStream longStream1 = LongStream.of(1L, 2L, 3L);
		Stream<Long> streamLong1 = longStream1.mapToObj(t->t);
		streamLong1.forEach(System.out::print);
		
		LongStream longStream2 = LongStream.of(1L, 2L, 3L);
		Stream<Long> streamLong2 = longStream2.boxed();
		streamLong2.forEach(System.out::print);
		
		
	}

}
