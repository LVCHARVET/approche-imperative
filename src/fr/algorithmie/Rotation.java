package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array1 = { 6, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 8 };
		int gap = 1;
		int i = 0;
		
		for (i=0;i<gap;i++) {
			int firstValue = array1[array1.length - 1];
			for (int j=array1.length - 1; j > 0 ; j--) {
				array1[j] = array1[j - 1];
			}
			array1[0] = firstValue;
		}
		System.out.println(array1[1]);
	}

}
