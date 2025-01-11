package com.streams.v3;

import java.io.*;
import java.util.*;
import java.util.function.Supplier;

public class ExceptionCaseStudy2 {

	private static List<String> create() throws IOException {
		throw new IOException();
	}

	private static List<String> createSafe() {
		try {
			return ExceptionCaseStudy2.create();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void wrapped() {
		Supplier<List<String>> s2 = ExceptionCaseStudy2::createSafe;
	}

}