
public class Taks4 {

	public static void main(String[] args) {
		TextIO.readFile("src/input.in4");
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		boolean found = true;
		int num = 0;
		for (int i = 0; i < a - 1; i++) {
			num = TextIO.getlnInt();
			if(num == b){
				found = true;
				break;
			}			
		}
		
		//Printing results
		if(found){
			System.out.println("Number " + b + " is found in file.");
		} else {
			System.out.println("Number " + b + " couldn't be found.");
		}
}
}