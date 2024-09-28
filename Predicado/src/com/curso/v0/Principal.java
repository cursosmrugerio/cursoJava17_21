package com.curso.v0;

import com.curso.Employee;
import com.curso.interfaces.PredicadoEmpleado;
import com.curso.predicados.PredicadoEdad;

public class Principal {
	
	public static void main(String[] args) {
				
		Employee emp1 = new Employee("Patrobas", 20, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);
		
		//Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		PredicadoEmpleado pre1 = new PredicadoEdad();
		
		boolean res;
		
		res = pre1.probar(emp1);
		System.out.println(emp1);
		System.out.println("Es mayor edada? "+res);
		
		res = pre1.probar(emp3);
		System.out.println(emp3);
		System.out.println("Es mayor edada? "+res);

		
		
	}

}
