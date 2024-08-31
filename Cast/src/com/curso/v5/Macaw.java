package com.curso.v5;

class Bear {}

interface Bird {
				//ATRIBUTOS public static final
	void fly(); //public abstract

}

class Parrot implements Bird {
	
	@Override
	public void fly() {
		System.out.println("Parrot Fly");
	}
	void flyParrot() {
		System.out.println("Parrot flyParrot()");
	}

}

public class Macaw extends Parrot {

	@Override
	public void fly() {
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
		//Macaw ave3 = (Macaw)ave0;
		//ave3.flyMacaw();
		
		
		//StringBuilder ave4 = (StringBuilder)ave0;
		//System.out.println(ave4);
		
		Bear ave5 = (Bear)ave0;
		
	}
}

