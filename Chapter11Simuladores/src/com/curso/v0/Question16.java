package com.curso.v0;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question16 {

	public static void main(String[] args) {

		var f = DateTimeFormatter.ofPattern("hh 'o''clock'"); 
		System.out.println(f.format(LocalDateTime.now()));
	}

}
