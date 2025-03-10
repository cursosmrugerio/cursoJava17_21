package com.curso.v0;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal3 {

	public static void main(String[] args) {

		//                  0      1        2
		var p = Paths.get("/mammal/omnivore/raccoon.image");
		System.out.println("Path is: " + p);
		for (int i = 0; i < p.getNameCount(); i++) {
			System.out.println(" Element " + i + " is: " + p.getName(i));
		}
		Path p1 = p.subpath(0, 3);
		System.out.println();
		System.out.println("subpath(0,3): " + p1);
		System.out.println("subpath(1,2): " + p.subpath(1, 2));
		System.out.println("subpath(1,3): " + p.subpath(1, 3));

	}

}
