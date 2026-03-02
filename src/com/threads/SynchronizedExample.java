package com.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Synchro extends Thread {
    String task;

    private static final Lock lock = new ReentrantLock();

    Synchro(String task) {
        this.task = task;
    }

    public void run() {
        lock.lock();
        try {
            System.out.println(task + " " + Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class SynchronizedExample {
    static void main(String[] args) {
        Thread one = new Synchro("biryani");
        Thread two = new Synchro("mutton curry");
        Thread three = new Synchro("fish fry");

        one.start();
        two.start();
        three.start();
    }
}
