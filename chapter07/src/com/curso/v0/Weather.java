package com.curso.v0;

public class Weather {

	enum Seasons {
		WINTER, SPRING, SUMMER, FALL
	}

	public static void main(String[] args) {

		Seasons v = Seasons.SPRING;
		
		v = switch (v) {
			case SPRING -> {
				System.out.println("Paso por SPRING");
				yield Seasons.SPRING;
			}
			case WINTER -> Seasons.WINTER;
			case SUMMER -> Seasons.SUMMER;
			case FALL -> Seasons.FALL;
			//default -> Seasons.FALL;
		};
		
		System.out.println(v);

	}
}
