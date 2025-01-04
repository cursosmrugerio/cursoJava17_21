package com.streams.v0;

import java.util.List;

public class PrincipalStream {

	public static void main(String[] args) {

		List<String> list = List.of("Toby", "Anna", "Leroy", "Alex");
		
		list.stream().filter(n -> n.length() == 4) //Predicate
					 .sorted() //Comparable
					 .limit(2) 
					 .forEach(System.out::println); //Consumer
	}

}
