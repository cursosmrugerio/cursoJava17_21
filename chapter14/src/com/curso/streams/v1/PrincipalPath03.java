package com.curso.streams.v1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrincipalPath03 {

	public static void main(String[] args) throws IOException {

		String currentDir = System.getProperty("user.dir");
		Path pathInput = Paths.get(currentDir, "data", "origen.txt");

		Path pathOutput = Paths.get(currentDir, "data", "destino.txt");
		copyPath(pathInput, pathOutput);

		System.out.println("Listo!!!");

	}

	static private void copyPath(Path input, Path output) throws IOException {

		try (BufferedReader reader = Files.newBufferedReader(input); 
			 BufferedWriter writer = Files.newBufferedWriter(output)) {

			String line = null;

			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
		}
	}
}
