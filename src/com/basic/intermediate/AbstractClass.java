package com.basic.intermediate;

abstract class Brand {
    abstract void puma();
    abstract void nike();
}

abstract class Myntra extends Brand {
    public void puma() { System.out.println("puma shoe"); }
    // abstract void nike();
}

class Flipkart extends Myntra {
    public void nike() { System.out.println("nike shoe"); }
}

public class AbstractClass {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();
        flipkart.puma();
        flipkart.nike();
    }
}