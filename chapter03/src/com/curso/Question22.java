package com.curso;

public class Question22 {
	
	public static void main(String[] args) {
		var tailFeathers = 3; //int
		final var one = 1; //int
		switch (tailFeathers) {
		    case one: System.out.print(3 + " ");
		    default: case 3: System.out.print(5 + " ");
		}
		while (tailFeathers > 1) {
		    System.out.print(--tailFeathers + " ");
		}
	}
 
} // 5 2 1
