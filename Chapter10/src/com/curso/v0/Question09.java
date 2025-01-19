package com.curso.v0;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Question09 {
	
	public static void main(String[] args) {
		LongStream stream = LongStream.of(1, 2, 3);
		OptionalLong opt = stream.map(n -> n * 10)
					.peek(System.out::println) //10
					.filter(n -> n < 15)
					.findFirst();
		
		if (opt.isPresent()) 
			System.out.println(opt.getAsLong()); //10
		
		Stream<Long> streamOther = Stream.of(1L, 2L, 3L);
		Optional<Long> optOther = streamOther.map(n -> n * 10)
					.filter(n -> n < 5)
					.findFirst();
		
		if (optOther.isPresent()) 
			System.out.println(optOther.get());
		
	}

}
