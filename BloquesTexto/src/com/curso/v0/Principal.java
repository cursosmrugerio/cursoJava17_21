package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		String eyeTest = "\"Java Study Guide\"\n  by Scott & Jeanne";
		
		System.out.println(eyeTest);
		
		String textBlock = """
				"Java Study Guide"
				  by Scott & Jeanne""";
		
		System.out.println(textBlock);
		
		System.out.println("**********");

		var blocky = """
				Squirrel \s 
				pigeon \
				termite"""; 
		
		System.out.print(blocky);

	}

}
