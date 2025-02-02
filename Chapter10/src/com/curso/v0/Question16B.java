package com.curso.v0;

import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Question16B {

	private static final String Map = null;

	public static void main(String[] args) {

		Predicate<String> empty = String::isEmpty;
		Predicate<String> notEmpty = empty.negate();
		
		Set<Map.Entry<String,List<String>>> map = Stream.generate(() -> "")
		.limit(10)
		.filter(notEmpty)
		.collect(Collectors.groupingBy(k -> k))
		.entrySet();
		
	}

}
