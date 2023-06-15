package gun48_Java.day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        //bir önceki soruyu tek seferde kullanıcdan tüm bilgileri alarak yapiniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi,soyisminizi ve yaşınızı giriniz. \naralarda Enter tuşuna basınız.");

        String isim= scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();

        System.out.println("Girilen bilgiler ="+ isim+" "+ soyisim+" "+yas);



    }
}
