package fr.algorithmie;
import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int nombreAleatoire = random.nextInt(100) + 1;
        int nombreEssais = 0;
        int tentative;

        System.out.println("Bienvenue dans le jeu de deviner le nombre entre 1 et 100!");

        do {
            System.out.print("Entrez votre proposition : ");
            tentative = scanner.nextInt();
            nombreEssais++;

            if (tentative < nombreAleatoire) {
                System.out.println("Le nombre à deviner est plus grand.");
            } else if (tentative > nombreAleatoire) {
                System.out.println("Le nombre à deviner est plus petit.");
            } else {
                System.out.println("Bravo, vous avez trouvé en " + nombreEssais + " coups !");
            }
        } while (tentative != nombreAleatoire);
        scanner.close();
	}
}
