package com.curso.v0;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question22 {

	public static void main(String[] args) {
		try {
			LocalDateTime book = LocalDateTime.of(2022, 4, 5, 12, 30, 20);
			
			System.out.println(book.format(DateTimeFormatter.ofPattern("m"))); //30
			System.out.println(book.format(DateTimeFormatter.ofPattern("z"))); //4
			System.out.println(DateTimeFormatter.ofPattern("y").format(book)); //2022
			
		} catch (Throwable e) {
			//System.out.println(e);
		}
		
	}

}
