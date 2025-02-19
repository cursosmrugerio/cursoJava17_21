package com.curso.v0;

public class AccessTest3 {
	static int number;
	int result = 10;

	public static void main(String[] args) {
		AccessTest3 at = new AccessTest3();
		var result = 10;
		number = result;
		System.out.println(at.addSalt(11));
	}

	int addSalt(int salt) {
		return number + salt;
	}
}