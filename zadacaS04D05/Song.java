package ba.bitcamp.edvin.zadacaS04D05;

public class Song {

	Artist artist;
	String nameOfSong;
	Integer year;
	String genre;

	public Song(Artist artist, String nameOfSong, Integer year, String genre) {
		super();
		this.artist = artist;
		this.nameOfSong = nameOfSong;
		this.year = year;
		this.genre = genre;
	}

	public String toString() {
		String s = "";
		s += "Artist: " + artist.name + "\n";
		s += "Name of Song: " + nameOfSong + "\n";
		s += "Year: " + year + "\n";
		s += "Genre: " + genre + "\n";

		return s;
	}
	

}
