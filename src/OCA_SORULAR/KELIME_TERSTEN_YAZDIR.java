package OCA_SORULAR;

import java.util.Arrays;
import java.util.Scanner;

public class KELIME_TERSTEN_YAZDIR {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		Girilen bir String'i tersten yazdiran bir pr create ediniz
		 */
		
	/*	***1,YONTEM****/
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("girsene metin");
		
		String metin=scan.nextLine();
		
		String terso[]= metin.split("");
		System.out.println();
		System.out.println(Arrays.toString(terso));
		System.out.println();
		
		for (int i =terso.length-1; i >=0 ; i--) {
			
			
			System.out.print(terso[i]);
	
			
			
	/*	***2,YONTEM****/
		
		
		StringBuilder metini=new StringBuilder(scan.nextLine());
		
		metini.reverse();
		
		System.out.println(metini);
		
		
		
		
			
		
		
		}	

	}

}
