package com.curso.collecting;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalGroupingBy2 {
	
	public static void main(String[] args) {
		
		var ohMy = Stream.of("lions", "tigers", "bears"); 
		
		Map<Integer, Optional<Character>> map = ohMy.collect( 
				Collectors.groupingBy( String::length, 
										Collectors.mapping( 
												s -> s.charAt(0), 
												Collectors.minBy((a, b) -> a - b)
										)
									 )
				); 
		
		
		
		System.out.println(map); //{5=Optional[b]  ,6=Optional[t]}		
	}

}
