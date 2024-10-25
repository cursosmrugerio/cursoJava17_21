package com.curso.v0;

interface Secret {
	String magic(double d);
}

class MySecret implements Secret {
	public String magic(double d) {
		return "Poof";
	}
}

public class Question04 {

	public static void main(String[] args) {
		Secret lamb01 = e -> "Poof";
		Secret lamb02 = (e) -> {return "Poof";};
		Secret lamb03 = e -> { String ee = ""; return "Poof";};
		Secret lamb04 = z -> { String e = ""; return "Poof";};
	}

}





