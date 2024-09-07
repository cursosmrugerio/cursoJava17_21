package com.curso.v0.pojo;

public final class Gecko {

    public Gecko() {
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        return obj != null && getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return 1; // Constante porque no hay campos
    }

    @Override
    public String toString() {
        return "Gecko[]";
    }
}