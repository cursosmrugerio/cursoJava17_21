package com.curso.v0;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class Question05 {

	public static void main(String[] args) {
		
		double d = 100_102.2;

		new Question05().print(d);
	}

	public void print(double t) {
		System.out.println(NumberFormat.getCompactNumberInstance().format(t));

		System.out.println(
				NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT).format(t));

		System.out.print(NumberFormat.getCurrencyInstance().format(t));

	}

}
