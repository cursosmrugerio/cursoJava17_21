package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V2");
		
		ComportamientoVolar cv1 = new SiVolar();
		ComportamientoVolar cv2 = new NoVolar();
		ComportamientoVolar cv3 = new AleatorioVolar();

		Aguila ave1 = new Aguila();	
		
		System.out.println(ave1.getClass().getSimpleName());
		ave1.cv = cv1;
		ave1.volar();
		
		Pato ave2 = new Pato();	
		
		System.out.println(ave2.getClass().getSimpleName());
		ave2.cv = cv3;
		ave2.volar();

		Pinguino ave3 = new Pinguino();	
		
		System.out.println(ave3.getClass().getSimpleName());
		ave3.cv = cv2;
		ave3.volar();
		
		ave3.cv = cv1;
		ave3.volar();
		
		ave3.cv = cv3;
		ave3.volar();

	}

}
