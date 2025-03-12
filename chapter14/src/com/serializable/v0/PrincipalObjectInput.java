package com.serializable.v0;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class PrincipalObjectInput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String currentDir = System.getProperty("user.dir");
		File file = new File(currentDir + "/data/gorillas.data");

		var gorillas = readFromFile(file);
		
		gorillas.forEach(System.out::println);
		
		System.out.println("Listo!!!");
	}

	static List<Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException {

		var gorillas = new ArrayList<Gorilla>();

		try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
			while (true) {
				var object = in.readObject();
				if (object instanceof Gorilla g)
					gorillas.add(g);
			}
		} catch (EOFException e) {
			return gorillas;
		}

	}

}
