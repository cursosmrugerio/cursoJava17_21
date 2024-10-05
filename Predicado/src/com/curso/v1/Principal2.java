package com.curso.v1;

import com.curso.Employee;
import com.curso.interfaces.v1.Predicado;

public class Principal2 {
	
	public static void main(String[] args) {
		
		System.out.println("Version static");
				
		Employee emp1 = new Employee("Patrobas", 17, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 693.45);
		
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		System.out.println("Show menores de 18 años");
		
		Predicado<Employee> pe = e -> e.age()>=18;
		
		Predicado<Employee> peNeg = Predicado.negate(pe);
		
		show(arrayEmp, peNeg);
		
		System.out.println("***************");
		
		show(arrayEmp, Predicado.negate(e -> e.age()>=18));
		
		System.out.println("***************");

		System.out.println("Show mayores de 18 años && sueldo > 500");

		Predicado<Employee> peSueldoMayor500 = e -> e.salary()>500;
		
		Predicado<Employee> peEdadAndSueldo = Predicado.and(pe, peSueldoMayor500);
		
		show(arrayEmp, peEdadAndSueldo);
		
		System.out.println("***************");
		
		show(arrayEmp,Predicado.and(e -> e.age()>=18, e -> e.salary()>500));
		
		System.out.println("***************");

		System.out.println("Show mayores de 18 años || sueldo > 500");

		show(arrayEmp, Predicado.or(e -> e.age()>=18, e -> e.salary()>500));
	}
	
	static void show(Employee[] arrayEmp, 
							  Predicado<Employee> pe) {
		
		for (Employee e :arrayEmp)
			if (pe.probar(e)) //<== EJECUTANDO LA LAMBDA
				System.out.println(e);
	}

}
