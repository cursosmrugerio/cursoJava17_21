package com.chapter10;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

public class ExceptionCaseStudy {

	public static void main(String[] args) {

	}

	private static List<String> create() throws IOException {
		throw new IOException();
	}

	public void bad() throws IOException {
		// Supplier<List<String>> s = ExceptionCaseStudy::create;
		// DOES NOT COMPILE }
	}

	public void good() throws IOException {
		ExceptionCaseStudy.create().stream().count();
	}

	private static List<String> createSafe() {
		try {
			return ExceptionCaseStudy.create();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public void wrapped() {
		Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;
	}

}
