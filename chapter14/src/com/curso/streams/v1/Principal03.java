package com.curso.streams.v1;

import java.io.*;

public class Principal03 {

	public static void main(String[] args) throws IOException {

		String currentDir = System.getProperty("user.dir");

		File fileOrigen = new File(currentDir + "/data/origen.txt");
		File fileDestino = new File(currentDir + "/data/destino3.txt");

		copyTextFile(fileOrigen, fileDestino);

		System.out.println("Listo!!!");

	}

	static void copyTextFile(File sc, File dest) throws IOException {
		try (var reader = new BufferedReader(new FileReader(sc));
			 var writer = new BufferedWriter(new FileWriter(dest))) {
			String line = null;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
		}
	}

}
