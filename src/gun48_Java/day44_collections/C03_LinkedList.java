package gun48_Java.day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class C03_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>();
        List<String> ll2=new LinkedList<>();
        Queue<String> ll3=new LinkedList<>();
        Deque<String> ll4=new LinkedList<>();

        //List ile başlıyalım.
        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2); //[Berk, Done, Enes, Ayse]
        System.out.println(ll2.remove(3));//Ayse
        //Eger Listemiz Integer elementlerden olusuyorsa
        //Direk sayi yazarsak index olarak kabul eder.
        //Bir variable'a atama yapara ve remove'da o variable'in ismini yazarsak
        //obje olarak kabul eder.
        System.out.println(ll2.remove("Kemal"));//false
        System.out.println(ll2.isEmpty());//false

        ll2.set(1,"Serap");
        System.out.println(ll2);//[Berk, Serap, Enes]
        ll1.add("Berk");
        ll1.add("Kemal");
        System.out.println(ll1);//[Berk, Kemal]
        ll2.retainAll(ll1);
        /*
        ll2'deki tum elementleri ll1 ile kaarsilastirir.
        ll1'de olmayanlari siler.
         */

        System.out.println(ll2);//[Berk]
    }
}
