package gun48_Java.day04_dataCasting;

public class C01_DataCasting {

    public static void main(String[] args) {

        char harf ='a';
        char yeniHarf= (char)(harf+1);   //kod bu durumda önce sağdaki işlemi yapar.
                                         //char yeniHarf = 97+1->98
                                         //char bir variaable 98 olaamayacağı için java hata verir.
        System.out.println(yeniHarf);

        /*
        Bazen bir variable'a oluşturulduğu data türü dışından
        değer atanabilir.Bunlardan bazısını Java otomatik olarak
        kabul eder.
        Java eğer bu değer atamasında sorun olusacağını
        (data kayıplarının olabileceğini veya datanın başkalaşabileceği)
        görürse bu durumda otomatik olarak bu atamayı kabul etmez.
        Sizden eğer bu atamayı istiyorsanız sorumluluğu almanızı bekler.
         */

        int sayi1=(int)7.3;
        System.out.println("sayi1 : "+ sayi1);//7

        double sayi2=10;
        System.out.println("sayi2 :"+ sayi2);// 10.0

        int sayi3='c';
        System.out.println("sayi3 :"+ sayi3);// 99

        char harf2=98;
        System.out.println("harf2 :"+ harf2);// b

    }
}
