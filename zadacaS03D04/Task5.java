package ba.bitcamp.edvin.zadacaS03D04;

public class Task5 {

	public static void main(String[] args) {
		
		System.out.println(getNumbersOnly("41d K. :9"));

	}
	public static String getNumbersOnly (String s){
		String str = "";
		;
		for (int i = 0; i < s.length() -1; i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				str += s.charAt(i);
			 
			
		}
		
	}
		return str;
}
}