package com.curso.v0;

public class PrincipalString {
	
	public static void main(String[] args) {
		
		String s1 = "Hello";
		s1 = "Hola";
		
		String s2 = "Hello";
		s2.concat(" World");
		System.out.println(s2); //Hello
		
		StringBuilder sb1 = new StringBuilder("Hola");
		sb1.append(" Mundo");
		System.out.println(sb1); //Hola Mundo
		
		String s3 = "Hello World";
		String s4 = s3;
		s3 = null;
		
	}

}
