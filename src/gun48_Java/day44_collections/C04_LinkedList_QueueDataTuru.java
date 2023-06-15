package gun48_Java.day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> ll3=new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");
        /*
         Queue kuyruk demektir, sira önemlidir.
         gelen sona gelir, giden baştan gider.
         */
        System.out.println(ll3);//[Adem, Zeynep, Hpolat, Kadir]

        ll3.remove();
        ll3.remove("Hpolat");
        System.out.println(ll3);//[Zeynep, Hpolat, Kadir]

        System.out.println(ll3.element());//Zeynep
        System.out.println(ll3.peek());//Zeynep

        Queue<String> ll4=new LinkedList<>();

        //System.out.println(ll4.element());//exception verir
        System.out.println(ll4.peek());//null

        ll3.offer("Kara");
        System.out.println(ll3);//[Zeynep, Kadir, Kara]
        //kuyruk önemli oldugu icin eklemeler sondan
        //silmeler bastan

        ll3.poll();
        System.out.println(ll3);//[Kadir, Kara]

        //System.out.println(ll4.remove()); boş listede hata verir.
        System.out.println(ll4.poll());//null

    }
}
