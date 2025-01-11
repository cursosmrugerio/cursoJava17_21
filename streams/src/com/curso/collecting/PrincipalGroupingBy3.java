package com.curso.collecting;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class PrincipalGroupingBy3 {
	
	public static void main(String[] args) {
		
		var ohMy = Stream.of("lions", "tigers", "bears"); 
		
		Map<Integer, Optional<Character>> map = ohMy.collect( 
				groupingBy( String::length, 
									mapping( 
											s -> s.charAt(0), 
											minBy((a, b) -> a - b)
										)
									 )
				); 
		
		
		
		System.out.println(map); //{5=Optional[b]  ,6=Optional[t]}		
	}

}
