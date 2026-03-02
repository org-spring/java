package com.advance;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        // takes input and returns nothing.
        Consumer<String> consumer = (value) -> System.out.println(value);
        consumer.accept("hello world");

        // takes input and returns boolean (true/false).
        Predicate<Integer> predicate = n -> n % 2 == 0;
        System.out.println(predicate.test(5));

        // takes input and returns a result.
        Function<Integer, String> function = n -> "number " + n;
        System.out.println(function.apply(5));

        // takes no input and returns a value.
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());

    }
}