package gun48_Java.day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {

        /*
        Bir listedeki elementleri iterator kullanarak baastan sonra yazdirin.
         */

        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        //sondan basa gelebilmek icin once sona gitmek lazim.

        ListIterator li1 = liste.listIterator();
        while (li1.hasNext()){
            li1.next();
        }
        while (li1.hasPrevious()){
            System.out.println(li1.previous());
        }



    }
}
