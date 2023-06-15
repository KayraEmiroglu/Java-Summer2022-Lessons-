package gun48_Java.day03_scanner;

import java.util.Scanner;

public class C08_Scannerilkharf {
    public static void main(String[] args) {
        //kullanıcıdan ismini alip, ilk harfini büyük harf olarak yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz.");
        /*
        Java Scanner classında nextChar() methodu yoktur
        bunun yerine String olarak ilk kelimeyi alıp
        onun da ilk harfini alabiliriz.
         */
        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("İlk harfiniz : "+ ilkHarf);




    }
}
