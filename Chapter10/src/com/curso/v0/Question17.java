package com.curso.v0;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Question17 {

	public static void main(String[] args) {

//		DoubleStream s = DoubleStream.of(1.2, 2.4);
//		
//		long l = s
//				 .peek(System.out::println)
//				 .count();
//		
//		System.out.println(l);
		
//		DoubleStream s2 = DoubleStream.of(1.2, 2.4);
//		
//		long l2 = s2
//				.peek(System.out::println) //1.2 2.4
//				.filter(x -> x > 2)
//				.count();
//		
//		System.out.println(l2); //1 
		
		DoubleStream s3 = DoubleStream.of(1.2, 2.4);
		double[] numeros = s3
		    .peek(System.out::println)
		    .toArray();
		
		System.out.println(Arrays.toString(numeros));
//		
//		
	}

}
