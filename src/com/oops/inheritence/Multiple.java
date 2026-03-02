package com.oops.inheritence;

interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() { System.out.println("from interface A"); }

    public void showB() { System.out.println("from interface B"); }
}

public class Multiple {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}