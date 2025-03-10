package com.curso.v0;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PrincipalRNR {

	public static void main(String[] args) {
		// demoResolve();
		// demoRelativizing();
		demoNormalizing();

	}

	static void demoNormalizing() {
		var p1 = Path.of("./armadillo/../shells.txt");
		System.out.println(p1.normalize()); // shells.txt
		
		var p2 = Path.of("/cats/../panther/food");
		System.out.println(p2.normalize()); // /panther/food

		var p3 = Path.of("../../fish.txt");
		System.out.println(p3.normalize()); // ../../fish.txt
		
		var p4 = Paths.get("/pony/../weather.txt"); 
		var p5 = Paths.get("/weather.txt"); 
		System.out.println(p4.equals(p5)); // false 
		System.out.println(p4.normalize().equals(p5.normalize())); // true
	}

	static void demoRelativizing() {
		var path1 = Path.of("/fish.txt");
		var path2 = Path.of("friendly/birds.txt");
		System.out.println(path1.relativize(path2));
		System.out.println(path2.relativize(path1));
	}

	static void demoResolve() {
		Path path1 = Path.of("/cats/../panther");
		Path path2 = Path.of("food");
		Path path = path1.resolve(path2);
		System.out.println(path);
	}

}
