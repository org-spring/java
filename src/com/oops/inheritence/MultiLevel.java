package com.oops.inheritence;

class University {
    void universityInfo() { System.out.println("this is a university"); }
}

class Department extends University {
    void departmentInfo() { System.out.println("this is a computer science department"); }
}

class Student extends Department {
    void studentInfo() { System.out.println("student belongs to the department"); }
}

public class MultiLevel {
    static void main(String[] args) {
        Student s = new Student();

        s.universityInfo();  // from University
        s.departmentInfo();  // from Department
        s.studentInfo();     // from Student
    }
}