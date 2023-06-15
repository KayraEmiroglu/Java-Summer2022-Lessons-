package gun48_Java.day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*
        Verilen bir array’in istenen bir elemani icerip icermedigini kontrol edip,
        bize true veya false sonucu donen bir method olusturun
         */

        String [] isimler={"Basak","Nurullah","Fatih","Adem","Enes"};
        Scanner scan =new Scanner(System.in);
        System.out.println("Aradaginiz ismi yaziniz");
        String arananKelime=scan.nextLine();

        boolean sonuc= contains(isimler,arananKelime);
        System.out.println(sonuc);

    }

    public static boolean contains(String[] isimler, String arananKelime) {
        boolean sonucMethod=false;

        for (int i = 0; i < isimler.length ; i++) {
            if (isimler[i].equalsIgnoreCase(arananKelime)){
                sonucMethod=true;
            }
        }


        return sonucMethod;
    }
}
