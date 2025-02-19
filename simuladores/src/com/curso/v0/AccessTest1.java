package com.curso.v0;

public class AccessTest1 {
	static int number;
	int result = 10;

	public static void main(String[] args) {
		AccessTest1 at = new AccessTest1();
		at.number = 10;
		System.out.println(at.addSalt(11));
	}

	int addSalt(int salt) {
		return number + salt;
	}
}