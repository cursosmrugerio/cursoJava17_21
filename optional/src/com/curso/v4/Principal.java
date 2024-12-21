package com.curso.v4;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		Optional<Double> opt = average();

		//System.out.println(opt.get());
		System.out.println(opt.orElseThrow());
			
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
