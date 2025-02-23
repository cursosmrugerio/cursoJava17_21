package com.exceptions.v0;

public class TestClass1 {
	public static void main(String[] args) {
		try {
			System.exit(0);
		} finally {
			System.out.println("finally is always executed!");
		}
	}
}