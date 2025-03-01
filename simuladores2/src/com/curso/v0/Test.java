package com.curso.v0;

class Super {
	static {
		System.out.print("super ");
	}
}

class One {
	static {
		System.out.print("one ");
	}
}

class Two extends Super {
	static {
		System.out.print("two ");
	}
}

class Test {
	public static void main(String[] args) {
		One o = null; //<==
		Two t = new Two(); //super two
	}
}