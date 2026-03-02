package com.advance;

import java.util.concurrent.CompletableFuture;

class CompletableFutureExample {
    static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static String getProductName() {
        sleep(2);
        return "xiaomi";
    }

    static int getProductPrice() {
        sleep(3);
        return 9999;
    }

    static String getProductColor() {
        sleep(4);
        return "black";
    }

    static void main(String[] args) {
        CompletableFuture<String> productName = CompletableFuture.supplyAsync(() -> getProductName());
        CompletableFuture<String> productColor = CompletableFuture.supplyAsync(() -> getProductColor());
        CompletableFuture<Integer> productPrice = CompletableFuture.supplyAsync(() -> getProductPrice());

        CompletableFuture<Void> allFuture = CompletableFuture.allOf(productName, productColor, productPrice);
        allFuture.thenRun(() -> {
            try {
                String result = productPrice.get() + "\n" + productColor.get() + "\n" + productName.get();
                System.out.println(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).join();
    }
}