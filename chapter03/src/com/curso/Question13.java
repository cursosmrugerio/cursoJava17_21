package com.curso;

public class Question13 {

	public static void main(String[] args) {

		boolean keepGoing = true;
		int result = 15, meters = 10;
		do {
		    meters--;
		    if(meters == 8) keepGoing = false;
		    result -= 2;
		} while (keepGoing);
		System.out.println(result);
		
		//keepGoing   result    meter
		//   true       15        10
		//              13         9      
		//   false      11         8

	}

}
