package com.chapter08;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Question07 {

	public static void main(String[] args) {
		new Question07().method();
	}

	public void method() {
		x(  (var x) -> {}, 
		    (var x, var y) -> false
		 );

	}

	public void x(Consumer<String> x, BinaryOperator<Boolean> y) {
		System.out.println("Method x");
	}

}
