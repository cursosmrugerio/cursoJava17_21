package chapter04;

public class Question05 {

	public static void main(String[] args) {

		var sb = new StringBuilder(); 
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		
		//aaa
		//abbaa
		//abbaccca
		
		System.out.println(sb);
		
		var a = "Hello";
		a.concat(" World");
		System.out.println(a);
	}

}
