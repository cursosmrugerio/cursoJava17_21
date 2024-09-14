package com.curso.v1.annonymous;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V1 Abstract");
		
		double r;

		Operacion ope1 = new Suma();
		r = ope1.ejecuta(4.0, 8.0);
		System.out.println("Suma:"+r);
		
		Operacion ope2 = new Operacion() {
			@Override
			public double ejecuta(double a, double b) {
				return a-b;
			}
		};
		r = ope2.ejecuta(4.0, 8.0);
		System.out.println("Resta:"+r);
		
		Operacion ope3 = new Operacion() {
			@Override
			public double ejecuta(double a, double b) {
				return a*b;
			}
		};
		r = ope3.ejecuta(4.0, 8.0);
		System.out.println("Multi:"+r);

	}

}
