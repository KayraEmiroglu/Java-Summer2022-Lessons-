package gun48_Java.day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
       //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki
        //tum tamsayilari toplayip, sonucu yazdiran bir method  yaziniz

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 2 adet sayı giriniz.");
        int number1= scan.nextInt();
        int number2= scan.nextInt();

        araToplam(number1,number2);
    }

    public static void araToplam(int number1, int number2) {
        int toplam =0;
        if (number1==number2){
            System.out.println("2 sayi toplamı 0");
        } else if (number1<number2) {

            for (int i = number1; i <=number2; i++) {

                toplam+=i;
            }

        }else {

            for (int i = number2; i <=number1; i++) {

                toplam+=i;
            }
        }
        System.out.println("Sayıların toplami: " + toplam);

    }
}
