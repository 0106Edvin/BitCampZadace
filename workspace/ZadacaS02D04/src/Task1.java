
public class Task1 {

	public static void main(String[] args) {
		TextIO.readFile("src/input.in1");
		
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		int c = a + 1;
		
		
		for (int i = c; i < b; i++) {
			System.out.println(i);
		}
		
		

	}

}
