
public class Task2 {

	public static void main(String[] args) {
		TextIO.readFile("src/input.in2");
		int num = 0;
		int sum = 0;
		
		while (num != -1){
		sum+=num;
		num = TextIO.getInt();
	}


}
}