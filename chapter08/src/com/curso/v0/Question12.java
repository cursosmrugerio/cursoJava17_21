package com.curso.v0;

import java.util.function.Function;

public class Question12 {

	public static void main(String[] args) {

		Function<Integer, Integer> s = a -> a + 4;
		Function<Integer, Integer> t = a -> a * 3;
		Function<Integer, Integer> c = s.compose(t);
		//                                       3
		Function<Integer, Integer> z = s.andThen(t);
		//                             5          
		
		System.out.println(s.apply(1)); //5
		System.out.println(t.apply(1)); //3
		
		System.out.println(c.apply(1)); //7
		System.out.println(z.apply(1)); //15
	}

}
