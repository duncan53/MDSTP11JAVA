package fr.mds.java.tp11.utils;

public class Conjugateur {
	public static void conjugueAvecSaisi(String tab[]) {
		
		String pronoms[] = {"Je ", "Tu ", "Il ", "Nous ", "Vous ", "Ils "};
		String termine[] = {"e", "es", "e", "ons", "ez", "ent"};
		int i = 0;
		String result = "";
		
		for (String verbe : tab) {
			result = verbe.substring(0, verbe.length() - 2);
			for (String pronom : pronoms) {
				System.out.println(pronom + result + termine[i]);
				i++;
			}
			System.out.println();
			i = 0;
		}
	}
}
