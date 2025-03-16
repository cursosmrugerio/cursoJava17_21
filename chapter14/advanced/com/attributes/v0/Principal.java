package com.attributes.v0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Principal {

	public static void main(String[] args) throws IOException {

		String currentDir = System.getProperty("user.dir");
		var path = Paths.get(currentDir,"/data/texto.txt");
		
		BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);

		System.out.println("Is a directory? " + data.isDirectory());
		System.out.println("Is a regular file? " + data.isRegularFile());
		System.out.println("Is a symbolic link? " + data.isSymbolicLink());
		System.out.println("Size (in bytes): " + data.size());
		System.out.println("Last modified: " + data.lastModifiedTime());
	}

}
