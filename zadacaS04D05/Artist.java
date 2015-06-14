package ba.bitcamp.edvin.zadacaS04D05;

public class Artist {
	String name;
	Boolean isGroup ;
	Integer yearOfBirth;
	String genre;

	public String toString() {
		String s = "";
		s += "Name: " + name + "\n";
		s += "Group ? " + isGroup + "\n";
		s += "Year of Birth: " + yearOfBirth + "\n";
		s += "Genre: " + genre + "\n";
		return s;
	}

	public Artist(String name, Boolean isGroup, Integer yearOfBirth,
			String genre) {
		super();
		this.name = name;
		this.isGroup = isGroup;
		this.yearOfBirth = yearOfBirth;
		this.genre = genre;
	}

}
