package com.curso.v1;

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
		((Macaw)ave1).flyMacaw(); //DOWNCAST 
		
		System.out.println("***ave2***");
		Bird ave2 = new Macaw();
		
		ave2.fly();
		ave2.flyBird(); 
		((Macaw)ave2).flyParrot(); 
		((Macaw)ave2).flyMacaw(); 
		
		System.out.println("***ave3***");
		Object ave3 = new Macaw();
		
		((Macaw)ave3).fly(); 
		((Macaw)ave3).flyBird(); 
		((Macaw)ave3).flyParrot(); 
		((Macaw)ave3).flyMacaw(); 
		
		System.out.println("***ave4***");
		Object ave4 = new Macaw();
		
		((Parrot)ave4).fly(); 
		((Parrot)ave4).flyBird(); 
		((Parrot)ave4).flyParrot(); 
		//((Parrot)ave4).flyMacaw();
		
		//ave4.fly();
		
		System.out.println("***ave5***");
		Object ave5 = new Macaw();
		
		((Bird)ave5).fly(); 
		((Bird)ave5).flyBird(); 
		((Parrot)(Bird)ave5).flyParrot(); 
		((Macaw)(Parrot)(Bird)ave5).flyMacaw();
		
		//ave5.fly();

		
		
	}
}

