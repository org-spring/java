package com.oops.inheritence;

class Parent {
    void showParent() { System.out.println("this is the parent class"); }
}

class Child extends Parent {
    void showChild() { System.out.println("this is the child class"); }
}

public class SingleLevel {
    static void main(String[] args) {
        Child c = new Child();
        c.showParent();
        c.showChild();
    }
}
