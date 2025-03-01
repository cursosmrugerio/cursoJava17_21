package com.curso.v0;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question06 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2022-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(date);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
	}

}
