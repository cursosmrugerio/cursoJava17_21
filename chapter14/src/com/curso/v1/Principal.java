package com.curso.v1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

	public static void main(String[] args) {

		try {
			Files.createDirectory(Path.of("directorioOne"));
			Files.createDirectories(Path.of("bison/field/pasture/green"));
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
