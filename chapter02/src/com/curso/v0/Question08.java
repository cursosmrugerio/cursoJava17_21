package com.curso.v0;

public class Question08 {

	public static void main(String[] args) {
		
		int pig = (short)4;
		
		pig = pig++;
		
		System.out.println("pig: "+ pig);  //4
		
		long goat = (int)4;
		
		//goat = (long)(goat - 1.0);
		goat -= 1.5;
		
		System.out.println("goat: "+goat); //1
		
		System.out.print(pig + " - " + goat);

		
	}

}
