package com.designPatterns.structural;

public class DecoratorPattern {
    public static void main(String[] args) {
        // Basic coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " → cost: ₹" + coffee.getCost());

        // Adding Milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " → cost: ₹" + coffee.getCost());

        // Adding Sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " → cost: ₹" + coffee.getCost());
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", milk";
    }

    public double getCost() {
        return super.getCost() + 10; // Extra cost for Milk
    }
}

// Concrete Decorator: Sugar
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", sugar";
    }

    public double getCost() {
        return super.getCost() + 5; // Extra cost for Sugar
    }
}

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() {
        return coffee.getDescription();
    }

    public double getCost() {
        return coffee.getCost();
    }
}

class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "simple coffee";
    }

    public double getCost() {
        return 50; // Base price
    }
}

interface Coffee {
    String getDescription();
    double getCost();
}
