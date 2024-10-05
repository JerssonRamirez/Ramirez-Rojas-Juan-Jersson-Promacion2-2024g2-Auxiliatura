package com.example.vehicles;

public class Main {
    public static void main(String[] args) {
        // Crear un autor
        Author author = new Author("J.K. Rowling");

        // Agregar libros usando sobrecarga
        author.addBook("Harry Potter and the Philosopher's Stone", 29.99);
        author.addBook("Harry Potter and the Chamber of Secrets", 35.99);

        // Crear un libro y agregarlo a la lista del autor
        Book book = new Book("Harry Potter and the Prisoner of Azkaban", author, 39.99);
        author.addBook(book);

        // Mostrar información del autor y sus libros
        author.displayAuthorInfo();
    }
}

