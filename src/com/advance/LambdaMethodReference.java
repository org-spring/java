package com.advance;

import java.util.Arrays;
import java.util.List;

interface Triangle {
    double area(double x, double y);
}

class Circle {
    double area(int radius) {
        final double PI = 3.142;
        return PI * radius * radius;
    }
}

class Square {
    static void area(int a) {
        System.out.println(a * a);
    }
}

class Printer {
    void print(String message) {
        System.out.println(message);
    }
}
public class LambdaMethodReference {
    static void triangle() {
        List<double[]> list = Arrays.asList(new double[]{1, 2}, new double[]{3, 4}, new double[]{5, 6}, new double[]{7, 8});

        Triangle t = (x, y) -> {
            return 0.5 * x * y;
        };

        list.forEach(x -> System.out.println(t.area(x[0], x[1])));
    }

    static void circle() {
        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25);

        Circle c = new Circle();

        list.forEach(x -> System.out.println(c.area(x)));
    }

    static void methodReference() {
        List<Integer> list = Arrays.asList(5, 10, 15, 20);
        Square s = new Square();
        list.forEach(Square::area);

        List<String> data = Arrays.asList("java", "c", "c++");
        Printer p = new Printer();
        data.forEach(p::print);
    }

    static void main(String[] args) {
        methodReference();
    }
}
