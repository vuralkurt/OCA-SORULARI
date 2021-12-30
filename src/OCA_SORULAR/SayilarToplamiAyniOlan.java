package OCA_SORULAR;

import java.util.Arrays;
import java.util.Scanner;

public class SayilarToplamiAyniOlan {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Integer aar[] = {  8, 6, 10, 1, 5, 7, 0, 3, 9,5,-2,12,-5,15,2,1,2 };

		System.out.println(Arrays.toString(aar));
		int sayi = 10;
		String bos = "";
		for (int i = 0; i < aar.length; i++) {
			for (int j = i + 1; j < aar.length; j++) {

				if (aar[i] + aar[j] == 10 ) {

					bos += aar[i] + "+" + aar[j] + "=10"+"~~";
				
				}
			
			}
			
		}
		System.out.print(bos);
	}

}
