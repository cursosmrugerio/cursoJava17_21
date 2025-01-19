package com.curso.v0;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Question05 {

	public static void main(String[] args) {

		double result1 = LongStream.of(6L, 8L, 10L)
			.mapToInt(x -> (int) x) //IntStream
			.boxed() //Stream<Integer>
			.collect(Collectors.groupingBy(x -> x)) //Map<Integer,List<Integer>>
			.keySet() //Set<Integer> 
			.stream() //Stream<Integer>
			.collect(Collectors.averagingInt(x -> x)); //double
		
		System.out.println(result1);

		
		IntStream intStream = LongStream.of(6L, 8L, 10L)
				.mapToInt(x -> (int) x); 
		
		Stream<Integer> stream = intStream.boxed();
		
		Map<Integer,List<Integer>> map = 
				stream.collect(Collectors.groupingBy(x -> x));
		//System.out.println(map);
		
		Set<Integer> setInt = map.keySet();

		Stream<Integer> stream2 = setInt.stream();

		double result2 = stream2
					.collect(Collectors.averagingInt(x -> x)); 
		
		System.out.println(result2);
		
		
	}

}
