package com.curso.v5;

import java.util.Optional;

class MyException extends RuntimeException{
	MyException(String message){
		super(message);
	}
}

public class Principal {

	public static void main(String[] args) {
		Optional<Double> opt = average();

		System.out.println(opt.orElseThrow(
				() -> new MyException("Optional Vacio")));

	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		double result = sum / scores.length;
		return Optional.of(result);
	}

}
