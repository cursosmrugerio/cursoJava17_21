package com.chapter14.v0;

import java.io.Console;
import java.util.Arrays;

public class RegistroUsuario {

	public static void main(String[] args) {

		Console console = System.console();
		if (console == null) {
		    System.err.println("Consola no disponible. Ejecute desde una terminal interactiva.");
		    return;
		}

		// Solicitar información básica
		String nombre = console.readLine("Por favor, ingrese su nombre: ");
		console.writer().format("Hola %s\n", nombre);

		console.writer().println();
		console.format("¿Cuál es su dirección? ");
		String direccion = console.readLine();

		// Solicitar y verificar contraseña
		char[] contraseña = console.readPassword("Ingrese una contraseña " +
		    "entre %d y %d caracteres: ", 5, 10);
		char[] verificacion = console.readPassword("Ingrese la contraseña nuevamente: ");

		boolean coinciden = Arrays.equals(contraseña, verificacion);
		console.printf("Las contraseñas " + 
		    (coinciden ? "coinciden" : "no coinciden"));

		// Limpiar las contraseñas de la memoria inmediatamente
		Arrays.fill(contraseña, ' ');
		Arrays.fill(verificacion, ' ');
	}

}
