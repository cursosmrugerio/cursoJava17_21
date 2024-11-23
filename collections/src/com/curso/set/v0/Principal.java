package com.curso.set.v0;

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
		Set<Cliente> setCliente = new HashSet<>();
		setCliente.add(new Cliente("Patrobas"));
		setCliente.add(new Cliente("Aristobulo"));
		setCliente.add(new Cliente("Herodion"));
		setCliente.add(new Cliente("Patrobas"));
		
		setCliente.forEach(System.out::println);

		
	}

}
