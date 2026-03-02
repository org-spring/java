package com.basic.constructor;

class A {
    A(int x) {
        System.out.println("A constructor: " + x);
    }
}

class B extends A {
    B(String y) {
        super(10);
        System.out.println("B constructor" + y);
    }
}

class C extends B {
    C(String str, int num) {
        super("B");
        System.out.println("C constructor");
    }
}

public class SuperCalling {
    public static void main(String[] args) {
        new C("C", 1999);
    }
}
