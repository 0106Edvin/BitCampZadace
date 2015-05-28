
public class Task5 {

	public static void main(String[] args) {
		TextIO.readFile("src/decimal.in");
		
		int num = TextIO.getInt(); //decimal number
		int counter = 0; //counter to know how many digits binary number has
		String binaryNum = ""; 
		int extra = 0;
		
		//Opening file to write in
		TextIO.writeFile("src/binary.in");
		
		//Getting reversed binary num and writing it to file
		//For example if number is 10, it writes 0101
		//Also going into new row every time 0 or 1 is inputed
		while(num != 0){
			if(num % 2 == 0){
				TextIO.put(0 + "\n");
			} else {
				TextIO.put(1 + "\n");
			}
			counter++; 
			num /= 2;	
		}
		
		//Opening file binary.out to get reversed binary number
		TextIO.readFile("src/binary.in");
		
		//Reversing number using String variable
		for (int i = 0; i < counter; i++) {
			extra = TextIO.getlnInt();
			binaryNum = extra + binaryNum;
		}
		
		//Opening file again to write number in
		TextIO.writeFile("src/binary.in");
		TextIO.put(binaryNum);
		
	}
}