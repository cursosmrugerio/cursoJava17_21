package com.user.v0;

import java.io.Console;

public class PrincipalConsole0 {

	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {

			System.out.println("Inicio");
			
			String userInput = console.readLine();
			console.writer().println("You entered: " + userInput);
			
			console.format(""); 
		} else {
			System.err.println("Console not available");
		}
	}

}
