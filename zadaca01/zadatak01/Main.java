package ba.bitcamp.zadaca01.zadatak01;

public class Main {

	public static void main(String[] args) {
	
		/**
		 * Creates a new cash box 
		 */
		CashBox cb1 = new CashBox("Crni fond");
		
		cb1.addMoney(20);
		cb1.addMoney(799);
		System.out.println(cb1.printInformation());
		cb1.takeAllMoney();
		System.out.println(cb1.printInformation());
	}

}
