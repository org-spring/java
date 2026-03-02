package com.oops.inheritence;

class Vehicle {
    void start() {
        System.out.println("vehicle starts");
    }
}

class Car extends Vehicle {
    void carFeature() {
        System.out.println("car has 4 wheels");
    }
}

class Bike extends Vehicle {
    void bikeFeature() {
        System.out.println("bike has 2 wheels");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.start();
        c.carFeature();
        b.start();
        b.bikeFeature();
    }
}