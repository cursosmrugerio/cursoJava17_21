package com.user.v0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Hi");
		var reader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = reader.readLine();
		System.out.println("You entered: " + userInput);
		
		try (var out = System.out) {}
		System.out.println("End Program");
	}

}
