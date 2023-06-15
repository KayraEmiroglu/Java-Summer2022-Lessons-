package gun48_Java.day05_matematikselislem;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        //kullancidan 4 basamaklı bir sayi alın ve rakamları toplamını bulup yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 4 basamaklı pozitif bir tamsayı giriniz.");
        int sayi= scan.nextInt();//5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        //Şu anda  sayi 5267 bb=0 rt=0

        birlerBasamagi = sayi %10;//7
        rakamlarToplami += birlerBasamagi;

        sayi /= 10;//sayi=526 bb 7 rt 7

        birlerBasamagi = sayi%10;//6
        rakamlarToplami+=birlerBasamagi;//13

        sayi/=10;//sayi=52 bb 6 rt 13

        birlerBasamagi =sayi%10 ;//2
        rakamlarToplami+=birlerBasamagi;//15

        sayi/=10;//sayi=5 bb 2 rt 15

        birlerBasamagi=sayi%10;//5
        rakamlarToplami+=birlerBasamagi;//20
        sayi/=10;//sayi=0 bb 5 rt20

        System.out.println("Rakamların toplamı ; "+ rakamlarToplami);
        System.out.println("birlerBasamağı : "+ birlerBasamagi);
        System.out.println("sayi : "+ sayi);











    }
}
