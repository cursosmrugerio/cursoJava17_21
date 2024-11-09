package com.curso.v2;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(name, other.name);
	}

	
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V2");
		
		Collection<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente("Epeneto"));
		clientes.add(new Cliente("Epeneto"));

		System.out.println(clientes.remove(new Cliente("Patrobas")));
		System.out.println(clientes.remove(new Cliente("Epeneto")));
		
		System.out.println(clientes); 

	}

}
