package com.oops.polymorphism;

class Animal {
    public void noise() { System.out.println("animal make noise"); }
}

class Dog extends Animal {
    public void noise() { System.out.println("bow bow"); }
}

class Cat extends Animal {
    public void noise() { System.out.println("meow meow"); }
}

class Snake extends Animal {
    public void noise() { System.out.println("hiss hiss"); }
}

class Stimulator {
    public static void ansim(Animal animal) { animal.noise(); }
}

public class Runtime {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Snake snake = new Snake();

        Stimulator.ansim(dog);
        Stimulator.ansim(cat);
        Stimulator.ansim(snake);
    }
}
