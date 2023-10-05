package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		for (int arrayValue : array) {
			if (arrayValue > 3) {
				System.out.println("Sup a 3 :" + arrayValue);
			}
			if (arrayValue % 2 == 0) {
				System.out.println("Entier pair :" + arrayValue);
			} else {
				System.out.println("Entier impair :" + arrayValue);
			}			
		}
		
		int i = 0;
		
		for (i=0; i<array.length;i++) {
			if (array[i] % 2 == 0) {
				System.out.println("Index entier pair :" + i);
			}
		}
		
	}

}
