package com.oops;

public class EncapsulationExample {
    private String password = "@abc";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    static void main(String[] args) {
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        System.out.println(encapsulationExample.getPassword());

        encapsulationExample.setPassword("@def");
        System.out.println(encapsulationExample.getPassword());
    }
}
