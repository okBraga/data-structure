package main.java.com.okbraga.datastructures.models;

public class Car {
    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car: " + this.name;
    }
}
