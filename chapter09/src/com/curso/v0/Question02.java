package com.curso.v0;

import java.util.ArrayList;
import java.util.List;

public class Question02 {

	public static void main(String[] args) {

		//List<Object>
		List<?> q = List.of("mouse", "parrot");
		
		for (Object o: q)
			System.out.println(o);
		
//		q.removeIf(String::isEmpty); 
//		q.removeIf(s -> s.length() == 4);		
		
		System.out.println("*****");
		
		//List<String>
		var v = List.of("mouse", "parrot");
		
		for (String o: v)
			System.out.println(o);
		
		//v.removeIf(String::isEmpty); 
		//v.removeIf(s -> s.length() == 5);
				
		System.out.println("*****");
		
		var z = new ArrayList<>(v);
		z.removeIf(s -> s.length() == 5);
		System.out.println(z);
		

		
		
	}

}
