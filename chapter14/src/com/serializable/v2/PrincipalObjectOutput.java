package com.serializable.v2;

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
        File file = new File(currentDir + "/data/gorillas.data");

		// Crear una lista de 10 gorilas
        List<Gorilla> gorillas = new ArrayList<>();
        
        gorillas.add(new Gorilla("Koko", 12, true, "Bananas"));
        gorillas.add(new Gorilla("Kong", 25, false, "Frutas tropicales"));
        gorillas.add(new Gorilla("Bubbles", 8, true, "Manzanas"));
        gorillas.add(new Gorilla("Magilla", 15, true, "Nueces"));
        gorillas.add(new Gorilla("Harambe", 17, true, "Hojas verdes"));
        gorillas.add(new Gorilla("Enzo", 20, false, "Caña de azúcar"));
        gorillas.add(new Gorilla("Lucy", 10, true, "Bayas"));
        gorillas.add(new Gorilla("Coco", 5, true, "Mangos"));
        gorillas.add(new Gorilla("Brutus", 22, false, "Melones"));
        gorillas.add(new Gorilla("Nala", 7, true, "Plátanos"));
        gorillas.add(new Gorilla("KingKong", 20, true, "Plátanos"));
        
        saveToFile(gorillas,file);
        
        System.out.println("Listo!!!");
	}

	static void saveToFile(List<Gorilla> gorillas, File dataFile) throws IOException {
		try (var out = new ObjectOutputStream(
					   new BufferedOutputStream(
					   new FileOutputStream(dataFile)))) {

			for (Gorilla gorilla : gorillas)

				out.writeObject(gorilla);
		}
	}

}
