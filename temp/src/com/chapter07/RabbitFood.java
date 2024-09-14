package com.chapter07;

import java.time.LocalDate;

public record RabbitFood(int size, String brand, LocalDate expires) {

	public static int MAX_STORAGE = 100;
	public RabbitFood {
		//size = MAX_STORAGE;
		throw new RuntimeException();
	}
}