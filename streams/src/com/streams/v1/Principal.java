package com.streams.v1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {

		Stream.generate(() -> "Elsa") //INFINITE
			.filter(n -> n.length() == 4) 
			.limit(2) 
			.sorted()
			.forEach(System.out::println);
		
		
//		Stream.generate(() -> "Olaf Lazisson") 
//			.filter(n -> n.length() == 4)
//			.limit(2) 
//			.sorted() 
//			.forEach(System.out::println);
		
		
		List<String> listString = Stream.of("goldfish","bobobo", "finch") 
				.filter(s -> s.length()> 5) 
				.collect(Collectors.toList());
		
		long count0 = listString.stream() 
				.count(); 
		
		System.out.println("count0: "+count0);

		long count = Stream.of("goldfish","bobobo", "finch") 
				.filter(s -> s.length()> 5) 
				.collect(Collectors.toList()) 
				.stream() 
				.count(); 
		
		System.out.println("count: "+count);

		
	}

}
