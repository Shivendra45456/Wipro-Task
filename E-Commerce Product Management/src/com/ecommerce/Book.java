package com.ecommerce;

public class Book extends Product {
    private String author;
    private int pages;

    public Book(String id, String name, double price, String author, int pages) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + " | Author: " + author +
                " | Pages: " + pages + " | Price: ₹" + price);
    }
}

