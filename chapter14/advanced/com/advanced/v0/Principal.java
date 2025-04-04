package com.advanced.v0;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		String currentDir = System.getProperty("user.dir");
        File file = new File(currentDir + "/data/texto.txt");

		InputStream is = new BufferedInputStream(new FileInputStream(file));
		//InputStream is = new FileInputStream(file);

		
		readData(is);
	}

	static public void readData(InputStream is) throws IOException {

		System.out.print((char) is.read()); // L

		if (is.markSupported()) {
			is.mark(100); // Marks up to 100 bytes
			System.out.print((char) is.read()); // I
			System.out.print((char) is.read()); // O
			is.reset(); // Resets stream to position before I 
		}

		System.out.print((char) is.read()); // I
		System.out.print((char) is.read()); // O
		System.out.print((char) is.read()); // N

	}
}
