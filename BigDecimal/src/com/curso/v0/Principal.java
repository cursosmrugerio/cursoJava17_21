package com.curso.v0;

import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {
		
		
		double a = 0.02;
		double b = 0.03;
		//double c = ((b*1000) - (a*1000));
		//System.out.println(c/1000); 
		System.out.println(b - a);

		BigDecimal _a = new BigDecimal("0.02");
		BigDecimal _b = new BigDecimal("0.03");
		BigDecimal _c = _b.subtract(_a);
		System.out.println(_c);
	}

}
