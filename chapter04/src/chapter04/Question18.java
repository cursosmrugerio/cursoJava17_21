package chapter04;

public class Question18 {

	public static void main(String[] args) {

		String s1 = """
				purr""";
		
		s1.toUpperCase();
		s1.trim();
		s1.substring(1, 3);
		
		s1 += "two";
		
		System.out.println(s1); //purrtwo
		
		System.out.println(s1.length());//7
		
		String s2 = "";
		
		s2 += 2;  //2
		s2 += 'c';  //2c
		s2 += false; //2cfalse //No se almacena el Pool String
		
		//s2 = new String("2cfalse");
		
		//         Pool String
		if ( s2 == "2cfalse") System.out.println("==");
		else System.out.println("!=");
		
		if ( s2.equals("2cfalse")) System.out.println("equals");
	}

}
