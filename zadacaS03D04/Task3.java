package ba.bitcamp.edvin.zadacaS03D04;

public class Task3 {

	public static void main(String[] args) {

		System.out.println(hasNumbers("P4rametri"));
	}

	public static boolean hasNumbers(String s) {
		int i;
		
		for (i = 0; i < s.length() ; i++) {
		
			if (s.charAt(i) >= 48  && s.charAt(i) <=57 ){

				return true;

		}

	}
		return false;

}
}