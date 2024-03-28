package exercise_LibraryManagmentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public void displayMenu() throws LibraryException {
		Scanner scanner = new Scanner(System.in);
		Library library = new Library();
		//ArrayList<Book> collection = new ArrayList<>();
		Book book = new Book(null, null, null);
		
		library.loadData();
		int choice = 0;
		do {
			System.out.println("\nWelcome to the Library Menu:");
			System.out.println("\nWhat do you want to do? ");
			System.out.println("Option 1: Add a book.");
			System.out.println("Option 2: Display books available.");
			System.out.println("Option 3: Check out a book.");
			System.out.println("Option 4: Return a book.");
			System.out.println("Option 5: Exit the program.");
			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:
				System.out.println("\n1. Add a book.");
				System.out.println("Enter the title: ");
				String title = scanner.nextLine();
				System.out.println("Enter the Author: ");
				String author = scanner.nextLine();
				System.out.println("Enter ISBN: ");
				String isbn = scanner.nextLine();
				Book newBook = new Book(title, author, isbn);
				library.addBook(newBook);
				break;

			case 2:
				System.out.println("\n2. Display books available.");
				library.displayAvailableBooks();
				break;

			case 3:
				System.out.println("\n3. Check out a book.");
				System.out.print("Enter your name: ");
				String memberName = scanner.nextLine();
				System.out.print("Enter the title or the ISBN of the book: ");
				String input = scanner.nextLine();
				Book checkoutBook = findBook(input, library);
				if (checkoutBook != null) {
					library.checkoutBook(checkoutBook, memberName);
				}else {System.out.println("Book not found.");}
				break;

			case 4:
				System.out.println("\n4. Return a book.");
				System.out.println("Enter your name: ");
				String memberName2 = scanner.nextLine();
				System.out.println("Enter book title or ISBN to return: ");
				String inputReturn = scanner.nextLine();
				Book returnBook = findBook(inputReturn, library);
				if(returnBook != null) {
				library.returnBook(returnBook, memberName2);
				}else {System.out.println("Book not found.");}
				break;

			case 5:
				System.out.println("\n5. Exiting the program");
				System.out.println("Thank you for using our system.");
				library.saveData();
				break;

			default:
				System.out.println("Invalid choice. Choose a right one.");
				break;

			}
		} while (choice != 5);
		scanner.close();

	}

	public static Book findBook(String input, Library library) {
		for (Book book : library.getCollection()) {
			if (book.getIsbn().equals(input) || book.getTitle().equals(input)){
				return book;
			}
		}
		return null;
	}

}
