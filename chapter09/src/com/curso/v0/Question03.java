package com.curso.v0;

import java.util.ArrayDeque;

public class Question03 {

	public static void main(String[] args) {
		var greetings = new ArrayDeque<String>();
		
		greetings.offerLast("hello");
		
		greetings.offerLast("hi"); //[hello,hi]
		
		greetings.offerFirst("ola"); //[ola,hello,hi]
		
		String s = greetings.pop(); //remove element stack
		
		System.out.println(s);
		
		s = greetings.peek(); //[hello,hi]
		
		System.out.println(s); //hello

		System.out.println(greetings); //[hello,hi]
		
		System.out.println("*******");
		while (greetings.peek() != null)
			System.out.print(greetings.pop());
		
		//hellohi
			
	}

}
