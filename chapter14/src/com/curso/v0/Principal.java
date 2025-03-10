package com.curso.v0;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Principal {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
        Path pathSource = Paths.get(currentDir, "data", "stripes.txt");
        Path pathTarget = Paths.get(currentDir, "datos", "stripes.txt");
		try {
			copy(pathSource,pathTarget);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fin Programa");
		//io();
	}

	static void copy(Path source, Path target) throws IOException {
		Files.copy(source, target, 
				LinkOption.NOFOLLOW_LINKS, 
				StandardCopyOption.REPLACE_EXISTING);
	}

	public static void io() {
		String currentDir = System.getProperty("user.dir");
		var file = new File(currentDir + "/data");
		if (file.exists()) {
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Parent Path: " + file.getParent());
			if (file.isFile()) {
				System.out.println("Size: " + file.length());
				System.out.println("Last Modified: " + file.lastModified());
			} else {
				for (File subfile : file.listFiles()) {
					System.out.println(" " + subfile.getName());
				}
			}
		}
	}

}
