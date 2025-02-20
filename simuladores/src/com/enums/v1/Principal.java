package com.enums.v1;

enum Estacion {
	PRIMAVERA("alta"), OTOÑO("media"), VERANO("alta"), INVIERNO("baja");

	private String visitas;

	Estacion(String visitas) {
		this.visitas = visitas;
	}

	String getVisitas() {
		return "Visitantes: " + visitas;
	}
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V1 CON enum");

		Estacion e = Estacion.PRIMAVERA;

		System.out.println(e);

		System.out.println(e.getVisitas());

		e = Estacion.INVIERNO;

		System.out.println(e);

		System.out.println(e.getVisitas());

	}

}
