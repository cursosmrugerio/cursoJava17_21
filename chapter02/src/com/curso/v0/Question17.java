package com.curso.v0;

public class Question17 {
	
	public static void main(String[] args) {
		int ticketsTaken = 1; 
		int ticketsSold = 3;

		ticketsSold += 1 + ticketsTaken++;
		//                      1
		//          += 2
		// 5
		// ticketsTaken = 2
		
		System.out.println("ticketsSold: "+ticketsSold); //5

		ticketsTaken *= 2; //4
		
		System.out.println("ticketsTaken: "+ticketsTaken); //4
		
		//ticketsSold = (int)(ticketsSold + (long)1);
		ticketsSold += (long)1; //6
		
		System.out.println("ticketsSold: "+ticketsSold); //6

		
	}

}
