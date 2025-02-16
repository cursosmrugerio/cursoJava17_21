package com.suppressed.v0;

public class TurkeyCage implements AutoCloseable {
	@Override
	public void close() {
		System.out.println("Close gate");
	}

	public static void main(String[] args) {
		
		try (var t = new TurkeyCage()) {
			System.out.println("Put turkeys in");
		}
		
	}

}
