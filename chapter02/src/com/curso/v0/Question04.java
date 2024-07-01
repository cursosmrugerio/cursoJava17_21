package com.curso.v0;

public class Question04 {
	
	public static void main(String[] args) {
		boolean canine = true, wolf = true; 
		int teeth = 20; 
		//        true            false
		canine = (teeth != 10) ^ (wolf=false);
		//                  true        20        false
		System.out.println(canine+", "+teeth+", "+wolf);
	}

}
