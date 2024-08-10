package chapter06;

public class Question03 {
	int ejecuta() {
		return 0;
	}
	static Number ejecutaObj() {
		return 0;
	}
}

class OtraQuestion extends Question03{
	@Override
	int ejecuta() {
		return (byte)1;
	}
	
	//HIDDEN
	static Double ejecutaObj() {
		return 1.0;
	}
}
