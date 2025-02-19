package com.curso.v1;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		String[] p = {"1","2","3"};
		
		List<String> lista = Arrays.asList(p);
		
		List<?> list2 = new ArrayList<String>(lista);
	}

}
