package com.enums.v2;

final class Estacion {
    // Constantes públicas estáticas finales que representan cada valor
    public static final Estacion PRIMAVERA = new Estacion("PRIMAVERA", "alta", 0);
    public static final Estacion VERANO = new Estacion("VERANO", "alta", 1);
    public static final Estacion OTOÑO = new Estacion("OTOÑO", "media", 2);
    public static final Estacion INVIERNO = new Estacion("INVIERNO", "baja", 3);

    // Array que contiene todas las instancias
    private static final Estacion[] VALUES = {
        PRIMAVERA, VERANO, OTOÑO, INVIERNO
    };

    // Campos de la clase
    private final String nombre;
    private final String visitas;
    private final int ordinal;

    // Constructor privado para evitar instanciación externa
    private Estacion(String nombre, String visitas, int ordinal) {
        this.nombre = nombre;
        this.visitas = visitas;
        this.ordinal = ordinal;
    }

    // Método equivalente al del enum original
    public String getVisitas() {
        return "Visitantes: " + visitas;
    }

    // Métodos públicos equivalentes a los de un Enum
    public String name() {
        return nombre;
    }

    public int ordinal() {
        return ordinal;
    }

    // Método estático para obtener todos los valores
    public static Estacion[] values() {
        return VALUES.clone();
    }

    // Método estático para obtener una instancia por nombre
    public static Estacion valueOf(String nombre) {
        for (Estacion estacion : VALUES) {
            if (estacion.nombre.equals(nombre)) {
                return estacion;
            }
        }
        throw new IllegalArgumentException("No existe la estación: " + nombre);
    }

    // Sobrescribir toString para mostrar el nombre
    @Override
    public String toString() {
        return nombre;
    }

    // Asegurar que no se pueden clonar las instancias
    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    // Asegurar que la serialización mantiene las instancias únicas
    private Object readResolve() {
        return valueOf(nombre);
    }
}

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V2 SIN enum");

		Estacion e = Estacion.PRIMAVERA;

		System.out.println(e);

		System.out.println(e.getVisitas());

		e = Estacion.INVIERNO;

		System.out.println(e);

		System.out.println(e.getVisitas());

	}

}
