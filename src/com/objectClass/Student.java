package com.objectClass;

import java.util.Objects;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    public String toString() {
        return "student id " + id + "\n" + "student name " + name;
    }

    @Override
    public int hashCode() {
        return 999999999;
    }

    static void main(String[] args) {
        Student student = new Student(1, "a");
        Student copy = new Student(2, "b");
        System.out.println(student.equals(copy));
    }
}