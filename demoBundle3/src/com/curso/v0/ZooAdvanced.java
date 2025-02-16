package com.curso.v0;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Properties;
import java.text.MessageFormat;

public class ZooAdvanced {
    private static Properties configProps = new Properties();
    
    public static void main(String[] args) {
        // 1. Cargar configuración adicional usando Properties
        loadConfiguration();
        
        // 2. Probar diferentes locales (incluyendo país)
        Locale[] locales = {
            new Locale("en", "US")
            ,new Locale("en", "CA")
            ,new Locale("es", "ES")
            ,new Locale("fr", "FR")  // Este provocará fallback al default
        };
        
        for (Locale locale : locales) {
            System.out.println("\n=== Testing locale: " + locale + " ===");
            displayZooInfo(locale);
        }
    }
    
    private static void loadConfiguration() {
        try {
            // Cargar configuración adicional del zoo
            configProps.setProperty("opening_time", "10:00");
            configProps.setProperty("closing_time", "18:00");
            configProps.setProperty("ticket_price", "25.00");
        } catch (Exception e) {
            System.err.println("Error loading configuration: " + e.getMessage());
        }
    }
    
    private static void displayZooInfo(Locale locale) {
        try {
            // Intentar cargar el resource bundle con fallback automático
            ResourceBundle bundle = ResourceBundle.getBundle("Zoo", locale);
            
            // Mostrar información del locale actual
            System.out.println("Current Locale: " + locale.getDisplayLanguage(locale) + 
                             " (" + locale.getDisplayCountry(locale) + ")");
            
            // Intentar obtener todas las keys posibles con manejo de fallbacks
            printLocalizedMessage(bundle, "name");
            printLocalizedMessage(bundle, "welcome");
            printLocalizedMessage(bundle, "open");
            printLocalizedMessage(bundle, "visitors");
            
            // Usar MessageFormat para mensajes con parámetros
            if (bundle.containsKey("greeting")) {
                String greetingPattern = bundle.getString("greeting");
                String formattedGreeting = MessageFormat.format(greetingPattern, 
                    "Visitor", 
                    bundle.getString("name"));
                System.out.println("Greeting: " + formattedGreeting);
            }
            
            // Añadir información de la configuración general
            System.out.println("\nGeneral Zoo Information:");
            System.out.println("Opening Hours: " + 
                             configProps.getProperty("opening_time") + " - " + 
                             configProps.getProperty("closing_time"));
            System.out.println("Ticket Price: $" + configProps.getProperty("ticket_price"));
            
        } catch (Exception e) {
            System.out.println("Error with locale " + locale + ": " + e.getMessage());
        }
    }
    
    private static void printLocalizedMessage(ResourceBundle bundle, String key) {
        try {
            System.out.println(key + ": " + bundle.getString(key));
        } catch (Exception e) {
            System.out.println(key + ": [Not available for this locale]");
        }
    }
}