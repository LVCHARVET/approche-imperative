package fr.algorithmie;

public class SommeDeTableaux {

	public static void main(String[] args) {
		int[] array1 =  {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
		int[] arraySomme = new int[array1.length + array2.length % 2 - 1];
		
		int i = 0;
		
		for (i=0; i<arraySomme.length; i++) {
			arraySomme[i] = array1[i] + array2[i];
			System.out.println(arraySomme[i]);
		}
		
		System.out.println(arraySomme.length);
		
		/*int sommeArray1 = 0;
		int sommeArray2 = 0;
		
		for (int array1Value : array1) {
			sommeArray1 = sommeArray1 + array1Value;			
		}
		
		for (int array2Value : array2) {
			sommeArray2 = sommeArray2 + array2Value;
		}
		
		int somme = sommeArray1 + sommeArray2;
				
		System.out.println("sommeArray1 : " + sommeArray1);
		System.out.println("sommeArray2 : " + sommeArray2);
		System.out.println("somme : " + somme);	*/
	}

}
