package com.curso.v0;

public class Question04 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		try {
			System.out.print(a / b);
		} catch (ArithmeticException e) {
			System.out.print(0);
		} catch (RuntimeException e) {
			System.out.print(-1);
		} finally {
			System.out.print("done");
		}

	}

}
