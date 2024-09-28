package com.curso.v0;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		String[] names = {"Patrobas","Andronico","Tercio",
				"Filologo","Epeneto"};
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		System.out.println("------------------");
		
		String[] datos = {"Filologo", "123", "andronico", "Zacarias"};
		
		Arrays.sort(datos);
		
		//123, Filologo, Zacarias, andronico
		System.out.println(Arrays.toString(datos));
		
		
	}

}
