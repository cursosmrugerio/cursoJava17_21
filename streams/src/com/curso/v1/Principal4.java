package com.curso.v1;

import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Principal4 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("w", "o", "l", "f");
		
		//BiConsumer<StringBuilder,String> bc = (sb,string) -> sb.append(string);
				
//		StringBuilder word = stream.collect(
//				() -> new StringBuilder(),
//				(sb,string) -> sb.append(string),
//				(sb1,sb2) -> sb1.append(sb2));
//		
//		System.out.println(word); //wolf
//		
		StringBuilder word = stream.collect( 
				StringBuilder::new, 
				StringBuilder::append, 
				StringBuilder::append);
		
		System.out.println(word); //wolf

		
	}

}
