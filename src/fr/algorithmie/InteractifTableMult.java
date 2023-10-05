package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		boolean valide = false;

		while (valide == false) {

			Scanner scanner = new Scanner(System.in);

			System.out.print("Ecrire un nombre: ");

			int nombre = scanner.nextInt();

			if (nombre > 0 && nombre < 11) {
				System.out.println(nombre + " * 1 = " + nombre * 1);
				System.out.println(nombre + " * 2 = " + nombre * 2);
				System.out.println(nombre + " * 3 = " + nombre * 3);
				System.out.println(nombre + " * 4 = " + nombre * 4);
				System.out.println(nombre + " * 5 = " + nombre * 5);
				System.out.println(nombre + " * 6 = " + nombre * 6);
				System.out.println(nombre + " * 7 = " + nombre * 7);
				System.out.println(nombre + " * 8 = " + nombre * 8);
				System.out.println(nombre + " * 9 = " + nombre * 9);
				System.out.println(nombre + " * 10 = " + nombre * 10);				
				valide = true;
			}
			scanner.close();
		}
	}

}
