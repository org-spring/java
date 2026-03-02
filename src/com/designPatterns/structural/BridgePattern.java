package com.designPatterns.structural;

public class BridgePattern {
    public static void main(String[] args) {
        // UPI Payment via HDFC Bank
        Payment upiPaymentHDFC = new UPIPayment(new HDFCBank());
        upiPaymentHDFC.makePayment("1234567890", 5000);

        // Credit Card Payment via ICICI Bank
        Payment creditCardPaymentICICI = new CreditCardPayment(new ICICIBank());
        creditCardPaymentICICI.makePayment("9876543210", 10000);
    }
}

interface Bank {
    void processPayment(String account, double amount);
}

// Concrete Bank Implementations
class HDFCBank implements Bank {
    @Override
    public void processPayment(String account, double amount) {
        System.out.println("processing payment of ₹" + amount + " through hdfc bank for account: " + account);
    }
}

class ICICIBank implements Bank {
    @Override
    public void processPayment(String account, double amount) {
        System.out.println("processing payment of ₹" + amount + " through ICICI bank for account: " + account);
    }
}

abstract class Payment {
    protected Bank bank;  // Bridge to Bank Implementation

    public Payment(Bank bank) {
        this.bank = bank;
    }

    abstract void makePayment(String account, double amount);
}

class UPIPayment extends Payment {
    public UPIPayment(Bank bank) {
        super(bank);
    }

    @Override
    void makePayment(String account, double amount) {
        System.out.println("initiating UPI payment...");
        bank.processPayment(account, amount);
    }
}

class CreditCardPayment extends Payment {
    public CreditCardPayment(Bank bank) {
        super(bank);
    }

    @Override
    void makePayment(String account, double amount) {
        System.out.println("initiating credit card payment...");
        bank.processPayment(account, amount);
    }
}
