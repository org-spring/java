package com.designPatterns.creational;

public class PrototypePattern {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("mithun", 987456321L, 85);
            System.out.println("original object:");
            emp1.display();

            // Cloned object
            Employee emp2 = (Employee) emp1.clone();
            System.out.println("\ncloned object:");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}


class Employee implements Cloneable {
    private String name;
    private long mobile;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, long mobile, double salary) {
        this.name = name;
        this.mobile = mobile;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getMobile() {
        return mobile;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // shallow copy
        // return new Employee(this.name,this.mobile,this.salary);  //deep copy works when object reference
    }

    public void display() {
        System.out.println("name: " + name);
        System.out.println("mobile: " + mobile);
        System.out.println("salary: " + salary);
    }

}
