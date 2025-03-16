package com.advanced.v0;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Principal1 {

	public static void main(String[] args) throws IOException {
		String currentDir = System.getProperty("user.dir");
        File file = new File(currentDir + "/data/texto2.txt");

		InputStream is = new FileInputStream(file);
		readData(is);
	}

	static public void readData(InputStream is) throws IOException {
		System.out.print ((char)is.read()); // T 
		is.skip(2); // Skips I and G 
		is.read(); // Reads E but doesn't output it 
		System.out.print((char)is.read()); // R 
		System.out.print((char)is.read()); // S
	}
}
