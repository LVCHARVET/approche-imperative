package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class IntteractifStockageNombre {

	public static void main(String[] args) {
		int[] array = new int[5];
		int iArray = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choisir un menu en écrivant : ");
		System.out.println("1. Ajouter un nombre");
		System.out.println("2. Afficher les nombres existants.");
		System.out.print("Ecrire un chiffre: ");

		int menu = scanner.nextInt();
		
		while (true) {
			switch (menu) {
			case 1:
				if (iArray == array.length) {
					int newArray = array.length * 2;
					array = Arrays.copyOf(array, newArray);
				}
				System.out.print("Entrez un nombre à ajouter : ");
				int nombre = scanner.nextInt();
				array[iArray] = nombre;
				iArray++;
				break;
			case 2:
				for (int arrayValue : array) {
					System.out.println("Nombre existants : " + arrayValue);
				break;
				}
			default:
				System.out.println("Veuillez séléctionner un chiffre valide");
				scanner.close();
				System.exit(0);
				break;
			}
		}
		
	}

}
