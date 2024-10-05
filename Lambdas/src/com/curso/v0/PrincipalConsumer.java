package com.curso.v0;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class PrincipalConsumer {

	public static void main(String[] args) {

		Consumer<String> con1 = s -> System.out.println(s);
		con1.accept("Hello World");
		
		Consumer<Employee> con2 = z -> System.out.println(z);
		con2.accept(new Employee("Patrobas",20,100.0));
		
		Employee emp1 = new Employee("Patrobas", 17, 123.45);
		Employee emp2 = new Employee("Andronico", 30, 823.45);
		Employee emp3 = new Employee("Epeneto", 15, 723.45);
		Employee emp4 = new Employee("Filologo", 40, 223.45);
		Employee emp5 = new Employee("Tercio", 18, 593.45);
		Employee[] arrayEmp = {emp1,emp2,emp3,emp4,emp5};
		
		List<Employee> listEmp = Arrays.asList(arrayEmp);
		System.out.println("***forEach");
		listEmp.forEach(e -> System.out.println(e));
		//listEmp.forEach(System.out::println); //Method Reference
		
		Consumer<Integer> con3 = q -> System.out.println("Consumer: "+q);
		con3.accept(500);
		
		IntConsumer con4 = q -> System.out.println("IntConsumer: "+q);
		con4.accept(1000);

		
	}

}
