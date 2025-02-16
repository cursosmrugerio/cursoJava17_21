package com.suppressed.v2;

public class JammedTurkeyCage implements AutoCloseable {

	@Override
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close"); // 2
	}

	public static void main(String[] args) {
		try (JammedTurkeyCage t = new JammedTurkeyCage()) {
			throw new RuntimeException("Turkeys ran off"); //1
		} catch (IllegalStateException e) {
			System.out.println("caught: " + e.getMessage());
		} 
//		catch (RuntimeException e) {
//			System.out.println("caught: " + e.getMessage());
//			for (Throwable t: e.getSuppressed())
//				System.out.println("***Suppressed***: "+t.getMessage());
//		}
		System.out.println("FinPrograma");
	}

}
