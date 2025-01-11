package com.chapter10;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Question05 {

	public static void main(String[] args) {

		double resultA = LongStream.of(6L, 8L, 10L)
				.mapToInt(x -> (int) x)
				.boxed()
				.collect(Collectors.groupingBy(x -> x))
				.keySet().stream()
				.collect(Collectors.averagingInt(x -> x));

		System.out.println("A:" + resultA);

		double resultB = LongStream.of(6L, 8L, 10L)
				.mapToInt(x -> (int)x)
				.boxed()
				.collect(Collectors.groupingBy(x -> x))
				.keySet().stream()
				.collect(Collectors.averagingInt(x -> x));
		
		System.out.println("B:" + resultB);
		
		double resultC = LongStream.of(6L, 8L, 10L) 
				.mapToInt(x -> (int) x) 
				.boxed() 
				.collect(Collectors.groupingBy(x -> x)) 
				.keySet() 
				.stream() 
				.collect(Collectors.averagingInt(x -> x));
		
		System.out.println("C:" + resultC);
		
		double resultD = LongStream.of(6L, 8L, 10L)
				.mapToInt(x -> (int) x) 
				.boxed()
				.collect(Collectors.groupingBy(x -> x, Collectors.toSet())) 
				.keySet() 
				.stream() 
				.collect(Collectors.averagingInt(x -> x));
		
		System.out.println("D:" + resultD);
		
		double resultE = LongStream.of(6L, 8L, 10L)
				.mapToInt(x -> (int)x) 
				.boxed() 
				.collect(Collectors.groupingBy(x -> x, Collectors.toSet())) 
				.keySet() 
				.stream() 
				.collect(Collectors.averagingInt(x -> x));
		
		System.out.println("E:" + resultE);
		
		double resultF = LongStream.of(6L, 8L, 10L) 
				.mapToInt(x -> (int) x) 
				.boxed() 
				.collect(Collectors.groupingBy(x -> x, Collectors.toSet())) 
				.keySet() 
				.stream() 
				.collect(Collectors.averagingInt(x -> x));
		
		System.out.println("F:" + resultF);






	}

}
