package ba.bitcamp.edvin.weekend2;

public class Task6a {

	private String title;
	private Integer year;
	private String genre;
	private String nameOfDirector;
	private Double IMDBRating;
	private Boolean OscarAwarded = true;


	

	public Task6a(String title, Integer year, String genre,
			String nameOfDirector, Double iMDBRating, Boolean oscarAwarded) {
		super();
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.nameOfDirector = nameOfDirector;
		this.IMDBRating = iMDBRating;
		this.OscarAwarded = oscarAwarded;
	}




	public String toString() {
		String Task6 = "";
		Task6 = Task6 + "Title: " + title + "\n";
		Task6 = Task6 + "Year: " + year + "\n";
		Task6 = Task6 + "Genre: " + genre + "\n";
		Task6 = Task6 + "Name of Director: " +nameOfDirector+ "\n";
		Task6 = Task6 + "IMDB Rating: " +IMDBRating+ "\n";
		Task6 = Task6 + "Oscar Awarded: " +OscarAwarded+ "\n";

		return Task6;
	}
}
