package com.curso.v0;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Question17B {

	public static void main(String[] args) {


		DoubleStream s2 = DoubleStream.of(1.2, 2.4);
		
//		s2.peek(x -> System.out.println(x)) //1,2 2.4
//		  .filter(x -> x > 2) //2.4
//		  .count(); //1		
//		

		long l = s2.peek(x -> System.out.println(x)) //1,2 2.4
		  .count(); 
		
		System.out.println("FinPrograma: "+l);
	}

}
