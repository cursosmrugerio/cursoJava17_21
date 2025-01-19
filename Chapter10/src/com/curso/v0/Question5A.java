package com.curso.v0;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Question5A {

	public static void main(String[] args) {

		double result = LongStream.of(6L, 8L, 10L).mapToInt(x -> (int) x) // IntStream
				.boxed() // Stream<Integer>
				.collect(Collectors.groupingBy(x -> x)) // Map<Integer,List<Integer>>
				.keySet() // Set<Integer>
				.stream() // Stream<Integer>
				.collect(Collectors.averagingInt(x -> x)); // double

		System.out.println(result);

		double result2 = LongStream.of(6L, 8L, 10L)

				.mapToInt(x -> (int) x).boxed().collect(Collectors.groupingBy(x -> x, Collectors.toSet())).keySet()
				.stream().collect(Collectors.averagingInt(x -> x));

		double result3 = LongStream.of(6L, 8L, 10L)
				.mapToInt(x -> (int) x)
				.boxed()
				.collect(Collectors.groupingBy(x -> x, Collectors.toSet()))// Map<Integer,Set<Integer>>
				.keySet()
				.stream()
				.collect(Collectors.averagingInt(x -> x));

	}

}
