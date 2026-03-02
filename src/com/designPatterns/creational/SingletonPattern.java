package com.designPatterns.creational;

class SingletonPattern {
    private static volatile SingletonPattern instance = null;

    private SingletonPattern() {
        System.out.println("instance created");
    }

    public static SingletonPattern getInstance() {
        if (instance == null) {
            synchronized (SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonPattern one = SingletonPattern.getInstance();
        SingletonPattern two = SingletonPattern.getInstance();

        System.out.println(one == two);
    }
}
