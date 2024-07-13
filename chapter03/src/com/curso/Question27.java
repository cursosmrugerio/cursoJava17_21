package com.curso;

public class Question27 {

	public static void main(String[] args) {

		byte amphibian = 4;
		String name = "Frog";
		String color = switch(amphibian) {
		    case 1 -> { yield "Red"; }
		    case 2 -> { if(name.equals("Frogx")) yield "Green";
		    				else yield "Other";}
		    case 3 -> { yield "Purple"; }
		    default -> throw new RuntimeException();
		};
		System.out.print(color);

	}

}
