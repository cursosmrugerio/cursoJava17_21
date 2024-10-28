package com.curso.v4;

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
	
	public <E> void mostrarCertificado(E e) {
		System.out.println("Certificado: "+t+" : "+e);
	}

	@Override
	public String toString() {
		return "Contenedor [" + t + "]";
	}
	
}
