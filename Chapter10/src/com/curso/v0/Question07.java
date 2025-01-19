package com.curso.v0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Question07 {

	public static void main(String[] args) {

		List<String> list = null;

		list = list.stream().sorted((a, b) -> b.compareTo(a)) // Stream<String>
				.collect(Collectors.toList());
	}

	private static List<String> sort1(List<String> list) {
		var copy = new ArrayList<String>(list);
		Collections.sort(copy, (a, b) -> b.compareTo(a));
		return copy;
	}
	
	private static List<String> sort2(List<String> list) {
		return list.stream()
				   .sorted((a, b) -> b.compareTo(a)) 
				   .collect(Collectors.toList());
	}

}
