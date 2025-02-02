package com.curso.v0;

import java.util.*;
import java.util.stream.*;

public class Question19 {

	public static void main(String[] args) {
		List<Integer> x = 
				IntStream.range(1, 6) 
				.mapToObj(i -> i) //Stream<Integer>
				.collect(Collectors.toList()); //List<Integer>
		
		//x.forEach(System.out::println);
				
//		IntStream.range(1, 6) 
//				.forEach(System.out::println);
		
		IntStream.range(1, 6) 
			//.mapToObj(i -> i) 
			.forEach(System.out::println);
	}

}
