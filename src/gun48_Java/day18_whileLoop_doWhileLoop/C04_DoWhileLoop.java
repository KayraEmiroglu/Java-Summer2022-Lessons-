package gun48_Java.day18_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
           Kullanicidan tam sayilar alin
           kullanici cift sayi girdigi muddetce sayilari yazdirin
           tek sayi girdiginde islemi bitirin
         */



        Scanner scan=new Scanner(System.in);
        int sayi=0;

        //while ile yaparsak
        /*
           Loop'larda kullancagimiz variable'lari loop'tan once olusturmaliyiz.
           while loop'da , loop'dan once olusturdugumuz bu variable'a atayacagımız
           degeri iyi dusunmemiz gerekiyor.
         */

      //  while(sayi%2==0){
      //      System.out.println("Lutfen bir sayi giriniz");
      //      sayi =scan.nextInt();
      //      if(sayi%2==0) System.out.println("Girilen sayi cift : "+ sayi);
      //      else System.out.println("Girilen sayi tek,benden bu kadar");
      //  }

        //do while loop ile yapalim
        //do while loopta onceden olusturulan variable'a hangi deger atandıgının
        //hic bir onemi yok , kodumuz her durumda calısır
        //do-while'in dez avantaji
        //ilk calistirma kontrol yapılmadan oldugu icin loopun bodysinde yanlis bir
        //islem yapılmamasına dikkat etmek gerekir.

        do{
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if(sayi%2==0) System.out.println("Girilen sayi cift : "+ sayi);
            else System.out.println("Girilen sayi tek,benden bu kadar");
        }while(sayi%2==0);


    }
}
