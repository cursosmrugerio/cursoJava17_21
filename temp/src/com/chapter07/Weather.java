package com.chapter07;

public class Weather {
	enum Seasons {
		WINTER, SPRING, SUMMER, FALL
	}

	public static void main(String[] args) {

		Seasons v = Seasons.FALL;
		switch (v) {
		case SPRING -> System.out.print("s");
		case WINTER -> System.out.print("w");
		case SUMMER -> System.out.print("m");
		default -> System.out.println("missing data");
		}

	}

}