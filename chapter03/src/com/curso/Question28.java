package com.curso;

public class Question28 {

	public static void main(String[] args) {
		new Question28().getFish("goldie");
	}

	void getFish(Object fish) {
		if (!(fish instanceof String guppy))
			System.out.print("Eat!");
		else if (!(fish instanceof String guppyy)) {
			throw new RuntimeException();
		}
		System.out.print("Swim!");
	}

}
