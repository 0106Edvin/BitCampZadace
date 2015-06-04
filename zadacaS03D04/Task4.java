package ba.bitcamp.edvin.zadacaS03D04;

public class Task4 {

	public static void main(String[] args) {
		System.out.printf("%.4f%%\n", getPercentage(30,35) );
	}
	public static double getPercentage(int N, int M){
		
		double percentage=0;
		percentage = (double) N*100/ (double)M;
		return percentage;
	}
}
