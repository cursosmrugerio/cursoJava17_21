package com.curso.v0;

import java.time.LocalDate;

public record RabbitFood(int size, String brand, LocalDate expires) {

	public static int MAX_STORAGE = 100;
	
//	public RabbitFood() {
//		this(0,"none",null);	
//	}
	
	public RabbitFood {
		//size = MAX_STORAGE;
		//this.size = 10; //NO SE PUEDE
		//if(expires.isAfter(LocalDate.now())) throw new RuntimeException();
		//if(brand==null) super.brand = "Unknown"; //NO SE PUEDE
		throw new RuntimeException();
	}
	
}
