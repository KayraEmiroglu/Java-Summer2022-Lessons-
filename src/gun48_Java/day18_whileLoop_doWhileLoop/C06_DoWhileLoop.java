package gun48_Java.day18_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi=0;
        int negSayiAdedi=0;
        int pozSayilarTop=0;

        do{
            System.out.println("Lütfen toplamak uzere pozitif tamsayi giriniz.");
            sayi=scan.nextInt();
            if(sayi>0){
                pozSayilarTop+=sayi;
                pozSayiAdedi++;
            }else if (sayi<0){
                System.out.println("Negatif sayi giremezsiniz");
                negSayiAdedi++;
            }


        }while(sayi!=0);

        System.out.println(pozSayiAdedi+" adet pozitif sayi girdiniz , toplamlari : "+pozSayilarTop);
        System.out.println(negSayiAdedi+" adet negatif sayi girdiniz ancak onlar toplama dahil edilmedi");



    }
}
