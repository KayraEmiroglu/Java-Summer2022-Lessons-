package gun48_Java.day09_Ternary;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {
/*
 kullanicidan gun numarasini alip
 1 ise pazartesi,
 ...
 7 ise pazar yazdiralim
 */
        /*
        Switch yanina () yazilan neye göre case ataaycağımızı gösterir
        Java girilen değere göre case'i bulur ve o satırdan çalıştırmaya başlar
        Break yazisi gorunceye veya siwtch parantezine kadar devam eder

        if- else if - yapısında olduğu gibi
        hiç bir şarta uymayanları default keyword kullanılır.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunu giriniz");
        int gunNo= scan.nextInt();

        switch (gunNo){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali");
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6  :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lütfen geçerli bir sayı giriniz!");
        }

    }

}
