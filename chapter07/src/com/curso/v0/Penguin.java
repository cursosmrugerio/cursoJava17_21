package com.curso.v0;

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
	@Override
	public void perform() {
		Swim.super.perform();
		System.out.print("Smile!");
	}

	private void doShow() {
		Swim.super.perform();
		//super.toString();
	}

	public static void main(String[] eggs) {
		//new Penguin().doShow();
		Penguin p = new Penguin();
		p.perform();
	}

}
