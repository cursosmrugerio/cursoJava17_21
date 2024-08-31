package com.curso.v8;

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
	
	String name = "Parrot"; //HIDDEN
	String nameParrot = "MyParrot";


	@Override
	void fly() {
		System.out.println("Parrot Fly");
	}
	void flyParrot() {
		System.out.println("Parrot flyParrot()");
	}

}

public class Macaw extends Parrot {
	
	String name = "Macaw"; //HIDDEN
	String nameMacaw = "MyMacaw";


	@Override
	void fly() {
		System.out.println("Macaw Fly");
	}
	
	void flyMacaw() {
		System.out.println("Parrot flyMacaw()");
	}
	
	public static void main(String[] args) {
		
		Bird ave0 = new Macaw();
		
		System.out.println(ave0.name); //Bird
		System.out.println(((Parrot)ave0).name); //Parrot
		System.out.println(((Macaw)ave0).name); //Macaw
		System.out.println("********");
		System.out.println(ave0.nameBird); //MyBird
		System.out.println(((Parrot)ave0).nameParrot); //MyParrot
		System.out.println(((Macaw)ave0).nameMacaw); //MyMacaw
		
		System.out.println("********");
		((Bird)ave0).fly(); 
		((Parrot)ave0).fly();
		((Macaw)ave0).fly();


	
		
		
	}
}

