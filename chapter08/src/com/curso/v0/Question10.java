package com.curso.v0;

import java.util.List;
import java.util.function.Predicate;

public class Question10 {

	public void remove(List<Character> chars) {
		
		//char start = 'a'; //ERROR COMPILATION
		//char c = 'x'; //ERROR COMPILATION
		//chars = null;
		
		char end = 'z'; //LOCAL VARIABLE
		
		// end = '1'; //ERROR COMPILATION

		Predicate<Character> predicate = c -> {
			char start = 'a';
			//System.out.println(chars);
			return start <= c && c <= end; //EFFECTIVELY FINAL
		};

		// INSERT LINE HERE
		char start = 'a';
		char c = 'x';
		chars = null;
		//end = '1'; //ERROR COMPILATION
	}

}
