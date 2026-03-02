package com.basic.constructor;

class Employee {
    int empno;
    String ename;

    // no argument constructor
    public Employee() {
        empno = 7902;
        ename = "smith";
    }

    // parameterized constructor
    public Employee(int empno, String ename) {
        super();
        this.empno = empno;
        this.ename = ename;
    }

    // copy constructor
    public Employee(Employee employee) {
        this.empno = employee.empno;
        this.ename = employee.ename;
    }


    @Override
    public String toString() {
        return "[empno=" + empno + ", ename=" + ename + "]";
    }

    public static void main(String[] args) {
        Employee employee = new Employee(7902, "smith");
        System.out.println(employee.empno);
        System.out.println(employee.ename);

        Employee copy = new Employee(employee);
        System.out.println(copy);
    }
}
