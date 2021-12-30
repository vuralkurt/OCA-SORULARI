package OCA_SORULAR;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_AnagramKelime {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		String str1=scan.next().toLowerCase();
		String str2=scan.next().toLowerCase();
		
		String aar1[]=str1.split("");
		String aar2[]=str2.split("");
		Arrays.sort(aar1);
		Arrays.sort(aar2);
		
		if (Arrays.equals(aar1,aar2)) {
			System.out.println("ANAGRAM");
			
		}else System.out.println("ANAGRAM DEGIL");
	}

}
