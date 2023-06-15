package gun48_Java.day27_staticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {
        /*
         class level'da iki tur variable olusturabiliriz.
         static(class) variable
         instance(obje) variable

         static variable'lar tum class'tan kullanılabilirken
         instance olanlar sadece static olmayan method'lardan dire kullanilabilir.

         instance variable'lara static method'dan ulasamak istersek
         obje olusturmamiz gerekir.

         instance variable'lar obje variable oldugu icin
         herhangi bir satirda instance variable'in degerinin ne oldugunu
         bulmak icin
         ****obje olusturulan satirdan itibaren incelenmelidir.

         static variable'lar class variable'i oldugu icin herhangi bir satirda
         static variable'in degerini bulmak icin
         ****class'in basindan itibaren kod incelenmelidir.

         */

        C01 obj1=new C01();
        System.out.println("obj1'in rakam degeri :"+obj1.rakam);//5
        System.out.println("obj1'in sayi degeri :"+ sayi);//10

        obj1.rakam++;
        sayi++;
        System.out.println("1 arttirdiktan sonra obj1'in rakam degeri :"+obj1.rakam);//6
        System.out.println("1 arttırdıktan sonra obj1'in sayi degeri :"+ sayi);//11

        C01 obj2=new C01();
        System.out.println("obj2'in rakam degeri :"+obj2.rakam);//5
        System.out.println("obj2'in sayi degeri :"+ obj2.sayi);//11

    }
}
