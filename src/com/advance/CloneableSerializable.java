package com.advance;

import java.io.*;

class Employee implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    int empno;
    String ename;

    public Employee(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public String toString() { return empno + " " + ename; }

    // cloneable
    protected Object clone() throws CloneNotSupportedException { return super.clone(); }
}

public class CloneableSerializable {

    static void cloneable() throws CloneNotSupportedException {
        Employee e = new Employee(7902, "smith");
        Employee copy = (Employee) e.clone();
        System.out.println(copy);
    }

    static void serializable() throws IOException, ClassNotFoundException {
        Employee e = new Employee(7839, "wards");

        // serialize
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        objectOutputStream.writeObject(e);
        objectOutputStream.close();

        // de-serialize
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee employee = (Employee) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(employee.empno + " " + employee.ename);
    }

    static void main(String[] args) throws Exception {
        serializable();
    }
}
