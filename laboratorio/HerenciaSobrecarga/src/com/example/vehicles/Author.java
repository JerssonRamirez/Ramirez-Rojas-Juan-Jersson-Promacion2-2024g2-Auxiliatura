package com.example.vehicles;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    // Constructor
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Método para agregar un libro a la lista de libros del autor
    public void addBook(Book book) {
        books.add(book);
    }

    // Sobrecarga del método addBook que acepta título y precio
    public void addBook(String title, double price) {
        Book newBook = new Book(title, this, price); // Creamos un nuevo libro usando el título y el precio
        books.add(newBook);
    }

    // Método para obtener los libros del autor
    public List<Book> getBooks() {
        return books;
    }

    // Método para obtener el nombre del autor
    public String getName() {
        return name;
    }

    // Método para mostrar información del autor y sus libros
    public void displayAuthorInfo() {
        System.out.println("Author: " + name);
        for (Book book : books) {
            book.getInfo(); // Llamamos al método getInfo de cada libro
        }
    }
}
