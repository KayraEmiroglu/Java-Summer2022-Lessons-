package gun48_Java.day19_scope;

public class C01_InstanceVariables {
    /*
       class icerisinde heryerden kullanmak istediginiz variablelari
       class levelda (Class'ın icinde ama methodların dısında)
       genellikle class level variable'lar class'ın basinda olusturulur.(sart degil)

        class leveldaki variablelar icin 2 scope vardir.
        1- static variables(Class variableları da denir.)
        2- instance (static olmayan)variables(obje variable denir).
     */

    int instSayi=20;//staatic olmayıp class levelda oldugu icin instance variabledir.

    public static void main(String[] args) {
        int sayi=10;
        /*
           instance variables static olmadigi icin static klup'e uye main methoddan
           direk cağıramayiz.
           instance variable'ların diger adi object variable'dir.
           dolayısıyla obje olusturursanız instance variable'ları
           heryerden kullanabilirsiniz.
         */
        C01_InstanceVariables obje1= new C01_InstanceVariables();
        System.out.println("obje1 degismeden once : "+obje1.instSayi);// 20
        obje1.instSayi=30;
        System.out.println("obje1 degistikten sonra : " + obje1.instSayi);//30

        C01_InstanceVariables obje2= new C01_InstanceVariables();
        System.out.println("obje2 degismeden once : "+obje2.instSayi);// 20
        obje2.instSayi=25;
        System.out.println("obje2 degistikten sonraa : "+obje2.instSayi);//25

        C01_InstanceVariables obje3= new C01_InstanceVariables();
        System.out.println("obje3 degismeden once : "+obje3.instSayi);// 20
        /*
           Her obje olustugunda instance(obje) variable'inin ilk atanan degerini
           alir.
         */

    }

    public static void staticMethod(){
        // System.out.println(sayi);
        /*
           Bir methodun icerisinde olusturulan variable,
           sadece o methodun icinden kullanılabilir.
           (Local variables)
         */

        /*
        instSayi=30;
        instance variable'lara main method dısındaki static methodlardan da direk
        ulasamayiz.
        obje olusturursak ulasabiliriz.
         */
        C01_InstanceVariables obje4= new C01_InstanceVariables();
        System.out.println("obje4 degismeden once : "+obje4.instSayi);// 20


    }
    public void staticOlmayanMethod(){
        System.out.println(instSayi);
        /*
           instance variable'lar class icerisindeki static olmayan methodlardan
           direk kullanilabilir.
         */
    }


}
