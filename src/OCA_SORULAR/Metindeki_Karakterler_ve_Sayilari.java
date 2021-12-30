package OCA_SORULAR;

import java.util.Arrays;
import java.util.Scanner;

public class Metindeki_Karakterler_ve_Sayilari {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Count the words in a String one by one Girilen bir String'deki kelimeleri tek
		 * tek saydiran java code create ediniz.
		 * 
		 * For Example: Input : String is "Ali came to school and Ayse came to school"
		 * Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Metin gir");

		String metin = scan.nextLine();

		String aar[] = metin.split(" ");

		String bos = "";

		int sayac = 0;

		for (int i = 0; i < aar.length; i++) {

			for (int j = i; j < aar.length; j++) {

				if (aar[i].equals(aar[j])) {
					sayac++;

				}

			}
			if(!bos.contains(aar[i])) {
				bos+=aar[i]+"="+sayac+"#";
				
			}
			sayac=0;
		}
		String aar2[]=bos.split("#");
		System.out.println(Arrays.toString(aar2));
	}
}