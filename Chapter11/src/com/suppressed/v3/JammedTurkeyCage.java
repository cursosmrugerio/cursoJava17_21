package com.suppressed.v3;

public class JammedTurkeyCage implements AutoCloseable {

	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close"); // 2
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			throw new IllegalStateException("Turkeys ran off"); //1
		} finally {
			throw new RuntimeException("and we couldn't find them"); //3 //<==
		}
		
		//System.out.println("FinPrograma");
	}

}
