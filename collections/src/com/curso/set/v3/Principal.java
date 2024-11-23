package com.curso.set.v3;

import java.util.*;

class Cliente implements Comparable<Cliente> {
	private String name;

	public Cliente(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cliente [name=" + name + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(name);
//	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Cliente other = (Cliente) obj;
//		return Objects.equals(name, other.name);
//	}

	@Override
	public int compareTo(Cliente o) {
		return this.name.compareTo(o.name);
	}

}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("TreeSet V3");
		
		Set<Cliente> setCliente = new TreeSet<>();
		setCliente.add(new Cliente("Patrobas"));
		setCliente.add(new Cliente("Aristobulo"));
		setCliente.add(new Cliente("Herodion"));
		setCliente.add(new Cliente("Patrobas"));
		
		setCliente.forEach(System.out::println);
		//Aristobulo, Herodion, Patrobas

		
	}

}
