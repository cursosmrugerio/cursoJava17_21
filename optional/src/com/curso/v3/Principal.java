package com.curso.v3;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		Optional<Double> opt = average();
		System.out.println(opt);

		System.out.println(opt.orElse(Double.NaN)); 
		System.out.println(opt.orElseGet(() -> Math.random()));
			
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
