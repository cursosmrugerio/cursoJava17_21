package com.curso.v0;

import java.io.Closeable;

public class FamilyCar {
	static class Door implements AutoCloseable {
		public void close() {
			System.out.print("D");
		}
	}

	static class Window implements Closeable {
		public void close() {
			System.out.print("W");
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		var d = new Door(); //Effective Final
		try (d; var w = new Window()) {
			System.out.print("T");
		} catch (Exception e) {
			System.out.print("E");
		} finally {
			System.out.print("F");
		}
	}
}
