package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		var ip = new Predicado() {
			@Override
			public boolean probar(String cadena) {
				return cadena.contains("v");
			}
		};
		
		//Predicado ip1 = c -> c.contains("v");
		
		System.out.println("V1");
		System.out.println(ip.probar("Python"));
		System.out.println(ip.probar("Java"));
		
		
		var myObject = new Object() {};
		
		System.out.println(myObject);

	
	}

}
