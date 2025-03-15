package com.serializable.v1;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PrincipalObjectOutput {

	public static void main(String[] args) throws IOException {

		String currentDir = System.getProperty("user.dir");
		File file = new File(currentDir + "/data/chimpanzees.data");

		List<Chimpanzee> chimpanzees = new ArrayList<>();

		chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
		chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));

		saveToFile(chimpanzees, file);

		System.out.println("Listo!!!");
	}

	static void saveToFile(List<Chimpanzee> chimpanzees, File dataFile) throws IOException {
		try (var out = new ObjectOutputStream(
				       new BufferedOutputStream(
				       new FileOutputStream(dataFile)))) {

			for (Chimpanzee chimpanze : chimpanzees)

				out.writeObject(chimpanze);
		}
	}

}
