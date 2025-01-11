package com.curso.collecting;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalPartitioningBy {

	public static void main(String[] args) {
		var ohMy = Stream.of("lions", "tigers", "bears"); 
		
		Map<Boolean, List<String>> map = ohMy.collect( 	
				Collectors.partitioningBy(s -> s.length() <= 5)
			); 
		
		System.out.println(map); // {false=[tigers], true=[lions, bears]}
		
		
		var ohMy2 = Stream.of("lions", "tigers", "bears"); 
		
		Map<Boolean, List<String>> map2 = ohMy2.collect( 	
				Collectors.partitioningBy(s -> s.length() <= 7)
			); 
		
		System.out.println(map2); // {false=[], true=[lions,bears,tigers]}
		
		var ohMy3 = Stream.of("lions", "tigers", "bears"); 
		
		Map<Boolean, Set<String>> map3 = ohMy3.collect( 	
				Collectors.partitioningBy(s -> s.length() <= 7,
										  Collectors.toSet()
										 )
									); 
		
		System.out.println(map3); // {false=[], true=[lions,bears,tigers]}
		
		
		
	}

}
