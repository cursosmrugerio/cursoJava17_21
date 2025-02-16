package com.suppressed.v4;

class Pato implements AutoCloseable {
	@Override
	public void close() {
		throw new RuntimeException("2. Error close pato"); //2
	}
}

public class JammedTurkeyCage implements AutoCloseable {

	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("3. Cage door does not close"); // 3
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage();
			 Pato p = new Pato()) {
			
			throw new IllegalStateException("1. Turkeys ran off"); //1
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
			for (Throwable t: e.getSuppressed())
				System.out.println("***Suppressed***: "+t.getMessage());
		} 

		System.out.println("FinPrograma");
	}

}
