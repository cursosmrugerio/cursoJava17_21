package com.chapter04;

public class Question16 {

	public static void main(String[] args) {
		//          123 456789 10 11
		var base = "ewe\nsheep\\t"; 
		int length = base.length(); 
		int indent = base.indent(2).length(); 
		int translate = base.translateEscapes().length();
		
		System.out.println(base);
		System.out.println(base.length()); //11
		System.out.println("*****");
		System.out.println(base.indent(2));
		System.out.println(base.indent(2).length());
		System.out.println("*****");
		System.out.println(base.translateEscapes());
		System.out.println(base.translateEscapes().length());
		System.out.println("*****");
		var formatted = "%d %d %d".formatted(length, indent, translate); 
		System.out.format(formatted);

	}

}
