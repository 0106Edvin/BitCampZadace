package ba.bitcamp.edvin.weekend1;
/*Implementirati kod koji odre�uje da li je lopta sa datim polupre�nikom �dobre kvalitete�.
U ovom slu�aju �dobra kvaliteta� zna�i da lopta ima volumen od 6.014 sa odstupanjem
od �0.05%.*/
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = 9;
		double volume = (4 / 3)* r * r * r * Math.PI;
		double volumeUpperLimit = volume + ((volume * 0.05 ) / 100);
		double volumeLowerLimit = volume - ((volume * 0.05) / 100);
		
		if (volume == 6.014 || volume == volumeUpperLimit || volume == volumeLowerLimit ){
			System.out.println("The quality of ball is good");
		}else System.out.println("The quality of ball is not good");

	}

}
