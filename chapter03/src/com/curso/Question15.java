package com.curso;

public class Question15 {

	public static void main(String[] args) {

		final char a = 'A', e = 'E';

		char grade = 'Z'; 
		
		switch (grade) {

		default: System.out.print("none "); 

		case a:

		case 'B','C': System.out.print("great "); 
		
		case 'D': System.out.print("good "); break; 
		
		case e:

		case 'F': System.out.print("not good ");

		} //none  great good
	}

}
