package com.basic;

import org.w3c.dom.ls.LSOutput;

public class Operators {
    public static void postIncrement(int i) {
        int result = i++ + i + i++ + i++ + i + i++ + i++ + i++;
        System.out.println(result);
    }

    public static void preIncrement(int i) {
        int result = ++i + ++i + ++i + ++i + i + ++i + i + ++i;
        System.out.println(result);
    }

    public static void leftShift() {
        int i = 5;
        // 5 * 2 to the power of 1
        int result = i << 1;
        System.out.println(result);
    }

    public static void rightShift() {
        int i = 8;
        // 8 / 2 to the power of 1
        int result = i >> 1;
        System.out.println(result);
    }

    public static void unassignedRightShift() {
        int i = 8;
        // Binary of 8 is 8 = 00000000 00000000 00000000 00001000
        // Shift right by >>> 1
        // 00000000 00000000 00000000 00000100
        System.out.println(i >>> 1);

        int j = -8;
        // Binary of -8 = 11111111 11111111 11111111 11111000
        // Shift right by >>> 1
        // 01111111 11111111 11111111 11111100
        System.out.println(j >>> 1);
    }

    public static void bitwise(int i, int j) {
        // 1024 512 256 128 64 32 16 8 4 2 1
        System.out.println(i & j); // 1
        System.out.println(i | j); // 7
        System.out.println(i ^ j); // 6
    }

    public static void ternary(int i) {
        String result = (i % 2 == 0) ? "even" : "odd";
        System.out.println(result);
    }


    static void main(String[] args) {
        System.out.println();
        Animal animal = new Dog();
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof Animal);
    }
}

interface Animal {
    void noise();
}

class Dog implements Animal {
    public void noise() {
        System.out.println("bow bow");
    }
}