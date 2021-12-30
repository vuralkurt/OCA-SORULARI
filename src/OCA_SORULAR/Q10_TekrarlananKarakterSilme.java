package OCA_SORULAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q10_TekrarlananKarakterSilme {
    public static void main(String[] args) {
        /*
         Create  a list by getting the list elements from user
         if there is duplicated elements remove them from the list.

         Kullanıcıdan aldıgınız elemanlardan oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
         */

        Scanner scan=new Scanner(System.in);
        List<String>list=new ArrayList<>();
        System.out.println("Kac eleman girmek istiyorsunuz");
        int elemansayi=scan.nextInt();

        for (int i = 0; i < elemansayi; i++) {

            System.out.println("Elemani gir");

            list.add(scan.next());

        }
        System.out.println(list);
        //Collections.sort(list);


        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    //j--;
                }
            }
        }
        System.out.println(list);


    }
}
