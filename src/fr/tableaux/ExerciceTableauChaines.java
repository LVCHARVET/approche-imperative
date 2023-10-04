package fr.tableaux;

public class ExerciceTableauChaines {
	public static void main(String[] args) {
		String[] villeTab = {"Lyon", "Chartres", "Paris", "Nantes", "Nimes"};
		System.out.println(villeTab[0]);
		System.out.println(villeTab[1]);
		System.out.println(villeTab[2]);
		System.out.println(villeTab[3]);
		System.out.println(villeTab[4]);
		System.out.println(villeTab.length);
		System.out.println(villeTab[3] = "Reims");
		System.out.println(villeTab[0]);
		System.out.println(villeTab[1]);
		System.out.println(villeTab[2]);
		System.out.println(villeTab[3]);
		System.out.println(villeTab[4]);
	}
}
