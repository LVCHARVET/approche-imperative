package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[10];
		int maxValue = 0;

		for (int arrayValue : array) {
			System.out.print("Ecrire un nombre: ");
			int nombre = scanner.nextInt();
			arrayValue = nombre;
			if (arrayValue > maxValue) {
				maxValue = arrayValue;
			}
		}
		System.out.println(maxValue);
		scanner.close();
	}
}
