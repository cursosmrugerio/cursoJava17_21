package com.curso.v0;

public class Question07 {

	public static void main(String[] args) {

		int ph = 7, vis = 2;
		
		boolean clear = vis > 1 & (vis < 9 || ph < 2);
		//              true      ( true )
		

		boolean safe = (vis > 2) && (ph++ > 1);
		//               false

		System.out.println("ph:" + ph); //7
		
		//                    6
		boolean tasty = 7 <= --ph; 
		
		System.out.println(clear); //true
		System.out.println(safe); //false
		System.out.println(tasty); //false

		System.out.println("ph:" + ph); //6

		//System.out.println(clear + "-" + safe + "-" + tasty);
	}

}
