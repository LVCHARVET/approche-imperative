package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		//int sommePos = 0;
		//int sommeNeg = 0;
		int moy = 0;
			
		for (int arrayValue : array) {
			moy = moy + arrayValue;	
		}
		
		moy = moy%array.length;
		System.out.println(moy);
		
				/*if (arrayValue < 0) {
					sommeNeg = sommeNeg + Math.abs(arrayValue);
					System.out.println(sommeNeg);
				} else {
					sommePos = sommePos + arrayValue;
					System.out.println("POS : " + sommePos);
				}*/
	}

}
