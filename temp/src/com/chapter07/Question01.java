package com.chapter07;

public class Question01 {
	
	public record Iguana(int age) {
	    private static final int age1 = 10;
	}

	public final record Gecko() {}

	public record Chameleon() {
	    private static String name;
	}

	public record BeardedDragon(boolean fun) {
	    @Override
	    public boolean fun() {
	        return false;
	    }
	}

	public record Newt(long size) {
	    @Override
	    public boolean equals(Object obj) {
	        return false;
	    }

	    public void setSize(long size) {
	        size = size;
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
