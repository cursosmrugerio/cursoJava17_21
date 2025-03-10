package com.curso.v0;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal2 {

	public static void main(String[] args) {

		Path p = Path.of("whale");
		p.resolve("krill");
		// System.out.println(p);

		//Path path = Path.of("/zoo/../home").getParent().normalize().toAbsolutePath();
		// System.out.println(path);

		Path path = Paths.get("/land/hippo/harry.happy");
		
		System.out.println("The Path Name is: " + path);

		for (int i = 0; i < path.getNameCount(); i++)
			System.out.println("Element " + i + " is: " + path.getName(i));
		
		
	}

}
