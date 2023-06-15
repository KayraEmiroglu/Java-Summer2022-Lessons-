package gun48_Java.day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanicdan ismini soyismini ve yaşını alıp
        girilen bilgiler = seyfi capar 34 şeklinde yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Adınızı giriniz!");
        /*
        string verileri scanner ile alırken next()=ilk boşluğa kadar olan kısmı(1 kelime)
        ve nextLine()=Satırın sonuna kadar ne yazarsak alır
        Not: eğer ardarda birden fazla string değer alıcaksak nextLine  kullanmalıyız.


         */

        String isim = scan.nextLine();
        System.out.println("Soyadınız giriniz!");
        String soyAd = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz!:");
        double yas = scan.nextDouble();

        System.out.println("Girilen bilgiler ="+ isim+" "+soyAd+" "+yas);
    }
}
