package gun48_Java.day03_scanner;

public class C01_AsciiTable {

    public static void main(String[] args) {

        //Bir tamsayi , birde char değişken oluşturup toplamını yazdırın

        int sayi=10;
        char harf ='a';
        String str ="banan";
        System.out.println(sayi*harf);
        System.out.println(sayi+harf); // 10 a değil ->107
        System.out.println(str+harf); //banana oldu
        System.out.println(harf+2);
        System.out.println(str+sayi+harf);//banan10a
        System.out.println(""+sayi+harf);
        /*
         1-char data türü işleme girdiği değişkenin türüne göre
         farklı davranabilir.Eğer matematiksel işleme variable sayısal
         sayısal bir değerse sayi gibi davranir.
         2- str+ harf  -> String variable çok güçlüdür hangi data
         türü ile işleme girerse girsin diğer datayı kendine benzetir.


         */
        char deger='1';
        System.out.println(deger + harf);


    }
}
