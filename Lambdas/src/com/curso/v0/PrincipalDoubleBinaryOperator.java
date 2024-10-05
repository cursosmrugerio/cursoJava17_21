package com.curso.v0;

import java.util.function.DoubleBinaryOperator;

public class PrincipalDoubleBinaryOperator {
	
	public static void main(String[] args) {
		
		DoubleBinaryOperator dbo1 = (x,y) -> x+y;
		DoubleBinaryOperator dbo2 = (x,y) -> x-y;
		DoubleBinaryOperator dbo3 = (x,y) -> x*y;
		DoubleBinaryOperator dbo4 = (x,y) -> x/y;
		DoubleBinaryOperator dbo5 = (x,y) -> Math.pow(x, y);
		
		DoubleBinaryOperator[] array = {dbo1,dbo2,dbo3,dbo4,dbo5};
		
		for (DoubleBinaryOperator dbo: array) 
			System.out.println(dbo.applyAsDouble(8, 4));
		
		
	}

}
