package com.curso.streams.v1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrincipalPath01 {

	public static void main(String[] args) throws IOException {
		
		String currentDir = System.getProperty("user.dir");
        Path pathInput = Paths.get(currentDir, "data", "origen.txt");
        
        Path pathOutput1 = Paths.get(currentDir, "data", "origenPath1.txt");
        copyPathAsString(pathInput,pathOutput1);
        
        Path pathOutput2 = Paths.get(currentDir, "data", "origenPath2.txt");
        copyPathAsBytes(pathInput,pathOutput2);
        
        Path pathOutput3 = Paths.get(currentDir, "data", "origenPath3.txt");
        copyPathAsBytes(pathInput,pathOutput3);
        
        System.out.println("Listo!!!");

	}

	static private void copyPathAsString(Path input, Path output) throws IOException {
		
		String string = Files.readString(input);
		
		Files.writeString(output, string);
	}

	static private void copyPathAsBytes(Path input, Path output) throws IOException {

		byte[] bytes = Files.readAllBytes(input);

		Files.write(output, bytes);
	}

	static private void copyPathAsLines(Path input, Path output) throws IOException {

		List<String> lines = Files.readAllLines(input);

		Files.write(output, lines);

	}
}
