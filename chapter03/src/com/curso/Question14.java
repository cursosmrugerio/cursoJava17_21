package com.curso;

import java.util.*;

public class Question14 {

	public static void main(String[] args) {

		for(var penguin : new int[2]) {
			//System.out.println(penguin.getClass().getName());
			System.out.println(penguin);
		}

		//JAVA8
//		Character[] ostrich = new Character[3];
//		ostrich[0] = 'a';
//		ostrich[1] = 'b';
//		ostrich[2] = 'c';
//
//		for(Character emu : ostrich) {
//			System.out.println(emu.getClass().getName());
//			System.out.println(emu);
//		}
		
		var ostrich = new Character[3];
		ostrich[0] = 'a';
		ostrich[1] = 'b';
		ostrich[2] = 'c';

		for(var emu : ostrich) {
			System.out.println(emu.getClass().getName());
			System.out.println(emu);
		}
		
		System.out.println("*****************");
		
		List<Integer> parrots = new ArrayList<Integer>();
		
		parrots.add(1);

		for(var macaw : parrots) {
			System.out.println(macaw.getClass().getName());
			System.out.println(macaw);
		}
		
	}

}
