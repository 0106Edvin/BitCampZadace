package ba.bitcamp.edvin.zadacaS03D04;

public class Task2 {

	public static void main(String[] args) {
		System.out.println(getGrade(95));

	}

	public static char getGrade(int score) {

		switch (score) {
		case 'A':
			if (score >= 94 && score <= 100) {
			}
			return 'A';

		case 'B':
			if (score >= 84 && score <= 93) {

			}
			return 'B';

		case 'C':
			if (score >= 74 && score <= 83) {

			}
			return 'C';

		case 'D':
			if (score >= 64 && score <= 73) {

			}
			return 'D';
		case 'E':
			if (score >= 55 && score <= 63) {

			}
			return 'D';
		case 'F':
			if (score >= 0 && score <= 54) {
			}
			
			return 'F';
		
		
		}
	}
}
