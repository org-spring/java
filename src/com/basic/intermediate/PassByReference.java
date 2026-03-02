package com.basic.intermediate;

class Amazon {
    public void products() {
        System.out.println("shoes, gadgets");
    }
}

class Ekart {
    public static void delivery(Amazon amazon) {
        amazon.products();
    }
}

public class PassByReference {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        Ekart.delivery(amazon);
    }
}