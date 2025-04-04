package com.traversing.v0;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Principal1 {

	public static void main(String[] args) throws IOException {

		String currentDir = System.getProperty("user.dir");
		System.out.println("Directorio actual: "+currentDir);
		
		var path = Paths.get(currentDir);

		long minSize = 1_000;

		try (Stream<Path> s = 
				Files.find(path, 10,
								(p, a) -> a.isRegularFile() && 
									p.toString().endsWith(".java") && 
									a.size() > minSize,
								FileVisitOption.FOLLOW_LINKS)) {
			
			s.forEach(System.out::println);
		}

	}

}
