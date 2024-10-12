package com.chapter08;

import java.util.List;
import java.util.function.Predicate;

public class Question10 {

	public static void main(String[] args) {
		System.out.println("Hello");
	}

	public void remove(List<Character> chars) {

		char end = 'z';
		
		Predicate<Character> predicate = c -> {
			char start = 'a';
			return start <= c && c <= end;
		};

		// INSERT LINE HERE
		char start = 'a';
		char c = 'x';
		chars = null;
		//end = '1';

	}

}
