package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1==b2); //SI TIENE EL MISMO VALOR
		
		String s1 = new String("Hola");
		String s2 = new String("Hola");
		
		String s3 = "Hola";
		String s4 = "Hola";
		
		System.out.println(s3==s4); //SI APUNTAN AL MISMO OBJETO

		boolean b3 = (boolean)true;
		boolean b4 = (boolean)b3;

	}

}
