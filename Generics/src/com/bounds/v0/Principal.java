package com.bounds.v0;

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
		showObjects(listObject);
		showObjectsUnbounded(listObject);
		
		List<String> listString = new ArrayList<>();
		listString.add("Java");
		listString.add("Hello");
		//showObjects(listString); //NO SE PUEDE
		showObjectsUnbounded(listString);
		
		List<Figura> listFigura = new ArrayList<>();
		listFigura.add(new Figura(1.0));
		listFigura.add(new Circulo(1.0));
		listFigura.add(new Cuadrado(1.0));
		listFigura.add(new Triangulo(1.0));
		//showObjects(listFigura); //NO SE PUEDE
		showObjectsUnbounded(listFigura);
		
		List<Circulo> listCiculo = new ArrayList<>();
		listCiculo.add(new Circulo(2.0));
		listCiculo.add(new Circulo(2.0));
		listCiculo.add(new Circulo(2.0));
		//showObjects(listCiculo); //NO SE PUEDE
		showObjectsUnbounded(listCiculo);
	}
	
	static void showObjects(List<Object> listObject) {
		listObject.add(new Object());
		listObject.forEach(System.out::println);
	}
	
	static void showObjectsUnbounded(List<?> listObject) {
		//listObject.add(new Object());
		listObject.forEach(System.out::println);
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

