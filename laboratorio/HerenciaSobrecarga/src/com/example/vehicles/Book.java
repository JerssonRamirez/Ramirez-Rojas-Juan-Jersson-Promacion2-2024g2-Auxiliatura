package com.example.vehicles;

public class Book {
    private String title;
    private Author author;
    private double price;

    // Constructor
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Método para obtener la información del libro
    public void getInfo() {
        System.out.println("Title: " + title + ", Author: " + author.getName() + ", Price: $" + price);
    }
}
