package com.chapter07.v0;

import java.time.LocalDate;
import java.util.Objects;

public final class RabbitFood {
    private final int size;
    private final String brand;
    private final LocalDate expires;

    public RabbitFood(int size, String brand, LocalDate expires) {
        this.size = size;
        this.brand = brand;
        this.expires = expires;
    }

    public int size() {
        return this.size;
    }

    public String brand() {
        return this.brand;
    }

    public LocalDate expires() {
        return this.expires;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        RabbitFood other = (RabbitFood) obj;
        return this.size == other.size &&
               Objects.equals(this.brand, other.brand) &&
               Objects.equals(this.expires, other.expires);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, brand, expires);
    }

    @Override
    public String toString() {
        return "RabbitFood[" +
               "size=" + size + ", " +
               "brand=" + brand + ", " +
               "expires=" + expires + "]";
    }
}
