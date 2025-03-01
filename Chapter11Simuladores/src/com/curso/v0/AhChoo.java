package com.curso.v0;

public class AhChoo {
    static class SneezeException extends Exception {}
    static class SniffleException extends SneezeException {}

    public static void main(String[] args) {
        try {
            throw new SneezeException();
        } catch (SneezeException   e) {
            // Handle exception
        } finally {
            // Optional cleanup
        }
    }
}
