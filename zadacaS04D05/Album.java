package ba.bitcamp.edvin.zadacaS04D05;

public class Album {

	String name;
	Artist artist;
	Song[] songs;
	String genre;

	public Album() {
		
	}
	
	public Album(String name, Artist artist, Song[] songs, String genre) {
		super();
		this.name = name;
		this.artist = artist;
		this.songs = songs;
		this.genre = genre;
	}

	public String toString() {
		String s = "";

		s += "Name of Album: " + name + "\n";
		s += "Artist: " + artist.name + "\n";
		s += "Genre: " + genre + "\n";

		for (int i = 0; i < songs.length; i++) {
			s += "\n" + songs[i] + "\n\n";
		}
		return s;

	}

}
