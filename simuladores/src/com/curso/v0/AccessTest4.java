package com.curso.v0;

public class AccessTest4 {
	static int number;
	int result = 10;

	public static void main(String[] args) {
		AccessTest4 at = new AccessTest4();
		number = 11;
		var number = at.addSalt(AccessTest4.number);
		System.out.println(number);
	}

	int addSalt(int salt) {
		return number + result;
	}
}