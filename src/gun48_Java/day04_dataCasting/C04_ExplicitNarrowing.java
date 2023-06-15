package gun48_Java.day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=-132;
        byte sayi2= (byte) sayi1;
        System.out.println(sayi2);

        /*
        Genis data turundeki değer, dar data turundeki variable'a atamak isterseniz
        Java sizin geniş data türündeki degerin, dar data turunun sınırlarına uyup uymayacağını
        çalıştırana kadar bilemez ama Java Risk almaz!.

        Riski sıfıra indirmek için burda bir sorun olursa
        sorumluluğu kabul etmenizi bekler.Bunun için değerin
        önüne parantezi içerisinded istediğimiz data türünü yazmamız
        yeterlidir.

        Bu riski üstlendiğimizde , 3 durum oluşabilir
        1- Bizim değerimiz, dar kalıp değerlerine uygun olursa hiç bir kayıp olmadan cast olur
        2- double bir sayiyi int'a cast etmek gibi durumlarda data kaybı yaşayabilirsiniz.
        3- geniş kaliptan değeri dar kalıba koyduğunuzda , sinirlari asan durumlarda
            veri başkalaşabilir.
         */

    }
}
