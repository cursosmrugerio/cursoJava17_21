package com.user.v0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Principal1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Hi");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userInput = reader.readLine();
		System.out.println("You entered: " + userInput);
		
		try (PrintStream out = System.out) {}
		System.out.println("End Program");
		
		try (PrintStream err = System.err) {}
		System.err.println("End Program Error");
	}

}
