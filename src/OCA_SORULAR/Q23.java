package OCA_SORULAR;

import java.util.Arrays;

public class Q23 {
    public static void main(String[] args) {
         /*
        Ebay Interview Question:
        Put all zeros to end in a integer array
        Bir tamsayı dizisinde tüm sıfırları sona koyan bir program create ediniz.

        input : {3, 0, 4, 2, 0}
        output: {3, 4, 2, 0, 0}
         */

        Integer aar[]={33,0,43,29,0,78};

        Integer aar1[]=new Integer[aar.length];

        int count = 0;
        int sayac=1;

        for (int i = 0; i <aar.length ; i++) {

            if(aar[i]!=0){
                aar1[count]=aar[i];
                count++;
            }

            if(aar[i]==0){
                aar1[aar.length-sayac]=aar[i];
                sayac++;
            }
            
        }
        System.out.println(Arrays.toString(aar));
        System.out.println(Arrays.toString(aar1));

    }
}
