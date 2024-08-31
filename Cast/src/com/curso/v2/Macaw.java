package com.curso.v2;

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
		System.out.println("Parrot flyMacaw()");
	}
	
	public static void main(String[] args) {
		
		System.out.println("***UPCASTING***");
		Macaw ave0 = new Macaw();
		
		//UPCASTING
		//Parrot ave1 = (Parrot)ave0;
		Parrot ave1 = ave0;
		
		//Bird ave2 = (Bird)ave0;
		Bird ave2 = ave0;
		
		//Object ave3 = (Object)ave0;
		Object ave3 = ave0;
		
		System.out.println("***DOWNCASTING***");

		Object ave4 = (Object)(new Macaw());
		
		System.out.println(ave4.getClass().getName());
		
		Bird ave5 = (Bird)ave4;
		
		Parrot ave6 = (Parrot) ave4;
		
		Macaw ave7 = (Macaw) ave4;
		
		
	}
}

