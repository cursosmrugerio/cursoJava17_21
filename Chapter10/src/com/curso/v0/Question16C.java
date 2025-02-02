package com.curso.v0;

import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.Map.Entry;

public class Question16C {

	private static final String Map = null;

	public static void main(String[] args) {

		Predicate<String> empty = String::isEmpty;
		Predicate<String> notEmpty = empty.negate();
		
		Stream<List<String>> map = Stream.generate(() -> "")
		.limit(10)
		.filter(notEmpty)
		.collect(Collectors.groupingBy(k -> k))
		.entrySet()
		.stream()
		.map(Entry::getValue);
		
	}

}
