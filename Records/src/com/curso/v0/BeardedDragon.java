package com.curso.v0;

public record BeardedDragon(boolean fun) {

	@Override
	public boolean fun() {
		return !fun;
	}

}
