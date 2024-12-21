package com.curso.v2;

import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		Optional<Double> opt = average(90,100);
		//System.out.println(opt.get()); //Exception
		
		if (!opt.isPresent())
			System.out.println("Sin Elementos");
		
		opt.ifPresent(System.out::println);
		
		
			
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
