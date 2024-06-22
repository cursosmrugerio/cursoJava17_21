package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4");

		Aguila ave1 = new Aguila();	
		System.out.println(ave1.getClass().getSimpleName());
		ave1.volar();
		
		Pato ave2 = new Pato();	
		
		System.out.println(ave2.getClass().getSimpleName());
		ave2.volar();

		Pinguino ave3 = new Pinguino();	
		
		System.out.println(ave3.getClass().getSimpleName());
		ave3.volar();
		
		ave3.cv = new SiVolar();
		ave3.volar();
		
		ave3.cv = new AleatorioVolar();
		ave3.volar();

	}

}
