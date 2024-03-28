## Exercise: Library Management System

#### Objective:
Develop a basic Library Management System. The program should allow users to add books to the library, check out books, return books, and view the list of available books.

Topics Covered:
1.	Variables and Data Types
2.	User Input (Scanner)
3.	Object-Oriented Programming (Inheritance)
4.	Collections (ArrayList)
5.	File I/O Streams (FileInputStream, FileOutputStream)
6.	Exception Handling (try-catch)

#### Instructions:

1.	Define the following classes:
    -	Book class: Represents a book with attributes such as title, author, ISBN, and availability status.
    -	Library class: Manages a collection of books (use ArrayList<Book>) and provides methods for adding books, checking out books, returning books, and displaying the list of available books.
2.	Implement inheritance by creating a LibraryMember class that inherits from a Person class (you'll need to define the Person class with attributes like name and contact information).
3.	Implement methods for the following operations in the Library class:
    -	addBook(Book book): Adds a book to the library's collection.
    -	checkoutBook(Book book, LibraryMember member): Marks a book as checked out by a library member.
    -	returnBook(Book book): Marks a book as returned and available for checkout.
    -	displayAvailableBooks(): Displays a list of available books in the library.
4.	Use the java.util.Scanner class to get input from users. Implement a simple text-based menu that allows users to perform library operations (e.g., add a book, check out a book, return a book, view available books).
5.	Implement file I/O to save and load the library's book collection. Use FileInputStream and FileOutputStream for this purpose. When the program starts, load the book data from a file, and when the program ends, save the updated book data to the file.
6.	Handle exceptions using try-catch blocks, especially when dealing with file I/O operations and potential errors like invalid input.
