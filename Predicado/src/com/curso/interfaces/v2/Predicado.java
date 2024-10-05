package com.curso.interfaces.v2;

import com.curso.interfaces.v2.Predicado;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	default Predicado<T> negate(){
		return x -> !this.probar(x);
	}
	
	default Predicado<T> and(Predicado<T> p){
		return x -> (this.probar(x) && p.probar(x));
	}
	
	default Predicado<T> or(Predicado<T> p){
		return x -> (this.probar(x) || p.probar(x));
	}
	
}
