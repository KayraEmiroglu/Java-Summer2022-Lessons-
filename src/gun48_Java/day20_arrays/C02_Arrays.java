package gun48_Java.day20_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[]=new int[3];
        /*
         non-primitive daata turundeki datalari her zaman direk yazdiramayabiliriz.
         Array'i yaazdirmak istersek Arrays class'indan yardim isteriz
         */

        System.out.println(Arrays.toString(sayilar));

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(Arrays.toString(sayilar));

        String sınıflist[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sınıflist));

        sınıflist[1]="Hasan";
        System.out.println(Arrays.toString(sınıflist));

        System.out.println(sınıflist[1]);
        System.out.println(sınıflist[0]);


    }
}
