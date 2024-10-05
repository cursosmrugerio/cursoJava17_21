package com.curso.interfaces.v1;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	static <T> Predicado<T> negate(Predicado<T> p){
		return x -> !p.probar(x);
	}
	
	static <T> Predicado<T> and(Predicado<T> p1 , Predicado<T> p2){
		return x -> (p1.probar(x) && p2.probar(x));
	}
	
	static <T> Predicado<T> or(Predicado<T> p1 , Predicado<T> p2){
		return x -> (p1.probar(x) || p2.probar(x));
	}
}
