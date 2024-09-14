package com.curso.v0;

sealed interface Vehicle permits Car, Truck, Motorcycle {
    void drive();
}

final class Car implements Vehicle {
	@Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

final class Truck implements Vehicle {
	@Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}

non-sealed class Motorcycle implements Vehicle {
	@Override
    public void drive() {
        System.out.println("Motorcycle is driving");
    }
}

// This is allowed because Motorcycle is non-sealed
class SportBike extends Motorcycle {
    @Override
    public void drive() {
        System.out.println("SportBike is driving fast");
    }
}

public class Question14 {
	
	Vehicle v = new SportBike();
	

}
