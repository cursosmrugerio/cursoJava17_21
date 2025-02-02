package com.curso.v0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Paging {

	record Sesame(String name, boolean human) {
		@Override
		public String toString() {
			return name();
		}
	}
	
	record Page(List<Sesame> list, long count) {
	}

	public static void main(String[] args) {
		
		Stream<Sesame> monsters = Stream.of(new Sesame("Elmo", false));
		Stream<Sesame> people   = Stream.of(new Sesame("Abby", true));
		printPage(monsters, people);
	}

	private static void printPage(Stream<Sesame> monsters, 
			Stream<Sesame> people) {
		
		Stream<Sesame> stream = Stream.concat(monsters, people);
		
		Page page = stream.collect(Collectors.teeing(
				//PRIMER PROCESO : List<Sesame> 
				Collectors.filtering(s -> s.name().startsWith("E"), Collectors.toList()),
				//SEGUNDO PROCESO : long 
				Collectors.counting() ,
				(l,c) -> new Page(l,c)));
		
		System.out.println(page);
	}

}
