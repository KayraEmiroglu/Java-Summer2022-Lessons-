package gun48_Java.day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*
         Kullancidan iki sayi alip
         bu sayilarin çarpimini yazdirin
         */

        //1.adim
        Scanner scan=new Scanner(System.in);
        //2.adim

        System.out.println("Lütfen ilk sayıyı girin.");

        //3. adim
        double sayi1 = scan.nextDouble();
        //2. sayı için  2. ve 3. adımları tekrarlarız
        System.out.println("Lütfen ikinci sayıyı girin.");
        double sayi2 = scan.nextDouble();

        System.out.println("Sayıların çarpımları : " + sayi1*sayi2);
    }
}
