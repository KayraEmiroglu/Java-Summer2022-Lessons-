package gun48_Java.day20_arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {

        int sayi=10;
        //System.out.println(sayiMethod); sayiMethod method1'de olusturulmus local
        //variable'dir.

        for (int i = 0; i <20 ; i++) {
            System.out.println(i);

        }

        // System.out.println(i); i loop'da olusturulmus local variable'dir.
        //Sadece loop icerisinde kullanilabilir.

      // static int sayiStatic=20; static keyword sadece class level'da kullanilabilir.
        //method'larin icerisinde static variable TANIMLANAMAZ.
        //STATİC VAARİABLE CLASS İCERİSİNDE HER YERDE KULLANILABİLİR.

    }

    public static void method1(){
        //System.out.println(sayi); sayi main method'da olusturulmus local bir
        //variable'dır.Sadece main method'da gecerlidir.

        int sayiMethod=20;

    }
}
