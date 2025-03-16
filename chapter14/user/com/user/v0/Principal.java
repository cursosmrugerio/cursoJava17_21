package com.user.v0;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		try (var in = new FileInputStream("zoo.txt")) {
			System.out.println("Found file!");
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		}
	}

}
