package gun48_Java.day35_inheritancedaConstructorKullanimi;

public class AChild extends AParent {

    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";

    AChild(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {

        //AGrandParent gp1=new AGrandParent();
        // bu objeyi olusturmak icin Grandpa cons. calisir,
        // Parent veya Child constructor calismaz.
        AChild child1=new AChild();
        child1.grandpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        //child1 objesi icin Child constructor calisir
        /*
         Java'da bir class'i kullanabilmek icin
         o class'dadn obje olusturur, dolayisiyla
         o class'in constructor'ini kullanirdik.

         Java inheritance'da parent class'lardaki
         ozellikleri kullanabilmek icin o class'larin
         consturctor'larini otomatik calistiran bir yapi kurmustur.

         Ornegin biz child class'inda
         Child class'indan bir obje olusturmak istedigimizde
         Child constructor'ini kullaniriz.

         Java Child(){} gordugunde once parent'in constructor'ini
         calistirmam lazim der.
         --> buradan Parent cons'a gider.
         Parent class'inda Parent(){} gorunce
         once bunun parent'inin yani GrandParent cons. calismasi gerekir,der.

         Boylece extends keywordd olmayan class'a kadar gider
         ve oradan baslayarak tum constructorlari assaği doğru calistirir.

         */


    }
}
