package com.curso.list.v0;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		String[] array = new String[] {"a", "b", "c"}; 
		List<String> asList = Arrays.asList(array);
		
		//asList.add("c");//NO SE PUEDE
		//asList.remove("c");//NO SE PUEDE
		asList.set(1, "z");
		
		System.out.println(asList);
		
		System.out.println("Array: "+Arrays.toString(array));
		
		array[1] = "x";
		
		System.out.println(asList.getClass().getName());

	}

}
