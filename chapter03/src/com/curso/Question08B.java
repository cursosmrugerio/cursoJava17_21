package com.curso;

public class Question08B {

	public static void main(String[] args) {

	}

	void printType(Object o) {
		if (o instanceof Integer bat) {
			System.out.print("int");
			// true
		} else if (o instanceof Integer bat && bat < 10) {
			System.out.print("small int");
		} else {
			System.out.print("unknown");
		}
	}

	void printOnlyIntegers(Number number) {
		if (!(number instanceof Integer data))
			return;
		System.out.print(data.intValue());
	}

	void printOnlyIntegers2(Number number) {
		if (number instanceof Integer data)
			System.out.print(data.intValue());
		else
			return;
	}
}
