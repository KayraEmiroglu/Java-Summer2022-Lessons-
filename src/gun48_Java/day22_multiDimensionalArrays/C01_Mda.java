package gun48_Java.day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    /*
    tek kaatli arraylerde arrayi direk yazdiramiyoruz.
    Cunku array non-primitive data turudur ve
    her non-primitive dataa direk yazdirilmayabilir.

    ancak array'in icerisindeki elementleri direk yazdirabiliyorduk.
    cunku genelde primitive data turu veya String elemenler kullanılıyordu.

    Multi-diensional array'lerde en dikkat edecegimiz konu
    ulasmak istedigimiz elementin bir array mi yoksa primitive data mı oldugudur.

     */




    /*
    burada sayilar aarrayini dusunursek icinde 2 tane inner arraay var
    sayilar[0]={1,2,3,4}

    ancak en icerdeki elementlere ulasırsak direk yazdirabiliriz
     */

    public static void main(String[] args) {
        int[][] sayilar={{1,2,3,4},{3,4}};
        System.out.println(sayilar[0]);//referans noktası
        System.out.println(Arrays.toString(sayilar[0]));// 1,2,3,4

        System.out.println(sayilar[0][1]);//2

        System.out.println(sayilar[1][0]);//3

        System.out.println(Arrays.toString(sayilar));// 2 tane referans verir.
        System.out.println(Arrays.deepToString(sayilar));//hepsini verir.

        /*
        array'i iki sekide declare edebiliyorduk
        1- elemanları direk yazdırabiliriz.
        2- outer ve inner arraaylerin uzunluklarini belirterek olusturaibliriz.

        int[] sayilara = new int[3][4];

        ancak2. yontemle yaaptıgımızda inner arraylerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer array'in 3 tane inner array'i vardir.
        Her bir inner array'in ise 4er elemani vardir.

        eger inner aarrayleri farklı uzunluklarda olusturmak istiyorsaniz
        mecburen 1. yontemi kullanmalisiniz.

         */


    }

}
