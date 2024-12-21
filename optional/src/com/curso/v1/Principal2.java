package com.curso.v1;

import java.util.Optional;

public class Principal2 {

	public static void main(String[] args) {
//		Optional<Double> opt = average();
//		System.out.println(opt.get()); // NoSuchElementException
		
		Optional<Double> o = average();
		System.out.println(o);
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.ofNullable(null);
		int sum = 0;
		for (int score : scores)
			sum += score;
		double result = sum / scores.length;
		return Optional.of(result);
	}

}
