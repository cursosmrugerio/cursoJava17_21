package com.curso.v1;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparator {
	
	public static void main(String[] args) {
		
		System.out.println("V1");
		
		String[] values = {"123","Abb","aab"};

		Arrays.sort(values, 
				(z,x)->x.toLowerCase().compareTo(z.toLowerCase())); 
		
		//Abb,aab,123
		
		for (var s: values) 
			System.out.print(s + " ");
		
	}
	
}