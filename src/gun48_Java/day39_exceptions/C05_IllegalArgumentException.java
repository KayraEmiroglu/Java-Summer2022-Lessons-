package gun48_Java.day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini girmesini isteyin. Kodunuzu
        kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("yasini giriniz");
        int yas = scan.nextInt();

        try {
            if(yas<0){
                throw new IllegalArgumentException();
            }else {
                System.out.println("Yasiniz : "+ yas );
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.print("Yas negatif olamaz.");
        }


    }
}