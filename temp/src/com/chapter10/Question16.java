package com.chapter10;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question16 {

	public static void main(String[] args) {

		Predicate<String> empty = String::isEmpty;

		Predicate<String> notEmpty = empty.negate();
		
		Map<String, List<String>> map = Stream.generate(() -> "")
				.limit(10)
				.filter(notEmpty)
				.collect(Collectors.groupingBy(k -> k));
		
		System.out.println(map);
		
		Map<Boolean, List<String>> result = map.entrySet() 
			.stream() 
			.map(Entry::getValue)
			.flatMap(Collection::stream)
			.collect(Collectors.partitioningBy(notEmpty));	
		
		System.out.println(result);

		
	}

}
