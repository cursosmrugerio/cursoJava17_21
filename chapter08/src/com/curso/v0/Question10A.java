package com.curso.v0;

import java.util.List;
import java.util.function.Predicate;

public class Question10A {
	
	char end = 'z'; //VARIABLE INSTANCIA

	public void remove(List<Character> chars) {
		
		//char end = 'z'; //LOCAL VARIABLE
		
		end = '0';
		
		Predicate<Character> predicate = c -> {
			char start = 'a';
			return start <= c && c <= end; 
		};
		
		end = '1';

	}

}
