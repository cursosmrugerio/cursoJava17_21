package com.chapter10;

import java.util.stream.Stream;

public class Question01 {

	public static void main(String[] args) {

		var stream = Stream.iterate("", (s) -> s + "1");
		
		stream.limit(8).map(x -> x + "2").forEach(System.out::println);
	}

}
