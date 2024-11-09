package com.curso.v0;

import java.util.*;

class Cliente{
	private String name;

	public Cliente(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + "]";
	}
	
	
}

public class Principal {

	public static void main(String[] args) {
		
		Collection<Cliente> clientes = new ArrayList<>();
		
		Cliente c1 = new Cliente("Epeneto");
		Cliente c2 = new Cliente("Epeneto");
		
		clientes.add(c1);
		clientes.add(c2);

		System.out.println(clientes.remove(new Cliente("Patrobas")));
		System.out.println(clientes.remove(c2));
		
		System.out.println(clientes); 

	}

}
