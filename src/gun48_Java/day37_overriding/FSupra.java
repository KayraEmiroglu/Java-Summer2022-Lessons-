package gun48_Java.day37_overriding;

public class FSupra extends EToyota{

    void yakit(){
        System.out.println("Supra benzin kullanir.");
        /*
         Private method'lar override edilemez.
         Eger Child class'da parent class'daki private method ile
         ayni signature'da bir method olusturursaniz
         bu overriding method OLMAZ.

         */
    }


    @Override
    void motor(){
        System.out.println("Sırali 6 silindir 2JZ kullanır ");
    }
    /*
      Override notasyonu Javaya bir gorev verir.
      -Java, bu notasyonla birbirine bagli olan iki method'u
      surekli kontrol eder.
      Eger parent class'daki overriden method'u silerseniz
      CTE verir.

      @Override notasyonu kullanmak mecburi degildir.
      Eger Overriding method silinrse , kodun CTE vermesini istersek
      @Override notasyonu kullanmaliyiz.
     */


}
