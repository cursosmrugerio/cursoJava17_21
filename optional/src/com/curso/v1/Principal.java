package com.curso.v1;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		Optional<Double> opt = average(90, 100);
		//Optional<Double> opt = average();
		if (opt.isPresent()) {
			double result = opt.get();
			System.out.println(result); // 95.0
		}
			
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
