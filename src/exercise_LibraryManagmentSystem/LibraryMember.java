package exercise_LibraryManagmentSystem;

public class LibraryMember{

	private String name;
	private String idMember;
	private boolean isMember;

	public LibraryMember(String name, String idMember) {
		this.name = name;
		this.idMember = idMember;
		this.isMember = true;
	}

	public String getName() {
		return name;
	}

	public String getIdMember() {
		return idMember;
	}

	public boolean isMember() {
		return isMember;
	}

	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}

}
