package com.curso.v4;

class Bear {}

class Bird {
	
	void fly() {
		System.out.println("Bird Fly");
	}
	
	void flyBird() {
		System.out.println("Bird flyBird()");
	}

}

class Parrot extends Bird {
	
	@Override
	void fly() {
		System.out.println("Parrot Fly");
	}
	void flyParrot() {
		System.out.println("Parrot flyParrot()");
	}

}

public class Macaw extends Parrot {

	@Override
	void fly() {
		System.out.println("Macaw Fly");
	}
	
	void flyMacaw() {
		System.out.println("Macaw flyMacaw()");
	}
	
	public static void main(String[] args) {
		
		Bird ave0 = new Parrot();
		
		Parrot ave2 = (Parrot)ave0;
		
		ave2.flyParrot();
		
		//ClassCastException
		Macaw ave3 = (Macaw)ave0;
		ave3.flyMacaw();
		
		//No Compila (EN CLASES)
		//StringBuilder ave4 = (StringBuilder)ave0;
		//System.out.println(ave4);
		
		//Bear ave5 = (Bear)ave0;
		
		
	}
}

