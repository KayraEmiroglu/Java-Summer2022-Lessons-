package gun48_Java.day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManipulation {
        /*
    Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
        */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");
        String sifre=scan.nextLine();
        int kontrol = 0;
        if(sifre.charAt(0)>='A'  &&  sifre.charAt(0)<='Z'){
            kontrol++;
        }else{
            System.out.println("Ilk harf buyuk harf olmali");
        }

        if(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else{
            System.out.println("Son harf kucuk harf olmali");
        }

        if (!sifre.contains(" ")){
            kontrol++;
        }else {
            System.out.println("Bosluk icermemeli");
        }
        if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("Sifre 8 harften uzun olmali");
        }
        if (kontrol==4){
            System.out.println("Sifreniz Kaydedildi");
        }else {
            System.out.println("Islem basarisiz.Lutfen yeni bir sifre giriniz!");
        }



    }


}
