package com.oops;

interface Animal {
    void noise();
}

class Dog implements Animal {
    public void noise() {
        System.out.println("bow bow");
    }
}

class Cat implements Animal {
    public void noise() {
        System.out.println("meow meow");
    }
}

class Stimulator {
    public static void ansim(Animal animal) {
        animal.noise();
    }
}

public class Abstraction {
    static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Stimulator.ansim(dog);
        Stimulator.ansim(cat);
    }
}