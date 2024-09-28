package com.curso.v0;

import com.curso.Employee;
import com.curso.interfaces.PredicadoEmpleado;

public class Principal5 {
	
	public static void main(String[] args) {
		
		System.out.println("V5");
				
		Employee emp1 = new Employee("Patrobas", 17, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 93.45);
		
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		System.out.println("*** Es mayor de edad");
		showMayorEdad(arrayEmp, e -> e.age()>=18 );
		
		System.out.println("*** Sueldo > 500");
		showMayorEdad(arrayEmp, e -> e.salary()>500 );
		
		System.out.println("*** LongitudNombre > 7");
		showMayorEdad(arrayEmp, e -> e.name().length() >7 );
		
		System.out.println("*** ???");
		showMayorEdad(arrayEmp, x -> true );
		
	}
	
	static void showMayorEdad(Employee[] arrayEmp, 
							  PredicadoEmpleado pe) {
		
		for (Employee e :arrayEmp)
			if (pe.probar(e)) //<== EJECUTANDO LA LAMBDA
				System.out.println(e);
	}

}
