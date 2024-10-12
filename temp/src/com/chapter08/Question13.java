package com.chapter08;

import java.util.function.Supplier;

public class Question13 {

	public static void main(String[] args) {
		
		final int length = 3;

		for (int i = 0; i < 3; i++) {

			if (i % 2 == 0) {

				Supplier<Integer> supplier = () -> length; // A

				System.out.println(supplier.get());
			} else {

				final int j = i;

				Supplier<Integer> supplier = () -> j;

				System.out.println(supplier.get());

			}

		}
	}

}
