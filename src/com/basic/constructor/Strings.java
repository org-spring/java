package com.basic.constructor;

public class Strings {
    static void pool() {
        String one = new String("java");
        String two = new String("java");
        String three = "java";
        String four = "java";

        System.out.println(one == two); 	    // false
        System.out.println(one.equals(two));    // true

        System.out.println(three == four);	    // true
        System.out.println(three.equals(four)); // true
    }

    static void buffer() {
        StringBuffer sb = new StringBuffer("hello");

        sb.append(" world");
        sb.insert(5, ",");
        sb.replace(0, 5, "hi");
        sb.delete(2, 3);

        System.out.println(sb);
    }

    static void builder() {
        StringBuilder sb = new StringBuilder("hello");

        sb.append(" world");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 3);

        System.out.println(sb);
    }
}
