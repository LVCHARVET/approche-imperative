package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int [] arrayCopy = new int[array.length];
		int index = array.length - 1;
		int i = 0;

		for (index = array.length - 1; index >= 0; index--) {
			arrayCopy[i] = array[index];
			i++;
			System.out.println(arrayCopy[index]);
		}
		
		for (int arrayValue : array ) {
			System.out.println("array :" + arrayValue);			
		}
		
		for (int arrayCopyValue : arrayCopy ) {
			System.out.println("arrayCopy :" + arrayCopyValue);			
		}

	}

}
