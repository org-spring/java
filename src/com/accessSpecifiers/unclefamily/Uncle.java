package com.accessSpecifiers.unclefamily;

import com.accessSpecifiers.myfamily.Father;

public class Uncle extends Father {
    static void main(String[] args) {
        Father father = new Father();
        Uncle uncle = new Uncle();
        uncle.cycle();
        uncle.bike();
        // uncle.car();
        // uncle.atm();
    }
}
