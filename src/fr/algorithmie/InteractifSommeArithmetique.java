package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ecrire un nombre: ");

		int nombre = scanner.nextInt();
		int sommes = 0;
		
		for (int i = 0; i <= nombre; i++) {
			sommes = sommes + i;
			System.out.println(sommes);
		}
		
		scanner.close();
	}

}
