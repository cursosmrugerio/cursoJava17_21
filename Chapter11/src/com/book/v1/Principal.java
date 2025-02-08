package com.book.v1;

class MyFileClass implements AutoCloseable {
	private final int num;

	public MyFileClass(int num) {
		this.num = num;
	}

	@Override
	public void close() {
		System.out.println("Closing: " + num);
	}
}

public class Principal {

	public static void main(String... xyz) {

		try (MyFileClass bookReader = new MyFileClass(1);
			 MyFileClass movieReader = new MyFileClass(2)) {
			
			System.out.println("Try Block");
			throw new RuntimeException();
		} catch (Exception e) {
			System.out.println("Catch Block");
		} finally {
			System.out.println("Finally Block");
		}
		//Try Block
		//Closing 2
		//Closing 1
		//Catch Block
		//Finally Block

	}

}
