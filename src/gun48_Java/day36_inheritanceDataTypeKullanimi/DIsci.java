package gun48_Java.day36_inheritanceDataTypeKullanimi;

import java.util.*;

public class DIsci extends BMuhasebe {
    int saatUcreti = 11;
    int gunlukMesai = 7;

    protected void maasIsci() {
        System.out.println("Isciler : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigortaIsci() {
        System.out.println("Isciler %70 indirimli ozel sigorta yaptırabilir.");
    }

    public static void main(String[] args) {
        BMuhasebe isci1 = new DIsci();//TODO arraylist icreisine BMuhasebe koy.
        /*
         Bir obje olusuturulurken
         Data turu ve constructor ayni class'dan ise
         direk o class'a gidiyorduk.

         Eger data turu ve constructor farkli ise
         Obje constructor'in oldugu class'in objesidir.
         ancak, bizden istenen
         Isci class'indaki spesifik ozelliker degil
         Bir iscinin muhasebe class'indaki tum aclisanlarla beraber
         sahip oldugu genel ozellikleri yazdirir


         Iscinin muhasebe class'inda butun calisanlarla birlikte olan
         haklarini görmek isteriz.

         */
        System.out.println(isci1.gunlukMesai);// Muhasebe 8
        System.out.println(isci1.saatUcreti);// Muhasebe 10
        isci1.maas();//M
        isci1.ozelSigorta();//M
        isci1.sigorta();//P
        System.out.println(isci1.isim);//P
        System.out.println(isci1.soyisim);//P
        System.out.println(isci1.departman);//P

        APersonel isci2 = new DIsci();
        // System.out.println(isci2.gunlukMesai);// Muhasebe 8
        // System.out.println(isci2.saatUcreti);// Muhasebe 10
        // isci2.ozelSigorta();//M
        isci2.sigorta();//P
        System.out.println(isci2.isim);//P
        System.out.println(isci2.soyisim);//P
        System.out.println(isci2.departman);//P

        /*
         Eger Data turu olan class'da aradigimiz ozellik yoksa
         varsa onun parent'ina gidebilir
         ama child'a donus olmaz.
         Aradigi ozelligi bulamazsa CTE verir.
         */

        List<String> list= new ArrayList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();
        /*
         Hepsi LinkedList olsa da
         list1 list gibi davranir.
         list2 deque gibi davranir.
         list3 queue gibi davranir.
         */




    }
}
