package com.chapter01;

public class KitchenSink {

	private int numForks;

	public static void main(String[] args) {
		int numKnives;

//		System.out.print("""
//				"# forks = " + numForks + 
//				 " # knives = " + numKnives +
//				# cups = 0""");
		
		var blocky = """ 
				squirrel \s 
				pigeon \
				termite"""; 
		
		System.out.print(blocky);

	}

}