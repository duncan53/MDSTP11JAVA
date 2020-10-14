package fr.mds.java.tp11;

import java.util.Scanner;

import fr.mds.java.tp11.utils.Conjugateur;

public class Tp11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un verbe du premier groupe à l'infinitif : ");
		String verbe = sc.nextLine();
		
		String tab[] = {verbe};
		//String tab[] = {"Chanter", "Parler", "Taper", "Manger"};
		Conjugateur.conjugueAvecSaisi(tab);
		sc.close();
	}
}
