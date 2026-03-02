package com.designPatterns.structural;

public class FacadePattern {
    public static void main(String[] args) {
        // Using the Facade
        PaymentFacade facade = new PaymentFacade();
        facade.completeOrder("12345", 100.0, "laptop", 1);
    }
}

class PaymentFacade {
    private PaymentServices paymentService;
    private NotificationService notificationService;
    private InventoryService inventoryService;

    public PaymentFacade() {
        this.paymentService = new PaymentServices();
        this.notificationService = new NotificationService();
        this.inventoryService = new InventoryService();
    }

    public void completeOrder(String account, double amount, String item, int quantity) {
        paymentService.makePayment(account, amount);
        inventoryService.updateStock(item, quantity);
        notificationService.sendNotification("order for " + item + " has been placed successfully.");
    }
}

class PaymentServices {
    public void makePayment(String account, double amount) {
        System.out.println("payment of $" + amount + " made from account: " + account);
    }
}

// Subsystem 2: Notification Service
class NotificationService {
    public void sendNotification(String message) {
        System.out.println("notification sent: " + message);
    }
}

// Subsystem 3: Inventory Service
class InventoryService {
    public void updateStock(String item, int quantity) {
        System.out.println("stock updated: " + quantity + " units of " + item);
    }
}
