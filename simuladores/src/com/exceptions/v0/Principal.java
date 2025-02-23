package com.exceptions.v0;

class Principal {
	public static void main(String[] args) {
		int[][] a = { { 00, 01 }, { 10, 11 } };
		int i = 99;
		try {
			a[i = 1][val()]++;
		} catch (Exception e) {
			System.out.println(i + ", " + a[1][1]);
		}
	}

	static int val() throws Exception {
		throw new Exception("unimplemented");
	}
}