package com.curso.v0;

import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.Map.Entry;

public class Question16 {

	private static final String Map = null;

	public static void main(String[] args) {

		Predicate<String> empty = String::isEmpty;
		Predicate<String> notEmpty = empty.negate();
		
		Map<Boolean,List<String>> map = Stream.generate(() -> "")
		.limit(10)
		.filter(notEmpty)
		.collect(Collectors.groupingBy(k -> k)) //Map<String,List<String>>
		.entrySet() //Set<Map.Entry<String,List<String>>>
		.stream() //Stream<Map.Entry<String,List<String>>>
		.map(Entry::getValue) //Stream<List<String>>
		.flatMap(Collection::stream) //Stream<String>
		.collect(Collectors.partitioningBy(notEmpty)); //{false=[], true=[]}
		
		System.out.println(map);
		
		Map<String,List<String>> map2 =Stream.generate(() -> "")
				.limit(10)
				.filter(notEmpty)
				.collect(Collectors.groupingBy(k -> k)) //Map<String,List<String>>
				.entrySet() //Set<Map.Entry<String,List<String>>>
				.stream() //Stream<Map.Entry<String,List<String>>>
				.map(Entry::getValue) //Stream<List<String>>
				.flatMap(Collection::stream) //Stream<String>
				.collect(Collectors.groupingBy(n -> n)); //{}
				
				System.out.println(map2);
	}

}
