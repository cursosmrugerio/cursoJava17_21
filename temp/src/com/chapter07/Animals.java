package com.chapter07;

public enum Animals {

	MAMMAL(true), INVERTEBRATE(Boolean.FALSE), BIRD(false), REPTILE(false), AMPHIBIAN(false),

	FISH(false) {
		@Override
		public int swim() {
			return 4;
		}
	};

	boolean hasHair;

	private Animals(boolean hasHair) {
		this.hasHair = hasHair;
	}

	public boolean hasHair() {
		return hasHair;
	}
	public int swim() { return 0; }
}
