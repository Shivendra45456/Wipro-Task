package com.ecommerce;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class Order {
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public void placeOrder(Payment payment, Discountable discountable) {
        customer.displayCustomer();
        products.forEach(Product::displayDetails);

        double discounted = discountable.applyDiscount(totalAmount);
        System.out.println("Total after discount: ₹" + discounted);

        payment.amount = discounted;
        payment.processPayment();
    }
    
    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
        // Optionally reverse payment, update stock, etc.
    }
    
    
    
    //Store and Retrieve Orders Using File Handling
   

    public void saveOrderToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write("Customer: " + customer.name + " | Email: " + customer.email + "\n");
            for (Product p : products) {
                writer.write(" - " + p.name + ": ₹" + p.price + "\n");
            }
            writer.write("Total: ₹" + totalAmount + "\n\n");
        } catch (IOException e) {
            System.out.println("Error saving order: " + e.getMessage());
        }
    }

    

}

