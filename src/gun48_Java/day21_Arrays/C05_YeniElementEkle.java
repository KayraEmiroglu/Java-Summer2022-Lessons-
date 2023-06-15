package gun48_Java.day21_Arrays;

import java.util.Arrays;

public class C05_YeniElementEkle {
    public static void main(String[] args) {
        /*
        Verilen bir array’e yeni bir element ekleyen method olusturun
         */

        String[] sinifListesi={"Kayra Emiroglu","Ali Can","Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String[] yeniSinifListesi=new String[sinifListesi.length+1];//[null,null]
        //Eski listeden 1 elemaan faazla uzunlukta yeni bir array olusturdum
        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];
        }
        //oncelikle eski listedeki tum elemanlari,yeni listeye taşıdım
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        //son index'e ise eklenecek ismi atadım


        return yeniSinifListesi;
    }
}
