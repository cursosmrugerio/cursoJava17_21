package com.curso.collecting;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalJoining {

	public static void main(String[] args) {

		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		String result = ohMy.collect(Collectors.joining(" & "));
		System.out.println(result); // lions,tigers,bears
		
		
	}

}
