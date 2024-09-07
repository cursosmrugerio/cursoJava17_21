package com.curso.v0.pojo;

public final class Chameleon {
	
    private static String name;

    public Chameleon() {
        // Constructor vacío
    }

    // Método estático para acceder al campo name
    public static String getName() {
        return name;
    }

    // Método estático para modificar el campo name
    public static void setName(String newName) {
        name = newName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return obj != null && getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return 1; // Constante porque no hay campos de instancia
    }

    @Override
    public String toString() {
        return "Chameleon[]";
    }
}
