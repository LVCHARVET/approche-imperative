package fr.tableaux;

public class ExerciceDeclarationTab {
	public static void main(String[] args) {
	int [] intTabl = {8,-7,12,1,-2,14,17,9};
	System.out.println(intTabl[0]);
	System.out.println(intTabl.length);
	System.out.println(intTabl[intTabl.length - 1]);
	System.out.println(intTabl[10]); // Out of bounds => L'index est suppérieur a la taille du tableau donc une erreur survient
	}
}
