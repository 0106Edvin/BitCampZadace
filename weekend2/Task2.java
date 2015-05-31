package ba.bitcamp.edvin.weekend2;

public class Task2 {

	public static void main(String[] args) {
		String brackets = "{{}}}";
		
		int a =  brackets.length();
		int counter1 = 0;
		int counter2 = 0;
		
		for (int i = 0; i < brackets.length(); i++) {
			char b = brackets.charAt(i);
			char openBracket = '{';
			char closedBracket = '}';
			
			if (b == openBracket){
				counter1++;
				
			}else if (b == closedBracket){
				counter2++;
				
			}
			
		}
		if (counter1 == counter2){	
			System.out.println("Brackets are closed!");
		}else if (counter1 != counter2){
			System.out.println("Brackets are not closed!");
		}
	}

}
