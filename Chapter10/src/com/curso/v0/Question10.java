package com.curso.v0;

import java.util.stream.Stream;

public class Question10 {
	
	/*
	 * L: .filter(x -> x.length()> 1) 
	 * M: .forEach(System.out::println) 
	 * N: .limit(10) 
	 * O: .peek(System.out::println)
	 */

	public static void main(String[] args) {

		Stream<String> stream = Stream.generate(() -> "1");
		
		//N, M
		stream
		.limit(10)
		.forEach(System.out::println) ;
		
		//L, O, M
//		stream
//		.filter(x -> x.length()> 1)
//		.peek(System.out::println)
//		.forEach(System.out::println) ;
		
		//L, N, M
//		stream
//		.filter(x -> x.length()> 1) 
//		.limit(10)
//		.forEach(System.out::println) ;
		
		//L,N
//		System.out.println(
//			stream
//			.filter(x -> x.length()> 1) 
//			.limit(10)
//		);
		
		
		
	}

}
