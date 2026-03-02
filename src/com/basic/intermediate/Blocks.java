package com.basic.intermediate;

public class Blocks {
    static { System.out.println("this is static initialization block"); }

    { System.out.println("this is instance initialization block"); }

    public static void main(String[] args) {
        System.out.println("this is main method");
        new Blocks();
    }
}
