package com.streams.v2;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal2A {
	
	public static void main(String[] args) {
	
		Integer[] array = {1,2,3,4,5,6,7,8,9};
		
		Stream<Integer> stream = Arrays.stream(array);
		
		stream.filter(x -> x%2==0)
			  .peek(System.out::println) //2,4,6,8
			  .max((x,y)->x-y) //Optional<Integer> 2
			  .stream() //Stream<Integer>
			  .peek(System.out::println) 
			  .map(y -> y) //Aplica al Stream<T>
			  .forEach(x->System.out.println("Resultado: "+x));
		
	}

}
