package com.curso.v1;

import java.text.NumberFormat;
import java.util.Locale;

public class Principal {

	public static void main(String[] args) {

		Locale locale = Locale.getDefault(); 
		System.out.println(locale);

		int asistentesPorAño = 3_200_000;
		int asistentesPorMes = asistentesPorAño / 12;
		
		NumberFormat usFormat = NumberFormat.getInstance(Locale.US);
		System.out.println("Locale.US: "+usFormat.format(asistentesPorMes)); // 266,666

		NumberFormat deFormat = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println("Locale.GERMANY: "+deFormat.format(asistentesPorMes)); // 266.666

		NumberFormat frFormat = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println("Locale.FRANCE: "+frFormat.format(asistentesPorMes)); // 266 666
		
		
		double precio = 48;
		NumberFormat moneda = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Locale.US: "+moneda.format(precio)); // $48.00

		moneda = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("Locale.UK: "+moneda.format(precio)); //£48.00
		
		moneda = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("Locale.FRANCE: "+moneda.format(precio)); //48,00 €

        
        double tazaExito = 0.802;
        NumberFormat porcent = NumberFormat.getPercentInstance(Locale.US);
        System.out.println("Locale.US: "+porcent.format(tazaExito)); //80%
        
        porcent = NumberFormat.getPercentInstance(Locale.FRANCE);
        System.out.println("Locale.FRANCE: "+porcent.format(tazaExito)); //80 %


	}

}
