package com.basic.intermediate;

class TypeCasting {
    // primitive typecasting
    public static void widening() {
        double a = 10;
        System.out.println("widening " + a);
    }

    public static void narrowing() {
        int b = (int) 10.56d;
        System.out.println("narrowing " + b);
    }

    static void main(String[] args) {
        // primitive typecasting
        widening();
        narrowing();

        // class typecasting
        SuperClass superclass = new SubClass();
        superclass.parent();

        SubClass subclass = (SubClass) superclass;
        subclass.parent();
        subclass.child();
    }
}

// class type casting
class SuperClass {
    public void parent() {
        System.out.println("super class");
    }
}
class SubClass extends SuperClass {
    public void child() {
        System.out.println("sub class");
    }
}