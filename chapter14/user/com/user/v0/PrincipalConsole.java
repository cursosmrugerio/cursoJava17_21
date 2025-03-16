package com.user.v0;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrincipalConsole {

	public static void main(String[] args) throws IOException {
		try (var in = new FileInputStream("zoo.txt")) {
			System.out.println("Found file!");
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		}

//		var reader = new BufferedReader(new InputStreamReader(System.in));
//		String userInput = reader.readLine();
//		System.out.println("You entered: " + userInput);

//		try (var out = System.out) {
//		}
//		System.out.println("Hello");

//		try (var err = System.err) {
//		}
//		System.err.println("Hello");

//		var reader1 = new BufferedReader(new InputStreamReader(System.in));
//		try (reader1) {
//		}
//		String data = reader1.readLine(); // IOException
	}

}
