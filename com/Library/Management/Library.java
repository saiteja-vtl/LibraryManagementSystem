package com.Library.Management;
import java.util.Scanner;
import java.util.ArrayList;

public class Library implements LibraryOperations {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(String ISBN) {
            boolean removed = books.removeIf(book -> book.getISBN().equals(ISBN));
            if (removed) {
                System.out.println("Book with ISBN " + ISBN + " removed.");
            } else {
                System.out.println("Book with ISBN " + ISBN + " not found.");
            }
        }

    @Override
    public void updateBook(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new title:");
                book.setTitle(scanner.nextLine());
                System.out.println("Enter new author:");
                book.setAuthor(scanner.nextLine());
                System.out.println("Enter new number of copies:");
                book.setNumberOfCopies(scanner.nextInt());
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found.");
    }

    @Override
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
