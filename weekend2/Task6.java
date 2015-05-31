package ba.bitcamp.edvin.weekend2;

public class Task6 {

	public static void main(String[] args) {
		Task6a movie1 = new Task6a("Gone Girl", 2014,
				"Drama, Mystery, Thriller", "David Fincher", 8.2, false);
		System.out.println(movie1);
		System.out.println();

		Task6a movie2 = new Task6a("Big Hero 6", 2014,
				"Animation, Action, Adventure", " Don Hall, Chris Williams",
				7.9, true);

		System.out.println(movie2);
	}

}
