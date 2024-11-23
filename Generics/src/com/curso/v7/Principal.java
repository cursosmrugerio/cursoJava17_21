package com.curso.v7;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<?> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		// These won't work because list4 actually has type ArrayList<Object>
//		list4.add(1);           // Compilation error
//		list4.add("hello");     // Compilation error
//		list4.add(new Object()); // Compilation error

		// This is only good for reading objects of unknown type
		Object something = list4.get(0); // This would work if the list had elements
	
	
		ArrayList<Integer> lista3 = new ArrayList<>() {
			{
			    add(1);
			    add(2);
			    add(3);
			    add(4);
			    add(5);
			}
		};
		
		System.out.println(lista3);
		
		
	}

}
