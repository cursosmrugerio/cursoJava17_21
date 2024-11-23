package com.curso.v3;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		Collection<String> birds = new ArrayList<>();

		birds.add("hawk");
		birds.add("hawk"); // [hawk, hawk] 
		System.out.println(birds.remove("cardinal")); // false 
		System.out.println(birds.remove("hawk")); // true 
		System.out.println(birds);
		System.out.println("******");
		Collection<String> birds1 = new ArrayList<>();

		birds1.add(new String("hawk"));
		birds1.add(new String("hawk")); // [hawk, hawk] 
		System.out.println(birds1.remove(new String("cardinal"))); // false 
		System.out.println(birds1.remove(new String("hawk"))); // true 
		System.out.println(birds1);
		
		System.out.println("******");
		Collection<StringBuilder> birds2 = new ArrayList<>();

		birds2.add(new StringBuilder("hawk"));
		birds2.add(new StringBuilder("hawk")); // [hawk, hawk] 
		System.out.println(birds2.remove(new StringBuilder("cardinal"))); // false 
		System.out.println(birds2.remove(new StringBuilder("hawk"))); // false 
		System.out.println(birds2);
		
		System.out.println("******");
		Collection<StringBuilder> birds3 = new ArrayList<>();
		
		StringBuilder sb1 = new StringBuilder("hawk");
		StringBuilder sb2 = new StringBuilder("hawk");

		birds3.add(sb1);
		birds3.add(sb2); // [hawk, hawk] 
		System.out.println(birds3.remove(new StringBuilder("cardinal"))); // false 
		System.out.println(birds3.remove(sb2)); // true 
		System.out.println(birds3);//[hawk] 
	}

}
