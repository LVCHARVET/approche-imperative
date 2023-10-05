package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ecrire un nombre: ");

		int nombre = scanner.nextInt();
		System.out.println(nombre + 1);
		System.out.println(nombre + 2);
		System.out.println(nombre + 3);
		System.out.println(nombre + 4);
		System.out.println(nombre + 5);
		scanner.close();
	}

}
