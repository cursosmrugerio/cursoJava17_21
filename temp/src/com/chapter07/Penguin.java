package com.chapter07;

interface Swim {
	default void perform() {
		System.out.print("Swim!");
	}
}

interface Dance {
	default void perform() {
		System.out.print("Dance!");
	}
}

public class Penguin implements Swim, Dance {
//	@Override
//	public void perform() {
//		System.out.print("Smile!");
//	}

	private void doShow() {
		// super.perform(); //A
		// Swim.perform(); //B
		// super.Swim.perform();
		// Swim.super.perform();
		Dance.super.perform();
		super.toString();
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		Dance.super.perform();
	}

	public static void main(String[] eggs) {
		new Penguin().doShow();
	}

}