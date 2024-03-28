package exercise_LibraryManagmentSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	ArrayList<Book> collection;
	static String fileName = "//home//dci-student//eclipse-workspace//exercise_LibraryManagmentSystem//src//exercise_LibraryManagmentSystem//library_data.txt";
	// Book book;
	// Scanner scanner = new Scanner(System.in);
	// LibraryMember member = new LibraryMember(null, null);

	public Library() {
		this.collection = new ArrayList<>();
		// this.book = book;
	}

	public ArrayList<Book> getCollection() {
		return collection;
	}

	// ADD A BOOK
	public void addBook(Book book) throws LibraryException {

		if (collection.contains(book)) {
			throw new LibraryException("\nBook already exixts in the collection.");
		}
		collection.add(book);
		System.out.println("\n'" + book.getTitle() + "' added to the collection.");

	}

	// LOOK FOR A BOOK
	public void lookBook(String input) throws LibraryException {

		boolean bookFound = false;
		for (Book book : collection) {
			if (book.getAuthor().equals(input) || book.getTitle().equals(input) || book.getIsbn().equals(input)) {
				System.out.println(book);
				bookFound = true;
			}
			if (!bookFound) {
				throw new LibraryException("\nBook not found in the collection");
			}
		}
	}

	// CHECK OUT A BOOK
	public void checkoutBook(Book book, String memberName) {

		if (book.isAvailable()) {
			System.out.println(
					"\nMember " + memberName + " has succesfully check out the book " + book.getTitle() + "\nYou have 30 days to return it.");
			book.setAvailable(false);
		} else {
			System.out.println("\nBook not available to check out.");
		}

	}

	// RETURN A BOOK
	public void returnBook(Book book, String memberName) {

		if (!book.isAvailable()) {
			book.setAvailable(true);
			System.out.println("\nMember " + memberName + " has return succesfully the book " + book.getTitle());
		}else {System.out.println("\nThe book is already in the system.");}
	}

	// DISPLAY ALL BOOKS
	public void displayAvailableBooks() {
		System.out.println("\nList of available books: ");
		if (collection.isEmpty()) {
			System.out.println("Collection is empty. Add a book.");
		} else if (!collection.isEmpty()) {
			for (Book book : collection) {
				if (book.isAvailable()) {
					System.out.println(book);
				}
			}
		}
	}

	public void loadData() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
			collection = (ArrayList<Book>) ois.readObject();
			if(!collection.isEmpty()) {
			System.out.println("\nData read from the file successfully.");
			}else {System.out.println("\nThere is no data to be loaded.");}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("\nAn error has occur. The data couldn't be loaded.");
		}
	}

	public void saveData() {

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
			oos.writeObject(collection);
			System.out.println("\nBooks saved in the file successfully.");
		} catch (IOException e) {
			System.out.println("\nAn error has occur. The data couldn't be saved.");
		}
	}

}
