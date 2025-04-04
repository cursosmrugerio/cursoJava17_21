package com.traversing.v0;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		String currentDir = System.getProperty("user.dir");
		
		System.out.println("Directorio de Trabajo: "+currentDir);
		
		var path = Paths.get(currentDir);
		
		var size = getPathSize(path); 
		
		System.out.format("Total Size: %.2f megabytes", (size/1000000.0));
		
	}


	static private long getSize(Path p) {
		try {
			return Files.size(p);
		} catch (IOException e) {
			throw new UncheckedIOException(e);
		}
	}

	static public long getPathSize(Path source) throws IOException {
		try (Stream<Path> s = Files.walk(source)) {
			return s.parallel()
					.filter(p -> !Files.isDirectory(p))
					.mapToLong(Principal::getSize)
					.sum();

		}

	}

}
