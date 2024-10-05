package com.curso.v1;

import com.curso.Employee;
import com.curso.interfaces.Predicado;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V0");
		
		Predicado.showStatic();
				
		Predicado<Employee> pe = e -> e.age()>=18;
		
		pe.showDefault();
		
		Predicado<String> result = Predicado.returnPredicate();
		
		System.out.println(result.probar("Hello"));
		
		
	}
}
