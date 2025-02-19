package com.curso.v0;

public class AccessTest5 {
	static int number;
	int result = 10;

	public static void main(String[] args) {
		AccessTest5 at = new AccessTest5();
		number = 11;
		number = at.addSalt(at.result);
		System.out.println(number);
	}

	int addSalt(int salt) {
		var salt1 = 10;
		return number + salt;
	}
}