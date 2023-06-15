package gun48_Java.day21_Arrays;

import java.util.Arrays;

public class C07_binarySearch {
    public static void main(String[] args) {
        /*
        Binary search java da eleman aramanin kisa yoludur.
        Ancak binary search'in calismasi icin once
        array'in sirali hale getirilmesi gerekir.
        Eger siralama yapmadadn binarySearch yaparsaniz
        sonucu bulamayabilir veya yanlis bulabilir.
         */

        String[] harfler = {"Y","B","D","G","O","A"};
        //Ortadan başlıyo kontrol ederek gidiyor.

        String arananHarf="Z";


        int sayi=  Arrays.binarySearch(harfler,arananHarf);
        System.out.println("sayi = " + sayi);


        System.out.println(C03_Contains.contains(harfler,arananHarf));

        //binarySearch bize aradaigimiz elemanin indexini dondurur
        //array sirali olmadigi icin arama sonucunu dogru bulamayabilir
        //emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        sayi=Arrays.binarySearch(harfler,arananHarf);
        System.out.println(sayi);
        System.out.println(C03_Contains.contains(harfler,arananHarf));


    }
}
