package com.streams.v3;

import java.io.*;
import java.util.*;
import java.util.function.Supplier;

public class ExceptionCaseStudy {

	private static List<String> create() throws IOException {
		throw new IOException();
	}

	private static List<String> crear() {
		return null;
	}

	public void ugly() {

		Supplier<List<String>> s = () -> {
			try {
				return ExceptionCaseStudy.create(); //List<String>
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

		};

	}

	public void bad() throws IOException {
		//Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE
	}

//	public void bad() { 
//		//Supplier<List<String>> s = ExceptionCaseStudy::create; // DOES NOT COMPILE 
//		Supplier<List<String>> s1 = () -> {
//			try {
//				return ExceptionCaseStudy.create();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			return null;
//		};
//	}

	public void correcto() {
		Supplier<List<String>> s = ExceptionCaseStudy::crear;
	}

	public void good() throws IOException {
		ExceptionCaseStudy.create().stream().count();
	}

}