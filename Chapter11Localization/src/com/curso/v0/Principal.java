package com.curso.v0;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {

	public static void main(String[] args) {

		double numero = 1234.567;
		NumberFormat formato1 = new DecimalFormat("###,###,###.0");
		System.out.println(formato1.format(numero)); // Resultado: 1,234.6

		NumberFormat formato2 = new DecimalFormat("000,000,000.00000");
		//                                         000,001,234.56700
		System.out.println(formato2.format(numero)); // Resultado: 000,001,234.56700
		

		LocalDate fecha = LocalDate.of(2022, 10, 20);
		System.out.println(fecha.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2022-10-20
		System.out.println(fecha.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(fecha.format(DateTimeFormatter.ISO_DATE));
		
		LocalDateTime fechaHora = LocalDateTime.of(2022, 10, 20, 11, 12, 34);
		DateTimeFormatter formatoPersonalizado = 
				DateTimeFormatter.ofPattern("MMMM dd, yyyy 'a las' hh:mm");
		System.out.println(fechaHora.format(formatoPersonalizado));
		//October 20, 2022 a las 11:12
		
		

	}

}
