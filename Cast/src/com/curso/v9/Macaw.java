package com.curso.v9;

class Bird {
	
	String name = "Bird";
	String nameBird = "MyBird";
	
	void fly() {
		System.out.println("Bird Fly");
	}
	
	void flyBird() {
		System.out.println("Bird flyBird()");
	}

}

class Parrot extends Bird {
	
	String name = "Parrot";
	String nameParrot = "MyParrot";


	@Override
	void fly() {
		super.fly();
		System.out.println("Parrot Fly");
	}
	void flyParrot() {
		System.out.println("Parrot flyParrot()");
	}

}

public class Macaw extends Parrot {
	
	String name = "Macaw";
	String nameMacaw = "MyMacaw";


	@Override
	void fly() {
		super.fly();
		System.out.println("Macaw Fly");
	}
	
	void flyMacaw() {
		System.out.println("Parrot flyMacaw()");
	}
	
	public static void main(String[] args) {
		
		Bird ave0 = new Macaw();
		
		ave0.fly();
		
		
		


	
		
		
	}
}

