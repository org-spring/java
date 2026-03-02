package com.exception;

public class RuntimeExceptionExample {
    static void arrayIndexOutOfBoundException() {
        try {
            int[] arr = { 10, 20, 30 };
            System.out.println(arr[5]); // accessing invalid index (5) -> causes exception
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception caught: " + e.getMessage());
        }

        finally {
            System.out.println("finally block always executes");
        }
    }

    static void arithmeticException() {
        try {
            int a = 10, b = 0;
            int result = a / b; // Causes ArithmeticException
            System.out.println("result: " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("exception caught: " + e.getMessage());
        }

        finally {
            System.out.println("finally block always executes");
        }
    }

    static void nullPointerException() {
        try {
            String name = null; // String reference is null
            System.out.println(name.length()); // Causes NullPointerException
        }

        catch (NullPointerException e) {
            System.out.println("exception caught: " + e.getMessage());
        }

        finally {
            System.out.println("finally block always executes");
        }
    }

    static void main(String[] args) {
        nullPointerException();
    }
}
