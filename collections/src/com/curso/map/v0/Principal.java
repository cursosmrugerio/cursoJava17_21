package com.curso.map.v0;

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

	@Override
	public int compareTo(Cliente o) {
		return this.name.compareTo(o.name);
	}
	
}

public class Principal {

	public static void main(String[] args) {
		
		Map<Cliente, String> map = new TreeMap<>();
		
		map.put(new Cliente("Patrobas"), "Tv");
		map.put(new Cliente("Aristobulo"), "Radio");
		map.put(new Cliente("Herodion"), "Laptop");
		map.put(new Cliente("Patrobas"), "Tablet");
		map.put(new Cliente("Aristobulo"), "Computadora");
		
		map.entrySet()
			.forEach(e -> System.out.println(
					"Key:"+ e.getKey() + ", Value: " + e.getValue()));
		
		System.out.println("*******");
		
		map.forEach((k,v) -> System.out.println(
					"Key:"+ k + ", Value: " + v));
		

	}

}
