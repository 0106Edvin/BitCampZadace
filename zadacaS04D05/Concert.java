package ba.bitcamp.edvin.zadacaS04D05;

public class Concert {

	Artist[] artist;
	Song[] song;
	
	
	public Concert(Artist[] artist, Song[] song) {
		super();
		this.artist = artist;
		this.song = song;
	}
		
			public String toString(){
		String s = "";
		for (int i = 0; i < artist.length; i++) {
			s += "\n" + artist[i] + "\n\n";
			
		for (int j = 0; j < song.length; j++) {
				s += "\n" + song[j] + "\n\n";
			}
		}
		
		return s;
	}
	public Concert (){
}
}