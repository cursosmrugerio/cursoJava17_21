package com.lowerbound.v0;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<Object> listObject = new ArrayList<>();
		listObject.add(new Object());
		listObject.add("Hello");
		listObject.add(new StringBuilder("Hola"));
		listObject.add(new Figura(0.0));
		listObject.add(new Circulo(0.0));
		listObject.add(new Cuadrado(0.0));
		listObject.add(new Triangulo(0.0));
		showObjectsLower(listObject);
		
		List<String> listString = new ArrayList<>();
		listString.add("Java");
		listString.add("Hello");
		//showObjectsLower(listString);

		List<Figura> listFigura = new ArrayList<>();
		listFigura.add(new Figura(1.0));
		listFigura.add(new Circulo(1.0));
		listFigura.add(new Cuadrado(1.0));
		listFigura.add(new Triangulo(1.0));
		showObjectsLower(listFigura);

		List<Circulo> listCiculo = new ArrayList<>();
		listCiculo.add(new Circulo(2.0));
		listCiculo.add(new Circulo(2.0));
		listCiculo.add(new Circulo(2.0));
		//showObjectsLower(listCiculo);

		List<Cuadrado> listCuadrado = new ArrayList<>();
		listCuadrado.add(new Cuadrado(2.0));
		listCuadrado.add(new Cuadrado(2.0));
		listCuadrado.add(new Cuadrado(2.0));
		//showObjectsLower(listCuadrado);

	}
	
	static void showObjectsLower(List<? super Figura> lista) {
		lista.forEach(System.out::println);
	}
	


}

class Figura{
	private double area;
	public Figura(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				" [area=" + area + "]";
	}
}
class Circulo extends Figura{
	public Circulo(double area) {
		super(area);
	}
}
class Cuadrado extends Figura{
	public Cuadrado(double area) {
		super(area);
	}
}
class Triangulo extends Figura{
	public Triangulo(double area) {
		super(area);
	}
}
