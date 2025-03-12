package com.curso.streams.v0;

import java.io.*;
import java.nio.charset.*;

public class PrincipalCharacterEncoding {
    public static void main(String[] args) {
        // Creamos un texto con caracteres especiales
        String textoOriginal = "¡Hola Niños! こんにちは 你好";
        System.out.println("Texto original: " + textoOriginal);
        
        // Nombre del archivo donde guardaremos el texto
        String archivo = "mensaje.txt";
        
        try {
            // Primer intento: Guardamos el texto usando US-ASCII (que no soporta acentos ni otros caracteres)
            System.out.println("\nGuardando con US-ASCII (encoding limitado)...");
            guardarArchivo(textoOriginal, archivo, StandardCharsets.US_ASCII);
            String textoLeido = leerArchivo(archivo, StandardCharsets.US_ASCII);
            System.out.println("Texto leído con US-ASCII: " + textoLeido);
            // Notarás que los caracteres especiales se han perdido o cambiado
            
            // Segundo intento: Guardamos usando UTF-8 (soporta todos los caracteres Unicode)
            System.out.println("\nGuardando con UTF-8 (encoding completo)...");
            guardarArchivo(textoOriginal, archivo, StandardCharsets.UTF_8);
            textoLeido = leerArchivo(archivo, StandardCharsets.UTF_8);
            System.out.println("Texto leído con UTF-8: " + textoLeido);
            // El texto debe verse correctamente
            
            // ¿Qué pasa si guardamos con un encoding y leemos con otro?
            System.out.println("\nGuardando con UTF-8 pero leyendo con ISO-8859-1...");
            guardarArchivo(textoOriginal, archivo, StandardCharsets.UTF_8);
            textoLeido = leerArchivo(archivo, StandardCharsets.ISO_8859_1);
            System.out.println("Texto leído con encoding incorrecto: " + textoLeido);
            // Verás caracteres extraños porque el archivo se interpretó incorrectamente
        } catch (IOException e) {
            System.out.println("Error de I/O: " + e.getMessage());
        }
    }
    
    // Método para guardar texto en un archivo con un encoding específico
    private static void guardarArchivo(String texto, String nombreArchivo, Charset charset) throws IOException {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(nombreArchivo), charset))) {
            writer.write(texto);
        }
    }
    
    // Método para leer texto de un archivo con un encoding específico
    private static String leerArchivo(String nombreArchivo, Charset charset) throws IOException {
        StringBuilder contenido = new StringBuilder();
        try (Reader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(nombreArchivo), charset))) {
            int c;
            while ((c = reader.read()) != -1) {
                contenido.append((char) c);
            }
        }
        return contenido.toString();
    }
}