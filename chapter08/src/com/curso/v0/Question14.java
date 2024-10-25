package com.curso.v0;

import java.util.function.*;

class Wolf{}
class Camel{}

public class Question14 {

	public static void main(String[] args) {

		BiFunction<Wolf,String,Integer> bf = (var w, var c) -> 39;
		System.out.println(bf.apply(new Wolf(), "Cadena"));
		
		Consumer<Camel> cons1 = (final Camel c) -> {return;};
		Consumer<Camel> cons2 = (final Camel c) -> {};
		
		BinaryOperator<RuntimeException> bo = (x,y) -> new RuntimeException();
		BiFunction<String,Integer,RuntimeException> bfExc =
											(x,y) -> new RuntimeException();
											
		Function<Double,Integer> f = (var y) -> {return 0;};
		
	}

}
