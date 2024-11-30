package com.curso.v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public record Platypus(String name, int beakLength) {

	@Override
	public String toString() {
		return "" + beakLength;
	}
	
	public static void main(String[] args) {

		Platypus p1 = new Platypus("Paula", 3); 
		Platypus p2 = new Platypus("Peter", 5); 
		Platypus p3 = new Platypus("Peter", 7);
		
		List<Platypus> list = Arrays.asList(p1,p2,p3);
		
		//Function: x -> y;
//		Collections.sort(list, Comparator
//				    .comparing((Platypus p)->p.beakLength)
//					.reversed()
//					);
		
//		Collections.sort(list, Comparator
//					.comparing
//				    (Platypus::beakLength)
//				    .reversed()
//					);
//		
		
//		Collections.sort(list, Comparator
//				.<Platypus,String>comparing(p -> p.name)
//			    .thenComparingInt(p -> p.beakLength)
//			    .reversed()
//				);
		
		Collections.sort(list, Comparator
				.comparing((Platypus p) -> p.name)
			    .thenComparingInt(p -> p.beakLength)
			    .reversed()
				);
		
		
//		Collections.sort(list, Comparator
//				.comparing(Platypus::name)
//			    .thenComparingInt(Platypus::beakLength)
//			    .reversed()
//				);
		
		
		System.out.println(list); //[7, 5, 3]
	}

}
