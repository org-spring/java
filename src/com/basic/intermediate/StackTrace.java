package com.basic.intermediate;

public class StackTrace {
    public static void four() {
        int a = 10 / 0;
    }

    public static void three() {
        four();
    }

    public static void two() {
        three();
    }

    public static void one() {
        two();
    }

    public static void main(String[] args) {
        try {
            one();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}
