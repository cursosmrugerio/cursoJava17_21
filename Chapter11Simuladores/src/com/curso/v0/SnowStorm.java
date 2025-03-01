package com.curso.v0;

public class SnowStorm {
	
	static class WalkToSchool implements AutoCloseable {
		public void close() {
			throw new RuntimeException("flurry");
		}
	}

	public static void main(String[] args) {
		WalkToSchool walk1 = new WalkToSchool();
		try (walk1; WalkToSchool walk2 = new WalkToSchool()) {
			throw new RuntimeException("blizzard"); //<==
		} catch (Exception e) {
			System.out.println(e.getMessage() + " " + e.getSuppressed().length);
			for (Throwable x: e.getSuppressed()) {
				System.out.println(x);
			}
		}
		
		//blizzard  2
 	}
}