package com.curso.v2;

public class Contenedor<T> {
	
	private T t;

	public Contenedor(T t) {
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	@Override
	public String toString() {
		return "Contenedor [" + t + "]";
	}
	
}
