package com.curso;

public class Question17 {

	public static void main(String[] args) {
		new Question17().countAttendees();
	}

	private void countAttendees() {
		int participants = 4, animals = 2, performers = -1;

		while ((participants = participants + 1) < 10) {}
		//            5,6,7,8,9,10

		do {} while (animals++ <= 1);
		//             2 , 3

		for (; performers < 2; performers += 2) {}
		//-1, 1, 3

		System.out.println(participants); //10
		System.out.println(animals); //3
		System.out.println(performers); //3

	}

}
