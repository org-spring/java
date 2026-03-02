package com.threads;

class Asynchro extends Thread {
    String task;

    public Asynchro(String task) {
        this.task = task;
    }

    public void run() {
        try {
            System.out.println(task + " " + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class AsynchronizedExample {
    static void main(String[] args) {
        Thread one = new Asynchro("biryani");
        Thread two = new Asynchro("pepper chicken");
        Thread three = new Asynchro("mutton curry");
        Thread four = new Asynchro("fish fry");

        one.start();
        two.start();
        three.start();
        four.start();
    }
}
