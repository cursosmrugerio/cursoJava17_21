package com.curso.v2;

public class Principal {
	
	public static void main(String[] args) {
		
		String nombre = "Epeneto";
		
		for (int x=0; x<=100; x++) {
			//nombre = nombre + x;
			nombre = nombre.concat(x+"");
			System.out.println(nombre);
		}
		
		StringBuilder nombreSb = new StringBuilder("Andronico");
		for (int x=0; x<=100; x++) {
			nombreSb.append(x);
			System.out.println(nombreSb);
		}
		
		nombre = nombreSb.toString();
	}

}
