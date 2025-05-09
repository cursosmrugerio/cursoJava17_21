package com.curso.v0;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.text.MessageFormat;

public class ZooApp {
    public static void main(String[] args) {
        // Mostrar mensaje en inglés (default)
        displayZooInfo(new Locale("en"));
        
        System.out.println("\n-------------------\n");
        
        // Mostrar mensaje en español
        displayZooInfo(new Locale("es"));
    }
    
    private static void displayZooInfo(Locale locale) {
        try {
            // Cargar el resource bundle para el locale especificado
            ResourceBundle bundle = ResourceBundle.getBundle("Zoo", locale);
            
            // Obtener los mensajes del bundle
            String name = bundle.getString("name");
            String welcome = bundle.getString("welcome");
            String open = bundle.getString("open");
            String visitors = bundle.getString("visitors");
            String numVisitantes = bundle.getString("numVisitantes");
            
            // Mostrar los mensajes
            System.out.println("Locale: " + locale.getDisplayLanguage());
            System.out.println(welcome);
            System.out.println(name);
            System.out.println(open);
            System.out.println(visitors);
            System.out.println(numVisitantes);
            
        } catch (MissingResourceException e) {
        	//e.printStackTrace();
            System.out.println("Error loading resource bundle: " + e.getMessage());
        }
    }
}