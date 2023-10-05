package fr.algorithmie;

public class AffichageInverse {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int [] arrayCopy = new int[array.length];
		for (int arrayValue : array ) {
			System.out.println(arrayValue);			
		}
		
		System.out.println("-----------------------");
		
		int i = array.length - 1;
		
		for (i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		
		System.out.println("-----------------------");
		
		int index = 0;
		
		for (index = 0; index < array.length; index++) {
			arrayCopy[index] = array[index];
			System.out.println("arrayCopy :" + arrayCopy[index]);
		}
		
	}
}
