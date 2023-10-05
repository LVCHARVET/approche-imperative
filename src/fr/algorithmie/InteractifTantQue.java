package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		boolean valide = false;

		while (valide == false) {

			Scanner scanner = new Scanner(System.in);

			System.out.print("Ecrire un nombre: ");

			int nombre = scanner.nextInt();

			if (nombre > 0 && nombre < 11) {
				System.out.println(nombre);
				valide = true;
			}
			scanner.close();
		}
	}
}
