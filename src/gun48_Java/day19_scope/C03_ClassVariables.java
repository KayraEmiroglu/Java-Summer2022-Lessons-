package gun48_Java.day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
      /*
        Farkli bir classta calisirken her hangi bir class adini yazip .'ya basarsak
        Adini yazdiğimiz classtaki tum STATIC class uyelerini gorebilir ve
        kullanabiliriz.
       */

        C02_StaticVariables.staticMethod();//10
        System.out.println(C02_StaticVariables.staticSayi);//10
        System.out.println(C02_StaticVariables.degersizStaticVar);//0

        /*
           Class level variable'lara deger atayip atamamak bize kalmistir.
           istersek deger atamasi yapariz, istemezsek deger atamayiz.
           Eger deger atamissak java atadigimiz o degeri kabul eder.
           Deger atamazsak Java bu variable'lara default bir deger atamasi yapar.
           int-->0
           String-->null
           boolean-->false
           char-->'' (hiclik)
          */
        /*
           Baska class'daki instance variable'lara obje olusturarak ulasabiliriz.
         */

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod();//10
        //bu method icinde staticSayi=20 oldu
        System.out.println(C02_StaticVariables.staticSayi);//20

        System.out.println(obje1.isim);//Kayra
        System.out.println(obje1.degersizInstVar);//0

        /*
           Farklı bir class'dan C02 classindan method ve variable'lari kullandıgımda
           C02 class'inin tamami degil sadece benim cagirdigim class uyeleri calisir.

         */

}
}
