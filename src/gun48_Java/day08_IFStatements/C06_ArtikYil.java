package gun48_Java.day08_IFStatements;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yılınızı giriniz");
        int yil = scan.nextInt();


        if (yil % 4 != 0) {
            System.out.println("Artık yil değil");
        }else if(yil%100!=0){
            System.out.println("artik yil ");
        }else if(yil%400!=0){
            System.out.println("artik yil değil");
        }else  {
            System.out.println("artık yil");
        }


    }
}