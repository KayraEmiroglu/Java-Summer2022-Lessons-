package gun48_Java.day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {

        /*
           Kulannicidan toplanmak uzere sayilar alin
           sayilarin toplami 500'u gecince
           sayilarin toplamini ve kac sayi toplandığını su sekilde yazdirin
           13 sayi girdiniz ve toplamlari 567
         */

        int toplam=0;
        int sayi;
        Scanner scan = new Scanner(System.in);
        int kackez=0;
        while(toplam<500){

            System.out.println("Lütfen toplamak için sayi giriniz.");
            sayi=scan.nextInt();
            toplam+=sayi;
            kackez++;
        }
        System.out.println(kackez +" sayi girdiniz ve toplamlari "+toplam);
    }
}
