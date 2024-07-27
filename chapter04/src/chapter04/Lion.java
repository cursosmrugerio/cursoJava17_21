package chapter04;

public class Lion {
	public void roar(String roar1, StringBuilder roar2) {
		roar1 = roar1.concat("!!!");
		roar2.append("!!!");
		//System.out.println(roar1);
	}

	public static void main(String[] args) {

		var roar1 = "roar";
		var roar2 = new StringBuilder("roar");
		
		new Lion().roar(roar1, roar2);
		
		System.out.println(roar1 + " " + roar2);
		//                 roar          roar!!!

	}
}