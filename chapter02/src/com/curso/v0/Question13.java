package com.curso.v0;

public class Question13 {

	public static void main(String[] args) {
		boolean sunny = true, raining = false, sunday = true;
		                           // false       ^ true
		boolean goingToTheStore = sunny & raining ^ sunday; 
		
		                        // true     true
		boolean goingToTheZoo = sunday && !raining;
		
		System.out.println("raining:" + raining); //false
		
		                             //true            true
		boolean stayingHome = !(goingToTheStore && goingToTheZoo);//false
		
//		System.out.println(goingToTheStore); //true
//		System.out.println(goingToTheZoo); //true
//		System.out.println(stayingHome); //false

		System.out.println(goingToTheStore + "-" + goingToTheZoo + "-" +stayingHome);

	}

}
