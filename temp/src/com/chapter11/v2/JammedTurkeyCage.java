package com.chapter11.v2;

public class JammedTurkeyCage implements AutoCloseable {
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			throw new RuntimeException("Turkeys ran off");
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		}
		System.out.println("EndProgram");
	}
	
}