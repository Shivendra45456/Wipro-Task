package com.ecommerce;

public class CashOnDelivery extends Payment {
    private String deliveryAddress;

    public CashOnDelivery(double amount, String deliveryAddress) {
        super(amount);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("Amount ₹" + amount + " will be collected at delivery: " + deliveryAddress);
    }
}
