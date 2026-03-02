package com.advance;

public class DefaultStaticMethods {

    interface Payment {

        void pay(double amount);

        default double calculateGST(double amount) { return amount * 0.18; }

        static boolean validateAmount(double amount) { return amount > 0; }
    }

    static class PaymentUtil implements Payment {

        @Override
        public void pay(double amount) {
            double gst = calculateGST(amount);
            System.out.println(amount + gst);
        }

        public void upi(double amount) {
            if (!Payment.validateAmount(amount)) {
                System.out.println("invalid amount");
                return;
            }

            System.out.println("payment successful");
        }
    }

    static void main(String[] args) {

        // default method
        Payment payment = new PaymentUtil();
        payment.pay(1000);

        // static method
        PaymentUtil paymentUtil = new PaymentUtil();
        paymentUtil.upi(-100);
    }
}
