package gun48_Java.day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {


        int a=1000;
        int b=50;
        int sayac=1;

        while(sayac<1000){
            /*
             try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
             islemleri yazmak icin kullanilir.

             catch'den sonraki parantez karsilasmayi bekledigimiz exception
             turunu Javaya soylemek icin kullanilir.

             catch blogu : Javaya soyledigimiz exception(istisnaai durum)
             gerceklesirse Java'nin yapmasini istedigimi  islem.

             catch blogunun onundeki paranteze karsilasmayi bekledigimiz
             exception'i yazabilir veya her turlu exception'da
             devreye girmesini istiyorsak tum exception'larin parent'i olan
             Exception olan yazabiliriz.

             */


            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu");

            }


            b--;
            sayac++;
        }
    }
}
