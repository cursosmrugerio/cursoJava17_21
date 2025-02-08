package com.chapter11.v3;

public class JammedTurkeyCage implements AutoCloseable {
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			throw new IllegalStateException("Turkeys ran off");
		} finally {
			throw new RuntimeException("and we couldn't find them");
		}
	}

}