package com.basic.intermediate;

interface Audi {
    void engine();
}

interface AudiR8 extends Audi {
    void chasis();
}

class AudiA4 implements AudiR8 {
    public void engine() { System.out.println("audi engine"); }

    public void chasis() { System.out.println("audi r8 chasis"); }
}

public class Interface {
    public static void main(String[] args) {
        AudiA4 A4 = new AudiA4();
        A4.engine();
        A4.chasis();
    }
}
