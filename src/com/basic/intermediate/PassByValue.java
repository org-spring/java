package com.basic.intermediate;

class PassByValue {
    public static void change(int x) {
        x = 100;   // changes only the copy
    }

    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
    }
}