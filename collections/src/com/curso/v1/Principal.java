package com.curso.v1;

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
		
		clientes.add(new Cliente("Epeneto"));
		clientes.add(new Cliente("Epeneto"));

		System.out.println(clientes.remove(new Cliente("Patrobas")));
		System.out.println(clientes.remove(new Cliente("Epeneto")));
		
		System.out.println(clientes); 
		
		System.out.println(clientes.contains(new Cliente("Epeneto"))); //false

	}

}
