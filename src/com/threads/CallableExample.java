package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class InterestCalculation implements Callable<Double> {

    double principle, rate;

    InterestCalculation(double principle, double rate) {
        this.principle = principle;
        this.rate = rate;
    }


    @Override
    public Double call() throws Exception {
        return (principle * rate) / 100;
    }
}
public class CallableExample {
    static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Callable<Double> callable = new InterestCalculation(2589, 7.5);
        Future<Double> future = executorService.submit(callable);
        Double result = future.get();
        System.out.println(result);
    }
}
