package com.chapter07;

import java.time.LocalDate;

public record RabbitFood(int size, String brand, LocalDate expires) {

	public static int MAX_STORAGE = 100;
	
	public RabbitFood {
		//size = MAX_STORAGE;
		//this.size = 10;
		//throw new RuntimeException();
		//if(expires.isAfter(LocalDate.now())) throw new RuntimeException();
		//if(brand==null) brand = "Unknown";
		throw new RuntimeException();
	}
}