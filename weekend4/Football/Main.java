package ba.bitcamp.edvin.weekend4.Football;




public class Main {

	public static void main(String[] args) {
		
		/**
		 * Creating football players
		 */

		FootballPlayer f1 = new FootballPlayer("Asmir Begovic", 1987,
				"Goalkeeper");
		FootballPlayer f2 = new FootballPlayer("Vedad Ibisevic", 1984,
				"Forward");
		FootballPlayer f3 = new FootballPlayer("Haris Medunjanin", 1985,
				"Midfielder");
		FootballPlayer f4 = new FootballPlayer("Muhamed Besic", 1992,
				"Midfielder");
		FootballPlayer f5 = new FootballPlayer("Sead Kolasinac", 1993,
				"Defender");
		FootballPlayer f6 = new FootballPlayer("Edin Visca", 1990, "Midfielder");

		/**
		 * Creating football team 
		 */
		
		FootballTeam ft1 = new FootballTeam();
		ft1.name = "Bosnia and Herzegovina";
		ft1.player = new FootballPlayer[6];
		ft1.player[0] = f1;
		ft1.player[1] = f2;
		ft1.player[2] = f3;
		ft1.player[3] = f4;
		ft1.player[4] = f5;
		ft1.player[5] = f6;

		System.out.println(ft1);

		System.out.println("There is " + countPlayers(ft1, 1990) + " player(s) with that year of birth" );
		System.out.println();
		System.out.println("There is " +countPlayers(ft1, "Midfielder") + " player(s) on that position");
		System.out.println();
		System.out.println("The youngest player is: \n" + getYoungestPlayer(ft1));
	}
	/**
	 * Counting how many players from team have specific year of birth
	 * @param team
	 * @param year specific year entered by user
	 * @return results
	 */
	public static Integer countPlayers(FootballTeam t, Integer year) {

		Integer counter = 0;
		for (int i = 0; i < t.player.length; i++) {

			if (t.player[i].yearOfBirth.equals(year)) {
				counter++;

			}

		}
		return counter;

	}
	/**
	 * Counting how many players from team have the specific position
	 * @param t team
	 * @param position specific position entered by user
	 * @return results
	 */

	public static Integer countPlayers(FootballTeam t, String position) {
		Integer counter = 0;

		for (int i = 0; i < t.player.length; i++) {
			if (t.player[i].position.equals(position)) {
				counter++;

			}

		}
		return counter;
	}
	/**
	 * Finds the youngest player in team
	 * @param t team
	 * @return youngest player
	 */

	public static FootballPlayer getYoungestPlayer (FootballTeam t){
		
		FootballPlayer youngest = t.player[0];
		
		for (int i = 0; i < t.player.length; i++) {
			if ( youngest.yearOfBirth < t.player[i].yearOfBirth){
				youngest = t.player[i];
			
			}
			
		}
		return youngest;
	
		
	}
}
