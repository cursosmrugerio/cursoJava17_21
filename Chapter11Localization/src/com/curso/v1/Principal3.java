package com.curso.v1;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Principal3 {
	
	public static void main(String[] args) throws ParseException {
		
		
		String sValor = "40.45";
		NumberFormat usFormat = NumberFormat.getInstance(Locale.US);
		Number nValor = usFormat.parse(sValor);
		System.out.println("usFormat.parse(String s), Number: "+nValor); 
		
		double dValor = 40.45;
		//NumberFormat usFormat = NumberFormat.getInstance(Locale.US);
		String sValor2 = usFormat.format(dValor);
		System.out.println("usFormat.format(double d), String: "+sValor2);
	}

}
