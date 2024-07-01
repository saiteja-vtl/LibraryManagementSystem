package com.Library.Management;

public interface LibraryOperations {
    void addBook(Book book);
    void removeBook(String ISBN);
    void updateBook(String ISBN);
    void displayBooks();
}
