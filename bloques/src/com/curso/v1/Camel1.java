package com.curso.v1;

public class Camel1 {

	public static void main(String[] args) {
		
		//System.out.println("Hola Mundo");
		String s1 = "Hola";
		
		{
			System.out.println("Hello World");
			String s2 = "Hello";
			{
				System.out.println("Otro Hello");
			}
			System.out.println(s2);
		}
		
		System.out.println(s1);
		//System.out.println(s2);
		
	}

}
