package OCA_SORULAR;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q09_AsalSayi {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("sayi gir");
		int sayi=scan.nextInt();
		List<Integer>list=new ArrayList<>();
		for (int i = 1; i <= sayi; i++) {
			if (sayi%i==0) {
				list.add(i);
			}
		}
		System.out.println(list);
		if (list.size()==2) {
			System.out.println(sayi+":Sayi asaldir");
		}else System.out.println(sayi+":Asal degildir");
		;
	}

}
