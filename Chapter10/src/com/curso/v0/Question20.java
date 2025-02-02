package com.curso.v0;

import java.util.Optional;

public class Question20 {

	public static void main(String[] args)  {

		Optional<String> opt = Optional.empty();
		
		System.out.println(opt.ofNullable(""));
		
		//opt.orElseThrow(() -> new Exception());
		//opt.orElseThrow(RuntimeException::new);
		
		//opt.orElseThrow();
	}

}
