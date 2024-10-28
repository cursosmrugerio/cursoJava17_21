package com.chapter08;

import java.util.function.*;

public class Question18 {

	public static void main(String[] args) {

		BiConsumer<String,String> m = (x,y) -> System.out.println(x);
		BiConsumer<String,String> n = (x,y) -> System.out.println(y);
		
		BiConsumer<String,String> z = m.andThen(n);
		
		Consumer<String> m1 = x -> System.out.println(x+"1");
		Consumer<String> n1 = y -> System.out.println(y+"2");
		
		Consumer<String> z1 = m1.andThen(n1);
		
		z1.accept("zzz");


		
		
	}

}
