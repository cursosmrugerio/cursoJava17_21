package com.curso.v1;

import java.time.LocalDate;
import java.util.Objects;

public final class RabbitFood {
    private final int size;
    private final String brand;
    private final LocalDate expires;

    public RabbitFood(int size, String brand, LocalDate expires) {
        this.size = size;
        if(brand==null) 
        	this.brand = "Unknown";
        else
        	this.brand = brand;
        if(expires.isAfter(LocalDate.now())) 
        	throw new RuntimeException();
        this.expires = expires;
    }

    public int size() {
        return size;
    }

    public String brand() {
        return brand;
    }

    public LocalDate expires() {
        return expires;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RabbitFood that = (RabbitFood) o;
        return size == that.size &&
               Objects.equals(brand, that.brand) &&
               Objects.equals(expires, that.expires);
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