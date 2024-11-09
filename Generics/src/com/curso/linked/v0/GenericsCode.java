package com.curso.linked.v0;

import java.util.ArrayList;
import java.util.List;

public class GenericsCode {

	public static void main(String[] args) {
		//List<String> languages = new ArrayList<String>();
		List<String> languages = new ArrayList<>();
		languages.add("English"); //0
		String value = new String("Swedish");
		languages.add(value); //1
		
		processLanguages(languages);
	}
	
	private static void processLanguages(List<String> data){
        String language = data.get(0); 
        System.out.println(language);
    }

}
