package com.curso.interfaces;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	static void showStatic() { //public
		System.out.println("Method Static");
		showStaticPrivate();
	}
	
	private static void showStaticPrivate() {
		System.out.println("Method Static private");
	}
	
	default void showDefault() { //public
		System.out.println("Method Default");
		showDefaultPrivate();
	}
	
	private void showDefaultPrivate() {
		System.out.println("Method private");
	}
	
	static <T> Predicado<T> returnPredicate(){
		return x -> true;
	}
	
}
