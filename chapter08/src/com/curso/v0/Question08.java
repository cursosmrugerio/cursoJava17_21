package com.curso.v0;

import java.util.function.*;

public class Question08 {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> u = x -> x * x; //<==
		
		BiFunction<Integer,Integer,Integer> f = (x,z) -> x*x;
		
		//BiFunction<Integer, Integer> f = x -> x*x;
		
		BinaryOperator<Integer> bo = (x,z) -> x*x;
		
		Function<Integer,Integer> fun = x -> x*x;
	}

}
