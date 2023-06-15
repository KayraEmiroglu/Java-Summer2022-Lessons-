package gun48_Java.day19_scope;

public class C02_StaticVariables {

     static int staticSayi=10;
     String isim="Kayra";

     static int degersizStaticVar;
     int degersizInstVar;

     /*
       Class level'daki variable'lara değer atamasakta Java kabul ediyor.
      */

    public static void main(String[] args) {
        /*
          Bir variable static olusturulduysa objeler icin degil class icin
          gecerlidir.
         */
        System.out.println(staticSayi);//10
        staticMethod();//10
        staticSayi=12;
        System.out.println(staticSayi);//12


        C02_StaticVariables obje1= new C02_StaticVariables();

        obje1.staticOlmayanMethod();//12
        System.out.println(staticSayi);//20
        /*
           instance bir variable'in degerini bulmak icin objenin olusturulmasindan
           itibaren istenen satira kadar kodu etmeliyiz.

           Static variable'da ise classin en basindan baslayarak istenen satira kadar
           kodu takip edip static variable'in son degerini bulmamiz gerekir.
         */

    }

    public static void staticMethod(){
        System.out.println(staticSayi);
    }

    public void staticOlmayanMethod(){
        /*
           Static vaariable'lar class icerisinden her yerden ulasilabilir.
           static olsun veya olmasin tum methodlara static variable'ları
           ve degistirebilirler.
           Farklı methodlarda static variable'in hangi degeri alacagını bilmek
           istiyorsak class'in basindan itibaren kodun calismasini takip etmeliyiz
           Method ne zaman cagirilirsa o anki static variable degerini method'da
           kullanabiliriz.
         */

        System.out.println(staticSayi);
        staticSayi=20;
    }

}
