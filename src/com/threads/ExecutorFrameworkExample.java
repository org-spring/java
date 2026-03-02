package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaxIdGeneration implements Runnable {
    String taxId;

    TaxIdGeneration(String taxId) {
        this.taxId = taxId;
    }

    @Override
    public void run() {
        try {
            System.out.println(taxId + " " + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ExecutorFrameworkExample {
    static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5 ; i++) {
            executorService.submit(new TaxIdGeneration("TXN " + i));
        }
        executorService.shutdown();
    }
}
