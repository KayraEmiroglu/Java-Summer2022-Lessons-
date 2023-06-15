package gun48_Java.day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClass {

    public static void main(String[] args) {

        /*
        Wrapper class javanin hazir methodları kullanabilmemiz için
        primitive data türlerinin herbiri için actiği classlardır.

        int --> Integer
        char --> Character
         */

        String str = "Java ile hayat ne güzel";

        System.out.println(str.toUpperCase());// JAVA ILE HAYAT NE GÜZEL

        boolean guzelMi=true;
        // guzelMi. booelan primitive olduğundan hazır method'u bulunmuyor.

        Boolean buGuzelMi=true;
        buGuzelMi.toString();


        System.out.println(Short.MIN_VALUE);// -32768
        System.out.println(Short.MAX_VALUE);// 32767


        String ogrNo="123456";

        //kullanıcıdan bir şifre isteyin
        // eğer şifre sadece rakamlardan oluşuyorsa kabul etmeyelim.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir şifre giriniz");

        String sifre= scan.nextLine();

        Integer sifreSayi = Integer.parseInt(sifre);

        System.out.println("girilen sifrenin 3 fazlası  : "+ (sifre+3));
        System.out.println("Integer sifrenin 3 fazlası : "+ (sifreSayi+3));

        /*

        Wrapper classlar ilerde kullanabileceğimiz pek cok faydali hazir methodd içerir

         */


    }
}
