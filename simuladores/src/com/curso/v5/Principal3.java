package com.curso.v5;

import java.util.List;

public class Principal3 {

	public static void main(String[] args) {
		
		List<Object> listaObject = null;
		List<String> listaString = null;
		
		show(listaObject);
		//show(listaString); //NO SE PUEDE

		showOther(listaObject);
		showOther(listaString);

	}
	
	static void show(List<Object> lista) {
		System.out.println("Lista Object");
	}
	
	static void showOther(List<?> lista) {
		System.out.println("Lista ?");
	}

}
