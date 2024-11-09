package com.curso.linked.v1;

import java.util.ArrayList;
import java.util.List;

public class NonGenericsCode {

	public static void main(String[] args) {
		List languages = new ArrayList();
		languages.add(23); //0
		Object value = new String("Hola");
		languages.add(value); //1
		
		processLanguages(languages);
	}
	
	private static void processLanguages(List data){
        String language = (String)data.get(0); //ClastCastException 
        System.out.println(language);
    }

}
