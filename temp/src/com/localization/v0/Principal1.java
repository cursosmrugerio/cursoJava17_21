package com.localization.v0;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Principal1 {

	public static void main(String[] args) throws ParseException {
		Locale locale = Locale.getDefault(); 
		System.out.println(locale); // Muestra algo como en_US

		int asistentesPorAño = 3_200_000;
		int asistentesPorMes = asistentesPorAño / 12;

		NumberFormat usFormat = NumberFormat.getInstance(Locale.US);
		System.out.println(usFormat.format(asistentesPorMes)); // 266,666

		NumberFormat deFormat = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(deFormat.format(asistentesPorMes)); // 266.666
		
		double precio = 48;
		NumberFormat moneda = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(moneda.format(precio)); // $48.00

		double tazaExito = 0.802;
		NumberFormat porcent = NumberFormat.getPercentInstance(Locale.US);
		System.out.println(porcent.format(tazaExito)); // 80%
		
		String valor = "40.45";
		
		NumberFormat enFormat = NumberFormat.getInstance(Locale.US);
		System.out.println(enFormat.parse(valor)); // 40.45

		NumberFormat frFormat = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(frFormat.parse(valor)); // 40 
		//(trunca tras el punto porque para Francia “.” no indica decimal)

		NumberFormat compUs = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		System.out.println(compUs.format(7_123_456)); // "7 million"


		LocalDateTime fechaHora = LocalDateTime.of(2022, 10, 20, 15, 12, 34);

		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
		System.out.println(dtf.format(fechaHora)); // 10/20/22, 3:12 PM (en_US)

		DateTimeFormatter dtfIt = dtf.withLocale(new Locale("it", "IT"));
		System.out.println(dtfIt.format(fechaHora)); // 20/10/22, 15:12 (en Italia)

	}

}
