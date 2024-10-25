package com.curso.v0;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

class Demo{
	static boolean show(boolean a, boolean b) {
		return a & b;
	}
}

public class Question07 {

	public static void main(String[] args) {

		// Consumer<String> con = (x) -> System.out.println(x);
		Consumer<String> con = System.out::println;
		BinaryOperator<Boolean> bo = (x, y) -> x & y;
		new Question07().x(con, bo);
		
		new Question07().x(System.out::println,Demo::show);
		
		new Question07().method();
		
	}

	public void method1() {
		Consumer<String> con = (var x) -> {};
		BinaryOperator<Boolean> bo = (var x, var y) -> false;
		x(con, bo);

	}
	
	public void method() {
		System.out.println("Paso por method()");
		x((var x) -> {}, (var x, var y) -> false);
	}
	
	public void x(Consumer<String> x, BinaryOperator<Boolean> y) {
		System.out.println("Hola Mundo");
	}

//	public void cadena(String cadena) {
//		System.out.println(cadena);
//		cadena("Hello");
//	}
}
