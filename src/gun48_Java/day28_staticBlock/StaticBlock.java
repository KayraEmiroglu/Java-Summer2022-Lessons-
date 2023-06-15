package gun48_Java.day28_staticBlock;

public class StaticBlock {

    static int sayi;
    static{

        /*
         Static block class uyelerinin tamamindana once calisir.
         (maain method'dan bile once)

         Static block class olusturuldugunda calisir.
         genellikle de class'la iligi on ayarlamalar
         veya static variable'lara deger atamaka icin kullanilir.

         static block'larin class icerisinde nerede oldugu onemli degildir.
         once static block'lar calisir.

         birden fazla static block varsa, yukaridan assagi dogru calisir.
         */
        System.out.println("static blok calisti");
        sayi=10;
    }





    public static void main(String[] args) {
        System.out.println("Main method calisti.");
        System.out.println(sayi);

    }
    static {
        System.out.println("Main method altindaki static block calisti");
    }


}
