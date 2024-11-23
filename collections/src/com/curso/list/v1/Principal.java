package com.curso.list.v1;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		String[] array = new String[] {"a", "b", "c"}; 
		List<String> asList = List.of(array);
		
		//asList.add("c");//NO SE PUEDE
		//asList.remove("c");//NO SE PUEDE
		//asList.set(1, "z");//NO SE PUEDE
		
		StringBuilder[] arraySb = 
				new StringBuilder[] {new StringBuilder("a"), new StringBuilder("b"), new StringBuilder("c")}; 
		List<StringBuilder> asList1 = List.of(arraySb);
		
		//asList1.set(1, new StringBuilder("z")); //NO SE PUEDE
		
		asList1.get(1).append("bbbbb");
		
		System.out.println(asList1);
		
		System.out.println(asList1.getClass().getName());
		
		System.out.println("*****************");
		
		List<String> asList2 = List.of(array);
		
		List<String> copy = List.copyOf(asList2);
		
		System.out.println(copy.getClass().getName());
		
		System.out.println("*****************");
		
		List<String> myList = new ArrayList<>(copy);
		
		myList.add("d");
		
		System.out.println(myList);
		
		



	}

}
