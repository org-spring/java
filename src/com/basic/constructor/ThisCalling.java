package com.basic.constructor;

class Student {
    // this calling statement
    Student(int id) {
        System.out.println(id);
    }

    Student(String sname) {
        this(17);
        System.out.println(sname);
    }

    Student(int id, String sname) {
        this("java");
        System.out.println(id + " " + sname);
    }

    Student(String str, int num) {
        this(17, "java");
        System.out.println(str + " " + num);
    }
}

public class ThisCalling {
    static void main(String[] args) {
        new Student("smith", 101);
    }
}
