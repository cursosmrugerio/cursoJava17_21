package com.curso.v0;

import com.curso.Employee;
import com.curso.interfaces.PredicadoEmpleado;

public class Principal3 {
	
	public static void main(String[] args) {
		
		System.out.println("V3");
				
		Employee emp1 = new Employee("Patrobas", 20, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);
		
		//Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		//DEFINICION DE LA LAMBDA
		PredicadoEmpleado pre1 = e -> e.age()>=18;
		
		boolean res;
		
		//EJECUTA LA LAMBDA
		res = pre1.probar(emp1);
		System.out.println(emp1);
		System.out.println("Es mayor edada? "+res);
		
		//EJECUTA LA LAMBDA
		res = pre1.probar(emp3);
		System.out.println(emp3);
		System.out.println("Es mayor edada? "+res);

		
		
	}

}
