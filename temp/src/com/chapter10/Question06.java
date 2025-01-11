package com.chapter10;

import java.util.stream.Stream;

public class Question06 {

	public static void main(String[] args) {
		var s = Stream.generate(() -> "meow"); 
		var match = s.allMatch(String::isEmpty); 
		System.out.println(match);
	}

}
