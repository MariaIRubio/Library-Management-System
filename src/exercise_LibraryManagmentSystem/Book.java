package exercise_LibraryManagmentSystem;

import java.io.Serializable;

public class Book implements Serializable{

	private String title;
	private String author;
	private String isbn;
	private boolean available;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.available = true;

	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public boolean isAvailable() {
		return available;
	}

	@Override
	public String toString() {
		return "\nTitle: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\nAvalibility Status: " + available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
