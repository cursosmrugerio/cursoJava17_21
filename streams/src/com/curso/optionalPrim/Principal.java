package com.curso.optionalPrim;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class Principal {

	public static void main(String[] args) {

		LongStream longs = LongStream.of(5, 10); 
		
		long sum = longs.sum(); 
		
		System.out.println(sum); 
		
		
		DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
		
		OptionalDouble min = doubles.limit(2).min();
		
		System.out.println(min.getAsDouble());
		
	}

}
