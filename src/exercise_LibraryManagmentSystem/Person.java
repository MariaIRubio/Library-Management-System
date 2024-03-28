package exercise_LibraryManagmentSystem;

public class Person {
	private String name;
	private String contact;
	
	public Person(String name, String contact) {
		super();
		this.name = name;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}


	public String getContact() {
		return contact;
	}

	@Override
	public String toString() {
		return "Member info: \nName: " + name + "\n Contact: " + contact;
	}
	
	
	
}
