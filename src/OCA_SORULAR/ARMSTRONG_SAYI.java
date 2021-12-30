package OCA_SORULAR;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ARMSTRONG_SAYI {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/*
		 * Check if the integer is an Armstrong numbers Armstrong sayi:herhangi bir
		 * sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi Armstrong
		 * sayidir ​ 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153 370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Sayiyi gir");

		int sayi = scan.nextInt();

		int number = sayi;
		int basamak;
		int kuvvet = 1;
		int sayac = 0;
		int sepet = 0;

		List<Integer> basmak = new ArrayList<>();

		while (number > 0) {

			basamak = number % 10;
			sayac++;
			basmak.add(basamak);
			number = number / 10;

		}

		System.out.println(sayac);
		System.out.println();
		System.out.println(basmak);

		for (int i = 0; i < sayac; i++) {
			for (int j = 1; j <= sayac; j++) {

				kuvvet = kuvvet * basmak.get(i);

			}
			sepet += kuvvet;
			kuvvet = 1;

		}

		System.out.println();
		if (sayi == sepet) {
			System.out.println(sayi + "  bir armstrong sayidir");

		} else
			System.out.println(sayi + " armstrong degildir");
	}
}
