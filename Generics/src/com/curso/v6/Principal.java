package com.curso.v6;

public class Principal {

	public static void main(String[] args) {
		
		Bici bici = new Bici("modeloZ");
		Contenedor<Bici> con1 = new Contenedor<>(bici);
		System.out.println(con1);
		con1.<StringBuilder>mostrarCertificado(new StringBuilder("XZY123"));
		
		Moto moto = new Moto("motoModX");
		Contenedor<Moto> con2 = new Contenedor<>(moto);
		System.out.println(con2);
		con2.<Integer>mostrarCertificado(Integer.valueOf(12345));

		Motoneta motoneta = new Motoneta("motonetaModY");
		Contenedor<Motoneta> con3 = new Contenedor<>(motoneta);
		System.out.println(con3);
		
		Moto trans = con2.getT();
		System.out.println(trans);
		
//		Contenedor<String> con4 = new Contenedor<>("HelloJava");
//		System.out.println(con4);

	}

}
