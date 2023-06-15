package gun48_Java.day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {

        /*
         Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
         Kullaniciya index sorup, o index'deki urunu yaazdiran bir program
         hazirlayalim
         Kullanici urun sayisindan buyuk bir index girerse
         exception try cath yapalim


         */

        String[] urunler={"Nutella","Cokokrem","sut","Cay","Findik"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz urunun sira no giriniz.");

        try {
            int istenenIndex= scan.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        /*
         catch blogunun onundeki parantezde exception class'inin ismi ve
         yaninda yakalanan exception'i atadigimiz variable'in ismi olur (e)

         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz bu objeyi kullanabilirsiniz.
         ger exception ile ilgili kullaaniciya bilgi verme ihtiyacı yoksa
         e kullaanilmasa da kod calisir.
         */

    }
}
