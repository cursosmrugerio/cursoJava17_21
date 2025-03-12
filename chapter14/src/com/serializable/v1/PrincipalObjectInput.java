package com.serializable.v1;

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
		File file = new File(currentDir + "/data/chimpanzees.data");

		var chimpanzees = readFromFile(file);
		
		chimpanzees.forEach(System.out::println);
		
		System.out.println("Listo!!!");
	}

	static List<Chimpanzee> readFromFile(File dataFile) throws IOException, ClassNotFoundException {

		var chimpanzees = new ArrayList<Chimpanzee>();

		try (var in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
			while (true) {
				var object = in.readObject();
				if (object instanceof Chimpanzee g)
					chimpanzees.add(g);
			}
		} catch (EOFException e) {
			return chimpanzees;
		}

	}

}
