package com.curso.v3;

public class Principal {
	
	public static void main(String[] args) {
		
		int x = 5;
		String cadena = "Hola";
		StringBuilder sb = new StringBuilder("Hello");
				
		cadena = transforma(x,cadena,sb);
		
		System.out.println("*********");
		
		System.out.println("x: "+x); //5
		System.out.println("cadena: "+cadena); //Hola Mundo
		System.out.println("sb: "+sb); //Hello World
	}

	private static String transforma(int x, String pato, StringBuilder sb) {
		x = x + 10;
		pato = pato.concat(" Mundo");
		sb.append(" World");
		
//		System.out.println("x: "+x); //15
//		System.out.println("cadena: "+cadena); //Hola Mundo
//		System.out.println("sb: "+sb); //Hello World
		
		return pato;
	}

}
