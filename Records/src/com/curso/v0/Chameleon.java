package com.curso.v0;

public record Chameleon() {
	
	private static String name = "Patrobas";
	
    // Método estático para acceder al campo name
    public static String getName() {
        return name;
    }

    // Método estático para modificar el campo name
    public static void setName(String newName) {
        name = newName;
    }
}
