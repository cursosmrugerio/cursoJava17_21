package com.curso.v0;

import java.util.Optional;

public class PrincipalPato {

	public static void main(String[] args) {
		
		Optional<Pato> optPato1 = getSinPato("",0.0);
		
		if (optPato1.isPresent()) {
			System.out.println("Optional con Pato");
		}
		
		Optional<String> optPatoName = getPatoName("Donald",0.0);
		System.out.println(optPatoName); //Optional["Donald"]
		System.out.println(optPatoName.get()); //Donald
		
	}
	
	private static Optional<String> getPatoName(String name, double peso) {
		Pato pato = new Pato(name,peso);
		return Optional.of(pato.name);
	}

	public static Optional<Pato> getSinPato(String name, Double weight) {
		return Optional.empty();
	}

}
