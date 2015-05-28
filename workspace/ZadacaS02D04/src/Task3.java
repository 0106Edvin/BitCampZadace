public class Task3 {

	public static void main(String[] args) {
		TextIO.readFile("src/input.in3");
		int number = TextIO.getlnInt();

		int num;
		int min;

		if (number != 0) {
			num = TextIO.getlnInt();
			min = num;
		} else {
			min = 0;
		}

		for (int i = 0; i < number - 1; i++) {
			num = TextIO.getlnInt();
			if (num < min) {
				min = num;
			}
		}

		if (number != 0) {
			System.out.println("Lowest number is: " + min);
		
		}

	}
}