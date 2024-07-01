package com.Library.Management;

import java.util.Scanner;

public class LibraryManagementSystem{
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);


            System.out.println("Library Management System:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter book title:");
                    String title = scanner.nextLine();
                    System.out.println("Enter book author:");
                    String author = scanner.nextLine();
                    System.out.println("Enter book ISBN:");
                    String ISBN = scanner.nextLine();
                    System.out.println("Enter number of copies:");
                    int numberOfCopies = scanner.nextInt();
                    scanner.nextLine(); 

                    Book newBook = new Book(title, author, ISBN, numberOfCopies);
                    library.addBook(newBook);
                    System.out.println("Book added successfully!");
                    break;

                case 2:

                    System.out.println("Enter ISBN of the book to remove:");
                    String isbnToRemove = scanner.nextLine();
                    library.removeBook(isbnToRemove);
                    System.out.println("Book removed successfully (if it existed).");
                    break;

                case 3:

                    System.out.println("Enter ISBN of the book to update:");
                    String isbnToUpdate = scanner.nextLine();
                    library.updateBook(isbnToUpdate);
                    System.out.println("Book updated successfully (if it existed).");
                    break;

                case 4:

                    library.displayBooks();
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

    }
}
