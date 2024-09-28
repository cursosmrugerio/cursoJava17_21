package com.curso.interfaces;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	String toString();
	
	boolean equals(Object o);
	
	int hashCode();
	
}
