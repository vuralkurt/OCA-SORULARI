package OCA_SORULAR;

import java.util.*;

public class Q20 {
    public static void main(String[] args) {
/*

        We are organizing a horse race with horses having distinct strengths.
        The strength of the horses is represented by an array of integers.
        In order to make the race competitive,  your program should find out the pair of
        horses with similar str

        Farklı güçleri olan atlarla bir at yarışı düzenliyor. Atların gücü bir tamsayı dizi assign  edilirse.
        bir birine yakın güçlere sahip at çiftlerini bulunuz.

        For example :{3, 67, 9, 46, 55, 48}
        output : 46,48

         */

        Integer aar[]={52,78,25,45,66,41};
        int min=(Integer.MAX_VALUE);


        for (int i = 0; i <aar.length ; i++) {
            for (int j = i+1; j <aar.length ; j++) {

                if((Math.abs(aar[i]-aar[j])<min)){

                    min=Math.abs(aar[i]-aar[j]);
                }

            }

        }

        System.out.println(min);

        for (int i = 0; i <aar.length ; i++) {
            for (int j = i+1; j <aar.length ;j++){

               if((Math.abs(aar[i]-aar[j])==min)) {

                   System.out.println(aar[i]+ " ve "+aar[j]+"  birbirine en yakin sayilardir.");

                }

            }

        }




    }
}


