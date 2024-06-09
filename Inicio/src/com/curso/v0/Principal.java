package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		String s1 = "Hola"; //POOL DE STRING
		String s2 = "Hola";
		String s3 = "Hola";
		
		String s4 = new String("Hola"); //NO POOL DE STRING
		
		//OBJETOS? 2
		
		System.out.println("s1==s3 :"+(s1==s3)); //TRUE
		System.out.println("s1==s2 :"+(s1==s2)); //TRUE
		System.out.println("s1==s4 :"+(s1==s4)); //FALSE
		
		System.out.println("s1.equals(s4) :"+s1.equals(s4)); //TRUE
		
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		
		System.out.println("sb1.equals(sb2) :"+sb1.equals(sb2)); //FALSE
		
		Estudiante e1 = new Estudiante("Patrobas",20);
		Estudiante e2 = new Estudiante("Patrobas",20);
		
		System.out.println("e1.equals(e2) :"+e1.equals(e2)); //TRUE



	}

}
