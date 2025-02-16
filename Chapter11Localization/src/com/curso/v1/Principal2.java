package com.curso.v1;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Principal2 {

	public static void main(String[] args) throws ParseException {
		
		String valor = "40.45";
		NumberFormat enFormat = NumberFormat.getInstance(Locale.US);
		Number nValor = enFormat.parse(valor);
		System.out.println(nValor); 
	
		NumberFormat frFormat = NumberFormat.getInstance(Locale.FRANCE);
		System.out.println(frFormat.parse(valor));

		NumberFormat compUs = 
				NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		System.out.println(compUs.format(7_123_456)); // "7 million"
		
		compUs = 
				NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		System.out.println(compUs.format(7_123_456));
		
		compUs = 
				NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
		System.out.println(compUs.format(7_123_456_999_999L)); 
		
		compUs = 
				NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
		System.out.println(compUs.format(7_123_456_999_999L));
		
		LocalDateTime fechaHora = LocalDateTime.of(2022, 10, 20, 15, 12, 34);

		DateTimeFormatter dtf = 
				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);
		System.out.println(dtf.format(fechaHora)); // 10/20/22, 3:12 PM (en_US)

		DateTimeFormatter dtfIt = dtf.withLocale(new Locale("it", "IT"));
		System.out.println(dtfIt.format(fechaHora)); 
		
		ZonedDateTime ZonedFechaHora = ZonedDateTime.now();
		dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL);
		System.out.println(dtf.format(ZonedFechaHora));
		
		


	}

}
