package ba.bitcamp.edvin.zadacaS04D05;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		/**
		 * Creating artist
		 */
		Artist a1 = new Artist("Kings Of Leon", true, 2000, "Alternative Rock");
		Artist a2 = new Artist("James Arthur", false, 1988, "Pop, R&B, Soul");
		Artist a3 = new Artist("Elemental", true, 2000, "Hip-Hop");

		/*
		 * array of artists
		 */
		Artist[] a = new Artist[3];
		a[0] = a1;
		a[1] = a2;
		a[2] = a3;

		/**
		 * Printing artist
		 */
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println();

		/**
		 * Creating songs
		 */

		Song s1 = new Song(a1, "Use Somebody", 2008, "Rock");
		Song s2 = new Song(a2, "Impossible", 2013, "Pop");
		Song s3 = new Song(a3, "Goli i Bosi", 2015, "Hip-Hop");
		Song s4 = new Song(a3, "Bolji si", 2014, "Hip-hop");
		Song s5 = new Song(a1, "Sex on fire", 2008, "Pop");
		Song s6 = new Song(a1, "Wait for me", 2013, "Rock");
		Song s7 = new Song(a2, "Recovery", 2013, "Pop");

		/**
		 * array of songs
		 */
		Song[] s = new Song[7];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		s[4] = s5;
		s[5] = s6;
		s[6] = s7;

		/**
		 * Printing songs
		 */
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println();

		/**
		 * Printing if song 1 and 2 have the same artist
		 */
		System.out.println("Same artist of song 1 and song 2: "
				+ sameArtist(s1, s2));
		/**
		 * Printing result of question is song from solo artist
		 */
		System.out.println("Song 1 is from solo artist: "
				+ isFromSoloArtist(s1));
		/**
		 * Printing the older song
		 */
		System.out.println("The older song is from: " + getOlderSong(s1, s2));
		System.out.println();

		/**
		 * Creating album number 3
		 */
		Album al3 = new Album();
		al3.name = "Uredu je";
		al3.artist = a3;
		al3.genre = "Hip-hop";
		al3.songs = new Song[2];
		al3.songs[0] = s3;
		al3.songs[1] = s4;

		/**
		 * Creating album number 2
		 */
		Album al2 = new Album();
		al2.name = "James Arthur";
		al2.artist = a2;
		al2.genre = "Pop";
		al2.songs = new Song[2];
		al2.songs[0] = s2;
		al2.songs[1] = s7;

		/**
		 * Creating album number 1
		 */
		Album al1 = new Album();
		al1.name = "Only by the night";
		al1.artist = a1;
		al1.genre = "Rock";
		al1.songs = new Song[3];
		al1.songs[0] = s1;
		al1.songs[1] = s5;
		al1.songs[2] = s6;

		/**
		 * Printing albums
		 */

		System.out.println("Album number 1: \n " + al1); // Prints album number
															// 1
		System.out.println("Album number 2: \n " + al2); // Prints album number
															// 2
		System.out.println("Album number 3: \n " + al3); // Prints album number
															// 3
		System.out.println();

		/**
		 * array of albums
		 */
		Album[] albumi = new Album[3];
		albumi[0] = al1;
		albumi[1] = al2;
		albumi[2] = al3;

		/**
		 * Task 7
		 */
		System.out.println(countGenreNumber(al1, "Pop"));

		/**
		 * Printing the album where is found song the user entered
		 */
		System.out.println("Your song if found in this album: " + "\n");
		printAlbumInformation(albumi, s4);
		System.out.println();

		Concert c1 = new Concert();
		c1.artist = new Artist[3];
		c1.artist[0] = a1;
		c1.artist[1] = a2;
		c1.artist[2] = a3;
		c1.song = new Song[7];
		c1.song[0] = s1;
		c1.song[1] = s2;
		c1.song[2] = s3;
		c1.song[3] = s4;
		c1.song[4] = s5;
		c1.song[5] = s6;
		c1.song[6] = s7;

		System.out.println("This is your CONCERT !!" + c1);
		System.out.println();

		System.out.println(Arrays
				.toString(getNumberOfSongsPerAlbum(c1, albumi)));
	}

	/**
	 * Prints did songs have same artist
	 * 
	 * @param s1
	 *            song 1
	 * @param s2
	 *            song 2
	 * @return result
	 */
	public static boolean sameArtist(Song s1, Song s2) {

		if (s1.artist == s2.artist) {
			return true;

		}
		return false;
	}

	/**
	 * Prints if song is from solo artist
	 * 
	 * @param s1
	 *            song
	 * @return result
	 */
	public static boolean isFromSoloArtist(Song s1) {
		if (s1.artist.isGroup == true) {
			return true;
		}
		return false;
	}

	/**
	 * Prints the older song
	 * 
	 * @param s1
	 *            song 1
	 * @param s2
	 *            song 2
	 * @return result
	 */
	public static Integer getOlderSong(Song s1, Song s2) {
		if (s1.year > s2.year) {
			return s2.year;
		}
		return s1.year;
	}

	/**
	 * Counts and prints how many songs from album have specific genre
	 * 
	 * @param al1
	 *            album
	 * @param genre
	 *            specific genre
	 * @return result
	 */
	public static Integer countGenreNumber(Album al1, String genre) {
		int counter = 0;

		if (al1.genre == genre) {
			counter++;

		}

		return counter;
	}

	/**
	 * Printing the album where is found song
	 * 
	 * @param albumi
	 *            array of albums
	 * @param s
	 *            song
	 */
	public static void printAlbumInformation(Album[] albumi, Song s) {

		for (int i = 0; i < albumi.length; i++) {
			for (int j = 0; j < albumi[i].songs.length; j++) {
				if (albumi[i].songs[j].nameOfSong.equals(s.nameOfSong)) {
					System.out.println(albumi[i]);
				}
			}
		}
	}

	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {
		int counter = 0;
		int[] number = new int[c.artist.length];
		for (int i = 0; i < c.artist.length; i++) {
			for (int j = 0; j < c.song.length; j++) {
				for (int j2 = 0; j2 < a[i].songs.length; j2++) {

					if (c.song[j].nameOfSong.equals(a[i].songs[j2].nameOfSong)) {
						counter++;
					}
				}
				number[i] = counter;
			}

		}
		return number;
	}
}
