package com.curso.streams.v1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class PrincipalPath02 {

	public static void main(String[] args) throws IOException {

		String currentDir = System.getProperty("user.dir");
		Path path = Paths.get(currentDir, "data", "origen.txt");

		//readLazily(path);
		readLazilyOther(path);

	}

	static private void readLazily(Path path) throws IOException {
		try (Stream<String> s = Files.lines(path)) {
			s.forEach(System.out::println);
		}
	}

	static private void readLazilyOther(Path path) throws IOException {
		try (var s = Files.lines(path)) {
			s.filter(f -> f.startsWith("WARN:"))
			 .map(f -> f.substring(5))
			 .forEach(System.out::println);
		}
	}
}
