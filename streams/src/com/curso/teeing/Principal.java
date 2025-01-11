package com.curso.teeing;

import java.util.List;
import java.util.stream.Collectors;

record Separations(String ampersonSeparated, String arrobaSeparated) {}

public class Principal {

	public static void main(String[] args) {

		var list = List.of("x", "y", "z"); 
		
		Separations resultRecord = list.stream()
				.collect(
						Collectors.teeing( 
								Collectors.joining(" & "), 
								Collectors.joining(" @ "), 
								(s, c) -> new Separations(s, c)
						)
					); 
		
		System.out.println(resultRecord.ampersonSeparated());
		System.out.println(resultRecord.arrobaSeparated());

		
		
	}

}
