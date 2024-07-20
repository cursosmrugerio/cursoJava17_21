package com.chapter04;

import java.util.Arrays;

public class Question19 {
	
	//NUMEROS,MAYUSCULAS,MINUSCULAS,

	public static void main(String[] args) {
		
		String[] s1 = { "Camel", "Peacock", "Llama"};

		String[] s2 = { "Camel", "Llama", "Peacock"};

		String[] s3 = { "Camel"};

		String[] s4 = { "Camel", null};
		
		System.out.println(Arrays.compare(s1, s2)); //P>L (+)
		System.out.println(Arrays.compare(s2, s1)); //L<P (-)
		System.out.println(Arrays.compare(s3, s4)); //(-)
		System.out.println(Arrays.compare(s4, s3)); //(+)
		
		System.out.println(Arrays.compare(s3, s4)); //(-)
		
		System.out.println(Arrays.compare(s4, s4));
		
		System.out.println("*************");
		
		System.out.println(Arrays.mismatch(s1, s2)); //1
		System.out.println(Arrays.mismatch(s3, s4)); //1
		System.out.println(Arrays.mismatch(s4, s4)); //1
		
		System.out.println("*************");


		String[] s5 = { "Camel", "Peacock", "Llama"};
		String[] s6 = { "Camel", "Peacock", "Llama"};

		System.out.println(s5.equals(s6)); //false
		
		
		
		
		
		
	}

}
