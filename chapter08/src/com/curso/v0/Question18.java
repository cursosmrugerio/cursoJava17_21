package com.curso.v0;

import java.util.function.*;

public class Question18 {

	public static void main(String[] args) {

		//Supplier<String> sup = () -> new String();
		Supplier<String> x = String::new;
		String cadena = x.get();
		System.out.println("Cadena: "+cadena);
		
		UnaryOperator<String> uo = String::new;
		String otraCadena = uo.apply("Hello World");
		System.out.println("Otra Cadena: "+otraCadena);
		
		BiConsumer<String,String> m = 
				(s1,s2) -> System.out.println(s1+s2);
		BiConsumer<String,String> n = 
				(s1,s2) -> System.out.println(s1+s2);
				
		BiConsumer<String,String> y = m.andThen(n);
		
		UnaryOperator<String> z = a -> a + a;
		System.out.println(z.apply("Hola"));
		
	}

}
