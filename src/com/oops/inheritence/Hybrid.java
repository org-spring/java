package com.oops.inheritence;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Machine {
    void powerOn() { System.out.println("machine is powered on"); }
}

class Printer extends Machine implements Printable, Scannable {
    public void print() { System.out.println("printing document"); }

    public void scan() { System.out.println("scanning document"); }
}

public class Hybrid {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.powerOn();
        printer.print();
        printer.scan();
    }
}
