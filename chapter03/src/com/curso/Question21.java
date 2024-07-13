package com.curso;

public class Question21 {

	public static void main(String[] args) {
		new Question21().findZookeeper(30);
	}

	void findZookeeper(int id) {
		System.out.print(switch(id) {
			case 10 -> {yield "Jane";}
			case 20 -> {yield "Lisa";}
			case 30 -> "Kelly";
			case 31 -> "Sarah";
			default -> "Unassigned";
		});
	}
}
