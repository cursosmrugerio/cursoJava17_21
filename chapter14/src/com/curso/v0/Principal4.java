package com.curso.v0;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal4 {

	public static void main(String[] args) {

		//printPathInformation(Path.of("zoo"));
		//printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
		printPathInformation(Path.of("./armadillo/../shells.txt"));

	}

	static public void printPathInformation(Path path) {

		System.out.println("Filename is: " + path.getFileName());
		System.out.println(" Root is: " + path.getRoot());
		Path currentParent = path;
		while ((currentParent = currentParent.getParent()) != null)
			System.out.println(" Current parent is: " + currentParent);
		System.out.println();

	}

}
