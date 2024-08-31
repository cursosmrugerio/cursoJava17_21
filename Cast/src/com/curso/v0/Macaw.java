package com.curso.v0;

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
		
		System.out.println("***ave0***");
		Macaw ave0 = new Macaw();
	
		ave0.fly();
		ave0.flyBird();
		ave0.flyParrot();
		ave0.flyMacaw();
		
		System.out.println("***ave1***");
		Parrot ave1 = new Macaw();
		
		ave1.fly();
		ave1.flyBird(); //HERENCIA
		ave1.flyParrot();
		//ave1.flyMacaw(); //NO SE PUEDE
		
		System.out.println("***ave2***");
		Bird ave2 = new Macaw();
		
		ave2.fly();
		ave2.flyBird(); 
		//ave2.flyParrot(); //NO SE PUEDE
		//ave2.flyMacaw(); //NO SE PUEDE
		
		System.out.println("***ave3***");
		Object ave3 = new Macaw();
		
		//ave3.fly(); //NO SE PUEDE
		//ave3.flyBird(); //NO SE PUEDE
		//ave3.flyParrot(); //NO SE PUEDE
		//ave3.flyMacaw(); //NO SE PUEDE

		
		
	}
}

