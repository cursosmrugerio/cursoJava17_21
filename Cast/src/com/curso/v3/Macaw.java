package com.curso.v3;

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
		
		Object ave0 = new Parrot();
		
		Bird ave1 = (Bird)ave0;
		
		ave1.fly();
		ave1.flyBird();
		
		Parrot ave2 = (Parrot)ave0;
		
		ave2.flyParrot();
		
		//ClassCastException
		Macaw ave3 = (Macaw)ave0;
		ave3.flyMacaw();
		
		//ClassCastException
		StringBuilder ave4 = (StringBuilder)ave0;
		System.out.println(ave4);
		
		
		
		
	}
}

