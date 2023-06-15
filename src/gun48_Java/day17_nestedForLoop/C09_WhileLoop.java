package gun48_Java.day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basaarili sifre girinceye kadar tekraar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan = new Scanner(System.in);
        String sifre="";
        boolean sifreBasariliMi=false;
        int kontrol = 0;

        while(!sifreBasariliMi){
            //Kullanicidan bir sifre alalim
            System.out.println("Lütfen bir şifre giriniz");
             sifre=scan.nextLine();
            //4 kontrolü yapalim, her gecen kontrol icin kontrol variable'ını bir arttiralim
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
            if(kontrol==4){//tum kontrollerden gecmis demektir.
                System.out.println("Sifreniz Kaydedildi");
                sifreBasariliMi=true;
            }else {//sifre basaarisiz
                //tekrar basa donecek
                // kontrol variable sifirlanmali
                System.out.println("Islem basarisiz.Lutfen yeni bir sifre giriniz!");
                kontrol=0;
            }

        }


    }
}
