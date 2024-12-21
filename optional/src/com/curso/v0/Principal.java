package com.curso.v0;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		System.out.println(average()); // Optional.empty
		System.out.println(average(90, 100)); // Optional[95.0] 
	}

	public static Double promedio(int... scores) {
		return null;
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
