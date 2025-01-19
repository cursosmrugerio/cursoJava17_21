package com.curso.v0;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Question03 {

	public static void main(String[] args) {
		Predicate<String> predicate = s -> s.length() > 3;

		var stream1 = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
		var b1 = stream1.noneMatch(predicate); //false
		var stream2 = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
		var b2 = stream2.anyMatch(predicate); //true
		System.out.println(b1+" "+b2);
	}

}
